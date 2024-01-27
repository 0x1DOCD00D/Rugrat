package edu.uta.cse.proggen.start;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import edu.uta.cse.proggen.classLevelElements.Method;
import edu.uta.cse.proggen.classLevelElements.MethodSignature;
import edu.uta.cse.proggen.configurationParser.ConfigurationXMLParser;
import edu.uta.cse.proggen.nodes.Node;
import edu.uta.cse.proggen.packageLevelElements.ClassGenerator;
import edu.uta.cse.proggen.packageLevelElements.DBUtilGenerator;
import edu.uta.cse.proggen.packageLevelElements.InterfaceGenerator;
import edu.uta.cse.proggen.util.ProgGenUtil;

/**
 * Starting point of the ProgGen tool.
 *
 * @author Ishtiaque_Hussain
 *
 */
public class Start 
{	
	public static void main(String[] args) 
	{
		/* List of generated class objects: ClassGenerators */		
		ArrayList<ClassGenerator> 		list 			= new ArrayList<ClassGenerator>();
		ArrayList<InterfaceGenerator>	interfaceList	= new ArrayList<InterfaceGenerator>(); 
		
		int numberOfClasses = 0;
		int maxInheritanceDepth = 0;
		int noOfInheritanceChains = 0;
		int noOfInterfaces = 0;

		/* Set of generated classes, it's updated in ClassGenerator.generate() */
		HashSet<String> generatedClasses = new HashSet<String>();
		HashSet<String> preGeneratedClasses = new HashSet<String>();

		try
		{
			String className = ConfigurationXMLParser.getProperty("classNamePrefix");
			int totalLoc = ConfigurationXMLParser.getPropertyAsInt("totalLOC");

			numberOfClasses = ConfigurationXMLParser.getPropertyAsInt("noOfClasses");
			maxInheritanceDepth = ConfigurationXMLParser.getPropertyAsInt("maxInheritanceDepth"); // e.g. 3
			noOfInheritanceChains = ConfigurationXMLParser.getPropertyAsInt("noOfInheritanceChains"); // 2 => "A-B-C" ; "E-F-G"
			noOfInterfaces = ConfigurationXMLParser.getPropertyAsInt("noOfInterfaces");

			if(numberOfClasses < (maxInheritanceDepth * noOfInheritanceChains)) 
			{
				System.out.println("Insufficent number of classes. Should be atleast: " 
						+ maxInheritanceDepth*noOfInheritanceChains);
				System.exit(1);
			}

			LinkedHashSet<String> classList = new LinkedHashSet<String>();

			for(int i=0; i<numberOfClasses; i++)
			{
				classList.add(className+i);
			}

			ArrayList<ArrayList<Integer>> inheritanceHierarchies = new ArrayList<ArrayList<Integer>>();

			inheritanceHierarchies = ProgGenUtil.getInheritanceList(
					noOfInheritanceChains, 
					maxInheritanceDepth, 
					numberOfClasses
					);

			if (ProgGenUtil.numberOfThreadedClasses > numberOfClasses) {
				//Nischit:Rather than exit the program, type out a msg and readjust the number of threaded classes to implement
				ProgGenUtil.numberOfThreadedClasses = numberOfClasses;
				System.out.println("Number of thread implementing classes exceed total number of classes to generate. It has now been set to the total number of classes");
			}

			for(int i=0,numberOfThreadedClasses = 0; i<numberOfClasses; i++)
			{
				//Ishtiaque: All classes have equal number of variables, methods, etc. Should we change it?	
				// classes are like A1, A2, etc where A=<UserDefinedName> 
				//Bala: All such cases are handled in the ClassGenerator. It generates arbitrary number of
				// fields, methods. Only constraint is it should override all the methods of the interfaces
				// it implements.
				Random random = new Random();
				boolean implementRunnable = false;
				if (numberOfThreadedClasses < ProgGenUtil.numberOfThreadedClasses && random.nextBoolean()) {
					implementRunnable = true;
					numberOfThreadedClasses ++;
				}
				else if ((numberOfClasses - (i)) <= (numberOfThreadedClasses) && numberOfThreadedClasses < ProgGenUtil.numberOfThreadedClasses ) {
					implementRunnable = true;
					numberOfThreadedClasses ++;
				}
				list.add( new ClassGenerator(
						className + i, 
						totalLoc/numberOfClasses,
						null, implementRunnable) 
						);
			}

			File directory = new File(
					"TestPrograms" + File.separator +
					"com" + File.separator +
					"accenture" + File.separator + "lab" + 
					File.separator + "carfast"
					+ File.separator + "test");

			if(!directory.exists())
			{
				System.out.println(directory.mkdirs());
			}

			for(int i=0; i<noOfInterfaces; i++)
			{
				InterfaceGenerator generator = new InterfaceGenerator(
						className+"Interface"+i, 
						list);
				interfaceList.add(generator);
				writeToFile(generator);
			}

			establishClassRelationships(inheritanceHierarchies, list);

			establishClassInterfaceRelationships(interfaceList, list);
		}
		catch (NumberFormatException e) 
		{
			System.out.println("Please enter integer values for arguments that expect integers!!!");
			e.printStackTrace();
			System.exit(1);
		}

		//do pre-generation for classes
		//pre-generation determines the class members variables and method signatures
		for(ClassGenerator generator : list)
		{
			generator.preGenerateForMethodSignature(list, preGeneratedClasses);
		}

		for(ClassGenerator generator : list)
		{
			//Ishtiaque: How can 'generatedClasses' contain any of the ClassGenerator objects from the list? 
			//Bala: classes are generated semi-recursively. The classes will invoke class generation on the
			//super class. The current class will be generated only after all its ancestor classes are generated.
			//We do not want to regenerate the ancestor classses and make stale the information used by its sub-classes
			//based on the earlier version.
			if(!generatedClasses.contains(generator.getFileName()))
			{
				//call generate to construct the class contents
				generator.generate(list, generatedClasses, preGeneratedClasses);
			}
			writeToFile(generator);
		}

		//generate DBUtil only if useQueries is TRUE
		if(ProgGenUtil.useQueries)
		{
			DBUtilGenerator dbUtilGenerator = new DBUtilGenerator();
			writeToFile(dbUtilGenerator);
		}

		//write the reachability matrix
		ArrayList<Method> methodListAll = new ArrayList<Method>();
		for(ClassGenerator generator : list)
		{
			methodListAll.addAll(generator.getMethodList());
		}

		StringBuilder builder = new StringBuilder();
		builder.append("Name, ");

		for(Method method : methodListAll)
		{
			builder.append(
					method.getAssociatedClass().getFileName() + "." + method.getName());
			builder.append(", ");
		}
		builder.append("\n");

		for(Method method : methodListAll)
		{
			builder.append(method.getAssociatedClass().getFileName() 
					+ "." + method.getName());
			builder.append(", ");
			for(Method calledMethod : methodListAll)
			{
				if(method.getCalledMethodsWithClassName().contains(
						calledMethod.getAssociatedClass().getFileName() + "." + calledMethod.getName()))
				{
					builder.append("1, ");
				}
				else
				{
					builder.append("0, ");
				}
			}
			builder.append("\n");
		}
		writeReachabilityMatrix(builder.toString());

		//author:Ramya Kannan
		//creating dependency structure matrix (for every method in every class Vs every class ) will have a 1 if called, 0 if not called
		StringBuilder depDatabuilder = new StringBuilder();
		depDatabuilder.append("Name, ");

		for(ClassGenerator c : list)
		{
			depDatabuilder.append(c.getFileName());
			depDatabuilder.append(", ");
		}
		// logic
		for(Method method : methodListAll)
		{
			depDatabuilder.append("\n");
			depDatabuilder.append(method.getAssociatedClass().getFileName() 
					+ "." + method.getName());
			depDatabuilder.append(", ");
			LinkedList<String> l = method.getThreadData(method.getAssociatedClass().getFileName()+method.getName()) ;
			if(l==null) {
				// append 0 to all the classes and move to the next method
				for(ClassGenerator c : list){
					depDatabuilder.append("0, ") ;	
				}
			}
			else{
				ArrayList<ClassGenerator> c = list ;
				int flag = l.size()- 1 ;
				for(int i=0 , j=0; j < c.size() ;j++ ){  // i index of linked list , j index of class
					if(i <= flag) {
						if(c.get(j).getFileName()== l.get(i).toString()){
							depDatabuilder.append("1, ");
							i++ ;
						}
						else{
							depDatabuilder.append("0, ");
						}
					}
					else{
						//	if(j < c.size() ){
						for(int k = j ; k< c.size() ;k++) {
							depDatabuilder.append("0, ") ;
							j =k ;
						}
						//	}

					}
				}
			}	
		}

		// write Dependency Matrix
		writeDependencyMatrix(depDatabuilder.toString()) ;
		//---------------------------------------------------------
		// creating deadlock detection matrix ( for every method in every class Vs every method in every class ) 
		StringBuilder dlockDatabuilder = new StringBuilder();
		dlockDatabuilder.append("Name, ");

		for(Method method : methodListAll)
		{
			dlockDatabuilder.append(
					method.getAssociatedClass().getFileName() + "." + method.getName());
			dlockDatabuilder.append(", ");
		}
		// logic
		for(Method methodRow : methodListAll)
		{
			dlockDatabuilder.append("\n");
			dlockDatabuilder.append(methodRow.getAssociatedClass().getFileName() 
					+ "." + methodRow.getName());
			dlockDatabuilder.append(", ");
			for(Method methodColumn : methodListAll )
			{
				if(methodRow.getName() == methodColumn.getName()) {// check if the name is only the method name or with class name
					dlockDatabuilder.append("0, ") ;
				}
				else{
					if(methodRow.getCalledMethodsWithClassName().contains((methodColumn.getAssociatedClass()+ "." + methodColumn.getName()))) // check how it is stored in the Hash set
						dlockDatabuilder.append("1, ");
					else
						dlockDatabuilder.append("0, ");
				}
			}
		}
		// writing deadlock detection matrix
		writeDeadLockDetectionMatrix(dlockDatabuilder.toString());
		
		// Detecting Deadlock and writing the output 
		System.out.println("");
		System.out.println("DeadLock Detection Report");
		ArrayList<Method> threadedMethods = new ArrayList<Method>(); // from nonRunnable Classes
		ArrayList<Method> nonThreadedMethods = new ArrayList<Method>(); // from Runnable Classes

		for(ClassGenerator generator : list)
		{
			if(!(generator.implementsThread())) threadedMethods.addAll(generator.getMethodList());
			else nonThreadedMethods.addAll(generator.getMethodList()) ;

		}
		for(Method m : threadedMethods){
			ArrayList<Node> threadlist = new ArrayList<Node>() ;
			threadlist = m.getThreadMethodsList() ;
			if(threadlist.size() > 1){
				for(int i =0 ; i < (threadlist.size()-1) ;i++){
					for(int j=i+1 ; j <threadlist.size() ;j++ ){
						if(threadlist.get(i).getInstanceName().toString() == threadlist.get(j).getInstanceName().toString() ){// => threads on the same object 
							HashMap<String,HashSet<String>> dlockMap  = new HashMap<String,HashSet<String>>();
							dlockMap = processDeadlockDetection(
									(getMethodFromSignature(nonThreadedMethods, threadlist.get(i).getRunMethodList())),
									(getMethodFromSignature(nonThreadedMethods, threadlist.get(j).getRunMethodList()))
									);
							
							if(!dlockMap.isEmpty()){
								System.out.println("Method               :" + m.getAssociatedClass().getFileName()+"."+m.getName());  
								System.out.println("Running Thread       :" + threadlist.get(i).getThreadName()  );
							
								for(String key : dlockMap.keySet()){
									System.out.println("Running Method       :"+key );
									for(String value : dlockMap.get(key)){
										System.out.println("Calls Method         :"+value + " <--------------  is locked by "  + threadlist.get(j).getThreadName() );
									}
								}
								System.out.println("");
								
							}

						}

					}
				}

			}

		}	
	}

	private static HashMap<String,HashSet<String>> processDeadlockDetection( ArrayList<Method> list1, ArrayList<Method> list2 ){
		Set<String> dlist = new HashSet<String>();
		HashMap<String,HashSet<String>> dlockMap  = new HashMap<String,HashSet<String>>(); 

		for(int i =0 ; i < list1.size() ; i++){
			for(int j=0 ; j < list2.size() ;j++) {		 
				if(list1.get(i).getCalledMethods().contains(list2.get(j).getMethodSignature()))
					dlist.add(list2.get(j).getName()) ;
			}
			if(!dlist.isEmpty()){
				
				dlockMap.put(list1.get(i).getName(), (HashSet<String>) dlist);
			}

		}
		
			return dlockMap ;
	}
	
	private static ArrayList<Method> getMethodFromSignature(ArrayList<Method> nonThreadedMethods,ArrayList<MethodSignature> siglist){
		ArrayList<Method> methodlist = new ArrayList<Method>();
		for(int i =0 ; i < siglist.size() ;i++){
			for(Method m : nonThreadedMethods){
				if(m.getMethodSignature() == siglist.get(i)){
					methodlist.add(m);
				}
			}
		}
		
		return methodlist; 
	}

	private static void writeDeadLockDetectionMatrix(String matrix)
	{
		FileOutputStream fos = null;
		BufferedOutputStream outstream = null;

		try
		{
			fos = new FileOutputStream(new File(
					"DeadLockDetectionMatrix.csv"));
			outstream = new BufferedOutputStream(fos);
			System.out.println("Writing DeadLock Detection matrix...");
			outstream.write(matrix.getBytes());
		}
		catch(Exception e)
		{
			System.out.println("Error writing DeadLock Detection matrix!");
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if (outstream != null) 
				{
					outstream.flush();
					outstream.close();
				}
			} 
			catch (IOException e) 
			{
				System.out.println("Error closing output filestream");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	private static void writeDependencyMatrix(String matrix)
	{
		FileOutputStream fos = null;
		BufferedOutputStream outstream = null;

		try
		{
			fos = new FileOutputStream(new File(
					"DependencyMatrix.csv"));
			outstream = new BufferedOutputStream(fos);
			System.out.println("Writing Dependency matrix...");
			outstream.write(matrix.getBytes());
		}
		catch(Exception e)
		{
			System.out.println("Error writing Dependency matrix!");
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if (outstream != null) 
				{
					outstream.flush();
					outstream.close();
				}
			} 
			catch (IOException e) 
			{
				System.out.println("Error closing output filestream");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	private static void writeReachabilityMatrix(String matrix)
	{
		FileOutputStream fos = null;
		BufferedOutputStream outstream = null;

		try
		{
			fos = new FileOutputStream(new File(
					"ReachabilityMatrix.csv"));
			outstream = new BufferedOutputStream(fos);
			System.out.println("Writing reachability matrix...");
			outstream.write(matrix.getBytes());
		}
		catch(Exception e)
		{
			System.out.println("Error writing reachability matrix!");
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if (outstream != null) 
				{
					outstream.flush();
					outstream.close();
				}
			} 
			catch (IOException e) 
			{
				System.out.println("Error closing output filestream");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}


	private static void writeToFile(DBUtilGenerator generator)
	{
		if(generator == null)
		{
			System.out.println("DBUtil generator null");
			return;
		}
		write("DBUtil", generator.toString());
	}

	private static void writeToFile(ClassGenerator generator)
	{
		if(generator == null)
		{
			return;
		}
		String filename = generator.getFileName();
		write(filename, generator.toString());
	}

	private static void writeToFile(InterfaceGenerator generator)
	{
		if(generator == null)
		{
			return;
		}
		write(generator.getName(), generator.toString());
	}

	private static void write(String filename, String contents)
	{
		FileOutputStream fos = null;
		BufferedOutputStream outstream = null;

		try {
			fos = new FileOutputStream(new File(
					"TestPrograms" + File.separator +
					"com" + File.separator +
					"accenture" + File.separator + "lab" + 
					File.separator + "carfast"
					+ File.separator + "test"
					+ File.separator + filename + ".java"));
			outstream = new BufferedOutputStream(fos);

			// To let the user know RUGRAT is working...
			System.out.println("Writing to file...." + filename);

			outstream.write(contents.getBytes());

			// Successfully written
			System.out.println("Successfully written.");
		} catch (FileNotFoundException e) {
			System.out.println("Error writing out class to .java file : "
					+ filename);
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			System.out
			.println("Error writing out class to .java file : "
					+ filename);
			e.printStackTrace();
			System.exit(1);
		} finally {
			try {
				if (outstream != null) {
					outstream.flush();
					outstream.close();
				}
			} catch (IOException e) {
				System.out.println("Error closing output filestream");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	private static void establishClassInterfaceRelationships(
			ArrayList<InterfaceGenerator> interfaceList,
			ArrayList<ClassGenerator> list)
	{
		int numberOfInterfaces = interfaceList.size(); 
		if(numberOfInterfaces == 0)
		{
			System.out.println("No interfaces generated!");
			return;
		}

		for(ClassGenerator generator : list)
		{
			ArrayList<InterfaceGenerator> generatorInterfaceList = generator.getInterfaceList();
			Random random = new Random();

			//A class can implement 0 or more interfaces.
			int numberOfInterfacesToImplement = random.nextInt(numberOfInterfaces);

			for(int j=0; j<numberOfInterfacesToImplement; j++)
			{
				InterfaceGenerator interfaceGenerator = interfaceList.get(random.nextInt(interfaceList.size()));
				if(generatorInterfaceList.contains(interfaceGenerator))
				{
					continue;
				}
				generatorInterfaceList.add(interfaceGenerator);
			}
		}
	}

	/*
	 * First class has itself as the superclass.
	 * E.g., A-B-C
	 * A has itself as it's superclass. A is superclass of B,...
	 */

	private static void establishClassRelationships(
			ArrayList<ArrayList<Integer>> inheritanceHierarchies, // E.g., {2,3,7}, {4, 5, 1}
			ArrayList<ClassGenerator> classes) 
	{
		for(ArrayList<Integer> hierarchy: inheritanceHierarchies)
		{
			int superClassIndex = -1;
			for(int index : hierarchy)
			{
				if(superClassIndex == -1)
				{
					superClassIndex = index;
					continue;
				}

				classes.get(index).setSuperClass(classes.get(superClassIndex));
				superClassIndex = index;
			}
		}
	}
}

