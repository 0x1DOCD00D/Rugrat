package edu.uta.cse.proggen.classLevelElements;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

import edu.uta.cse.proggen.classLevelElements.Type.Primitives;
import edu.uta.cse.proggen.expressions.FieldGenerator;
import edu.uta.cse.proggen.expressions.Literal;
import edu.uta.cse.proggen.expressions.VariableGenerator;
import edu.uta.cse.proggen.nodes.Node;
import edu.uta.cse.proggen.nodes.Operand;
import edu.uta.cse.proggen.packageLevelElements.ClassGenerator;
import edu.uta.cse.proggen.statements.DiskFileReader;
import edu.uta.cse.proggen.statements.ForLoop;
import edu.uta.cse.proggen.statements.IfElse;
import edu.uta.cse.proggen.statements.IfStmtIfStmt;
import edu.uta.cse.proggen.statements.Switch;
import edu.uta.cse.proggen.statements.FileWriter;
import edu.uta.cse.proggen.statements.UrlReader;
import edu.uta.cse.proggen.util.ProgGenUtil;
import edu.uta.cse.proggen.util.ProgGenUtil.CallType;

/**
 * This class represents a method in the generated class.
 * 
 * @author balamurugan
 *
 */
public class Method 
{
	private boolean 						isStatic;
	private int 							numberOfParams;
	private ClassGenerator					associatedClass;
	private	ArrayList<ClassGenerator> 		classList;
	private String							name;
	private	int								loc;
	private int								locPerMethod;
	private	Primitives 						returnType 	= ProgGenUtil.getRandomizedPrimitive();

	private	ArrayList<Variable>				parameterList = new ArrayList<Variable>();
	private HashSet<Variable>  				usedParameterList = new HashSet<Variable>();

	private String							methodBody;
	private	String							returnStatement;
	private int								maxNestedIfs;
	private int								nestedIfCounter;
	private int								maxAllowedMethodCalls;
	private int								methodCallCounter;
	private MethodSignature					methodSignature;
	private	HashSet<MethodSignature>   		calledMethods = new HashSet<MethodSignature>();
	private HashSet<String>					calledMethodsWithClassName = new HashSet<String>();
	private static HashMap<String,Boolean>	mapToPreventIndirectThreadRecursion = new HashMap<String,Boolean>();
	private  HashMap<String,LinkedList<String>> mapToPreventInfinteClassCalls = new HashMap<String,LinkedList<String>>() ;
	private  HashSet<String> clist = new HashSet<String>() ;	
	private  HashMap<String,LinkedList<String>> threadData = new HashMap<String,LinkedList<String>>() ;
	//private static LinkedList<Integer> threadList = new LinkedList<Integer>();
	
	private  ArrayList<Node> threadMethodslist = new ArrayList<Node>() ; // <thredname = instance of class= method list within run >
	private  int threadCount = 0 ; 


	/**
	 * Private constructor to create the method.
	 * 
	 * @param signature : signature of the method to be constructed

	 * @param associatedClass : class to which the method belongs
	 * @param classList : list of generated types
	 * @param locPerMethod : lines of code for this method
	 * @param maxNestedIfs : upper limit on the nested ifs.
	 * @param maxAllowedMethodCalls : upper limit on the method calls.
	 */
	private Method( MethodSignature signature, 
			ClassGenerator associatedClass,
			ArrayList<ClassGenerator> classList,
			int locPerMethod,
			int maxNestedIfs,
			int maxAllowedMethodCalls )
	{
		System.out.println("Constructing method..." + signature.getName());
		this.isStatic = signature.isStatic();
		this.numberOfParams = signature.getParameterList().size();
		this.associatedClass = associatedClass;
		this.classList = classList;
		this.name = signature.getName();
		this.loc = 0;
		this.nestedIfCounter = 0;
		this.locPerMethod = locPerMethod;
		this.maxNestedIfs = maxNestedIfs;
		this.maxAllowedMethodCalls = maxAllowedMethodCalls;
		this.methodCallCounter = 0;

		this.methodSignature = signature;
		this.parameterList = signature.getParameterList();
		this.returnType = signature.getReturnType();
		generateMethodBody();
		generateReturnStatement();
	}

	/**
	 * Static API to get a generated method.
	 * 
	 * @param signature
	 * @param associatedClass
	 * @param classList
	 * @param loc
	 * @param maxNestedIfs
	 * @param maxMethodCalls
	 * @return
	 */
	public static Method getMethod(MethodSignature signature, 
			ClassGenerator associatedClass,
			ArrayList<ClassGenerator> classList,
			int loc,
			int maxNestedIfs,
			int maxMethodCalls)
	{
		return new Method(signature,
				associatedClass,
				classList,
				loc,
				maxNestedIfs,
				maxMethodCalls);
	}

	public Primitives getReturnType() 
	{
		return returnType;
	}

	/**
	 * Constructor that creates a method with/without
	 * generating the method body based on the generateMethodBody
	 * parameter.
	 * 
	 * @param isStatic
	 * @param numberOfParams
	 * @param associatedClass
	 * @param classList
	 * @param name
	 * @param locPerMethod
	 * @param maxNestedIfs
	 * @param maxAllowedMethodCalls
	 * @param generateMethodBody
	 */
	private Method(boolean isStatic, 
			int numberOfParams, 
			ClassGenerator associatedClass,
			ArrayList<ClassGenerator> classList,
			String name,
			int locPerMethod,
			int maxNestedIfs,
			int maxAllowedMethodCalls,
			boolean generateMethodBody)
	{
		System.out.println("Constructing method..." + name);
		this.isStatic = isStatic;
		this.numberOfParams = numberOfParams;
		this.associatedClass = associatedClass;
		this.classList = classList;
		this.name = name;
		this.loc = 0;
		this.nestedIfCounter = 0;
		this.locPerMethod = locPerMethod;
		this.maxNestedIfs = maxNestedIfs;
		this.maxAllowedMethodCalls = maxAllowedMethodCalls;
		this.methodCallCounter = 0;

		generateParams();

		this.methodSignature = new MethodSignature(this.isStatic, this.returnType, 
				this.name, this.parameterList);

		if(generateMethodBody)
		{
			generateMethodBody();
			generateReturnStatement();
		}
	}

	/**
	 * Generates an appropriate return statement for the Method.
	 */
	private void generateReturnStatement() 
	{
		StringBuilder builder = new StringBuilder("return ");
		builder.append("(");
		builder.append(this.returnType);
		builder.append(")");

		int choiceVarOrLiteral = new Random().nextInt(1);
		Operand operand;

		if(choiceVarOrLiteral == 0)
		{
			operand = VariableGenerator.getRandomizedVariable(this, this.returnType);
		}
		else
		{
			operand = new Literal(this.returnType);
		}

		builder.append(operand);
		builder.append(";\n");
		this.returnStatement = builder.toString();
	}

	private void generateMethodBody()
	{
		String output = "";
		Random rand = new Random();

		if(loc < locPerMethod)
		{
			//for the case of indirect recursion.
			//this helps to stop the chain of method calls within
			//the configured limit.
			if(ProgGenUtil.methodCallType == CallType.crossClassWithRecursionLimit
					|| ProgGenUtil.methodCallType == CallType.localWithRecursionLimit)
			{
				output += generateBaseCaseForRecursion();
			}

			if(rand.nextInt(100) < ProgGenUtil.recursionProbability)
			{
				loc += 1;
				//method to include recursive calls.
				output += getRecursiveMethodCall();
			}

			//introduce an instance of the current class
			if(ProgGenUtil.methodCallType == CallType.crossClassWithoutRecursionLimit
					|| ProgGenUtil.methodCallType == CallType.crossClassWithRecursionLimit)
			{
				String classname = getAssociatedClass().getFileName(); 
				output += classname + " classObj = new "
						+ classname + "();\n";
				loc += 1;
			}
		}

		while (loc < locPerMethod ) 
		{
			int option = 0;
			int synOption = 1; // can add synchronized block for cases 2, 3, 5, 6
			if(this.associatedClass.implementsThread()){ // will contain synchronized lock objects only if the class implements Runnable
			
				synOption = rand.nextInt(10);
			}
			if(ProgGenUtil.getAllowedTypes().contains("int"))
			{
				if(ProgGenUtil.getValidPrimitivesInScope(this).contains(Primitives.INT))
				{
					option = rand.nextInt(8);
				}
				else
				{
					//can contain for-loops but not switch statements
					option = rand.nextInt(7);
				}
			}
			else
			{
				option = rand.nextInt(6);
			}

			switch (option)
			{
			case 0:
				if((synOption % 4 )==0){
					output+="synchronized(this){\n" + new IfStmtIfStmt(this, classList).toString()+"\n }\n";
				}
				else{
					output += new IfStmtIfStmt(this, classList).toString();
				}
				break;
			case 1:
				if((synOption % 4 )==0){
					output+="synchronized(this){\n" + new IfElse(this, classList).toString()+"\n }\n";
				}
				else{
					output += new IfElse(this, classList).toString();
				}
				break;
			case 2:
				if((synOption % 4 )== 0){
					if (ProgGenUtil.loadDisk) {
						output += "synchronized(this){\n" + new FileWriter(this, classList).toString() +"\n }\n";
					}
				}
				else{
					if (ProgGenUtil.loadDisk) {
						output += new FileWriter(this, classList).toString();
					}
				}
				break;
			case 3:
				if (ProgGenUtil.loadNetworkInterface) {
					output += new UrlReader(this, classList).toString();
				}
				break;
			case 4:
				if (!ProgGenUtil.useThreads) {
					break;
				}

				for (final ClassGenerator generator : classList) {
					outerloop:
						if (generator.implementsThread() && (generator.getFileName() != associatedClass.getFileName())) {

							String key = generator.getFileName().toLowerCase() + associatedClass.getFileName().toLowerCase();
							final Boolean causesRecursion = mapToPreventIndirectThreadRecursion.get(key);
							LinkedList<String> calledClass = mapToPreventInfinteClassCalls.get(associatedClass.getFileName()) ;//associatedClass->this class
							// check with the specific assocatedClasse's calledClass list  we need the linked list of the specific class
							LinkedList cspecficList = new LinkedList<String>();
							cspecficList = mapToPreventInfinteClassCalls.get(associatedClass.getFileName());
							if(cspecficList!=null){ // the called list that is generated
								for(Object s: cspecficList) {
									if((s.toString())== generator.getFileName()) // generator is the class that is going to be added to the called list
										break outerloop; 	
								}

							}

							if (causesRecursion == null) {
								// call the generateThreadManagementCode();
								output += generateThreadManagementCode( generator) ;
								//output += "(new Thread(new " + generator.getFileName() +"())).start();\n";
								key = generator.getFileName().toLowerCase() + associatedClass.getFileName().toLowerCase();

								associatedClass.setCalledClassList(generator.getFileName());
								clist.add(generator.getFileName()) ;
								mapToPreventInfinteClassCalls.put(associatedClass.getFileName(), associatedClass.getCalledClassList()) ;
								threadData.put((associatedClass.getFileName()+this.getName()), associatedClass.getCalledClassList()) ;

								mapToPreventIndirectThreadRecursion.put(key, new Boolean(true));
								key = associatedClass.getFileName().toLowerCase() + generator.getFileName().toLowerCase();
								mapToPreventIndirectThreadRecursion.put(key, new Boolean(true));
								break;
							}
						}
				}

				break;
			case 5:

				output += new DiskFileReader(this, classList).toString();	
				break;
			case 6:
				if((synOption % 4 )==0){
					output+="synchronized(this){\n" + new ForLoop(this, classList).toString() + "\n }\n";
				}
				else{
					output += new ForLoop(this, classList).toString();
				}
				break;
			default:	
				if((synOption % 4 )==0){
					output+="synchronized(this){\n" + new Switch(this, classList).toString() + "\n }\n";
				}
				else{
					output += new Switch(this, classList).toString();
				}
				break;
			}
		}
		this.methodBody = output;
	}

	private  String generateThreadManagementCode(ClassGenerator generator){
		String output = "" ;
		String threadName = "" ;
		Random rand = new Random();
		int option = new Random().nextInt(2); 
		String calledClassName = "" ;
		String instanceName = "" ;


		switch(option){
		case 0:
			// this is the normal single thread with single object instance creation
			threadName =  "th"+this.associatedClass.getThreadCount() ;
			calledClassName =  generator.getFileName() ;
			instanceName = "obj_"+calledClassName ;

			output += "final " + calledClassName + " " + instanceName + " = new " + calledClassName +"() ;\n" ;

			output += "Thread " + threadName +  "= new Thread("+ instanceName+","+ "\""+threadName+"\""+"){\n" ; 
			output += "public void run() { \n " ;
			output += generateRunMethod(generator,instanceName,threadName) + "\n }.start() ;\n";

			//	threadInstanceMap.put(threadName, instanceMethodslist) ;

			break ; 
		case 1:
			// this will be three threads with same shared object instance creation --> implants the deadlock scenario 
			calledClassName =  generator.getFileName() ;
			instanceName = "obj_"+calledClassName ;
			output += "final " + calledClassName + " " + instanceName + " = new " + calledClassName +"() ;\n" ;

			for(int i = 1 ;  i < 3 ;i++){
				threadName =  "th"+this.associatedClass.getThreadCount() ;
				output += "Thread " + threadName +  "= new Thread("+ instanceName+","+ "\""+threadName+"\""+"){\n" ; 
				output += "public void run() { \n " ;
				output += generateRunMethod(generator,instanceName,threadName) + "\n }.start() ;\n";
				//	threadInstanceMap.put(threadName, instanceMethodslist) ;
			}
			break ;

		default: 
			// will call the run method in the Runnable classes

			break; 

		}


		return output ;

	}

	private String generateRunMethod(ClassGenerator generator, String instanceName,String threadName){
		String output ="" ;
		String var ;
		Random rand = new Random();
		int i = 1 ; 
		ArrayList<MethodSignature> runMethodlist = new ArrayList<MethodSignature>() ; 
		//LinkedList<String> invokedMethodList = new LinkedList<String>() ;
		ArrayList<Node> invokedMethodList = new ArrayList<Node>() ;
		runMethodlist = generator.getMethodSignatures() ;
		ArrayList<MethodSignature> methodsToBeInvoked = generateMethodsToBeInvoked(runMethodlist) ;
				Node n = new Node(threadName,instanceName,methodsToBeInvoked) ;
		invokedMethodList.add(n) ;

		for(int j = 0; j < methodsToBeInvoked.size(); j++){
			var = "rv"+ j ; 
			MethodSignature methodsg = methodsToBeInvoked.get(j) ;
			ArrayList<Variable> parameterList = methodsg.getParameterList() ;
			output += methodsg.getReturnType() +" " + var + "= " ;
			String parameter ="(" + ProgGenUtil.getParametersForList(parameterList, this)+")" ;
			output += instanceName + "." + methodsg.getName() + parameter + ";\n";

		}

		threadMethodslist.add(n) ; 
		return output  ;
	}
	
	
	private ArrayList<MethodSignature> generateMethodsToBeInvoked(ArrayList<MethodSignature> runMethodList){
		ArrayList<MethodSignature> methodToBeInvoked = new ArrayList<MethodSignature>() ;
		ArrayList<Integer> list  =  new ArrayList<Integer>() ;

		if(runMethodList.size() == 0) System.out.println("No Methods in the Called Class");
		else if(runMethodList.size() == 1){
			// choose that one single method from the Called Class
			list.add(0) ;
		} 
		else if(runMethodList.size() > 1 && runMethodList.size() <= 10 ){
			// choose a random number which is less than the size of the length of the array length
			// => so many methods will be called from within the thread.
			int upperBound = new Random().nextInt((runMethodList.size())-1) ;

			for(int i = 0 ; i <= upperBound ;i++){
				if(!(list.contains(new Random().nextInt(runMethodList.size())))){
					list.add(new Random().nextInt(runMethodList.size())) ; // there should not be any duplicates 
				}
			}
		}
		else if(runMethodList.size() > 10 ){
			// fix the number of methods within the run to be 5 
			// => for any thread, there will be only 5 methods that will be called with the run method.
			for(int i = 0 ; i <= 5 ;i++){//------------------------------------------
				if(!(list.contains(new Random().nextInt(runMethodList.size())))){
					list.add(new Random().nextInt(runMethodList.size())) ; // there should not be any duplicates 
				}
			}

		}


		for(int  i = 0 ; i < list.size() ; i ++){
			methodToBeInvoked.add(runMethodList.get(list.get(i))) ;
		}

		return methodToBeInvoked ;

	}


//	private String generateRunMethodNew(ClassGenerator generator, String instanceName,String threadName){
//		String output ="" ;
//		String var ;
//		String key;
//		Random rand = new Random();
//		int i = 1 ; 
//		ArrayList<Method> runMethodlist = new ArrayList<Method>() ; 
//		//LinkedList<String> invokedMethodList = new LinkedList<String>() ;
//		LinkedList<Node> invokedMethodList = new LinkedList<Node>() ;
//		runMethodlist = generator.getMethodList() ;
//		ArrayList<Method> methodsToBeInvoked = generateMethodsToBeInvokedNew(runMethodlist) ;
//		Node n = new Node(threadName,instanceName,methodsToBeInvoked) ;
//		//invokedMethodList.add(threadName) ;
//		//invokedMethodList.add(instanceName) ;
////		for(int k = 0 ; k < methodsToBeInvoked.size() ; k++){
////			invokedMethodList.add(methodsToBeInvoked.get(k).getName()) ;
////		}
//		invokedMethodList.add(n) ;
//		for(int j = 0; j < methodsToBeInvoked.size(); j++){
//
//			var = "rv"+ j ; 
//			Method methodsg = methodsToBeInvoked.get(j) ;
//			ArrayList<Variable> parameterList = methodsg.getParameterList() ;
//			output += methodsg.getReturnType() +" " + var + "= " ;
//			String parameter ="(" + ProgGenUtil.getParametersForList(parameterList, this)+")" ;
//			output += instanceName + "." + methodsg.getName() + parameter + ";\n";
//
//		}
//		key = threadName;
//		threadMethodsMap.put(key, invokedMethodList) ;
//		return output  ;
//	}
//
//	private ArrayList<Method> generateMethodsToBeInvokedNew(ArrayList<Method> runMethodList){
//		ArrayList<Method> methodToBeInvoked = new ArrayList<Method>() ;
//		ArrayList<Integer> list  =  new ArrayList<Integer>() ;
//
//		if(runMethodList.size() == 0) System.out.println("No Methods in the Called Class");
//		else if(runMethodList.size() == 1){
//			// choose that one single method from the Called Class
//			list.add(0) ;
//		} 
//		else if(runMethodList.size() > 1 && runMethodList.size() <= 10 ){
//			// choose a random number which is less than the size of the length of the array length
//			// => so many methods will be called from within the thread.
//			int upperBound = new Random().nextInt((runMethodList.size())-1) ;
//			
//			for(int i = 0 ; i <= upperBound ;i++){
//				if(!(list.contains(new Random().nextInt(runMethodList.size())))){
//					list.add(new Random().nextInt(runMethodList.size())) ; // there should not be any duplicates 
//				}
//			}
//		}
//		else if(runMethodList.size() > 10 ){
//			// fix the number of methods within the run to be 5 
//			// => for any thread, there will be only 5 methods that will be called with the run method.
//			for(int i = 0 ; i <= 5 ;i++){//------------------------------------------
//				if(!(list.contains(new Random().nextInt(runMethodList.size())))){
//					list.add(new Random().nextInt(runMethodList.size())) ; // there should not be any duplicates 
//				}
//			}
//
//		}
//
//
//		for(int  i = 0 ; i < list.size() ; i ++){
//			methodToBeInvoked.add(runMethodList.get(list.get(i))) ;
//		}
//
//		return methodToBeInvoked ;
//
//	}
//	
	
	
	public ArrayList<Node> getThreadMethodsList(){
		return threadMethodslist ;
	}

	private String generateBaseCaseForRecursion() 
	{
		//generate a return statement for the base case
		generateReturnStatement();

		StringBuilder builder = new StringBuilder(
				"if(! (recursionCounter > 0 && recursionCounter < " + ProgGenUtil.maxRecursionDepth + ") )");
		builder.append("\n{\n");
		builder.append(this.returnStatement);
		builder.append("\n}\n");
		builder.append("else\n{\n recursionCounter--; \n}\n");
		//add 4 to lines of count.
		loc += 4;
		return builder.toString();
	}

	private String getRecursiveMethodCall()
	{
		System.out.println("Inside recursive method call for : " + methodSignature);
		String parameters = "(";

		for(Variable var : parameterList)
		{
			if(var.getName().equals("recursionCounter"))
			{
				parameters += "recursionCounter,";
				continue;
			}

			Operand operand;
			Primitives primitive = var.getType().getType();
			int optionVariableOrField = new Random().nextInt(1);
			if(optionVariableOrField == 0)
			{
				if(primitive == Primitives.OBJECT)
				{
					operand = VariableGenerator.getRandomizedObjectForType(this, var.getType());
				}
				else
				{
					operand = VariableGenerator.getRandomizedVariable(this, primitive);
				}
			}
			else
			{
				if(primitive == Primitives.OBJECT)
				{
					operand = FieldGenerator.getRandomizedObjectForType(this.getAssociatedClass(), var.getType());
				}
				else
				{
					operand = FieldGenerator.getRandomField(this.getAssociatedClass(), primitive, this.isStatic());
				}
			}
			parameters += operand + ",";
		}

		parameters = parameters.substring(0, parameters.length()-1);
		parameters += ")";

		return this.getName() + parameters + ";\n\n";
	}

	public HashSet<String> getCalledMethodsWithClassName() {
		return calledMethodsWithClassName;
	}

	public ArrayList<Variable> getParameterList() 
	{
		return parameterList;
	}

	public ClassGenerator getAssociatedClass() 
	{
		return associatedClass;
	}

	public HashSet<Variable> getUsedParameterList() 
	{
		return usedParameterList;
	}

	public void setThreadData(String callingMethodName, LinkedList calledClassName){
		this.threadData.put(callingMethodName, calledClassName);
	}

	public LinkedList<String> getThreadData(String methodName){
		return threadData.get(methodName) ;
	}

	/**
	 * Generate randomized parameters for this method.
	 */
	private void generateParams()
	{
		if(ProgGenUtil.methodCallType == CallType.crossClassWithRecursionLimit
				|| ProgGenUtil.methodCallType == CallType.localWithRecursionLimit)
		{
			parameterList.add(Variable.generateRecursionCounterVariable());
			for(int i = 1; i<numberOfParams; i++)
			{	//classList is passed because: if Variable's type is Object, then to select type
				parameterList.add(Variable.generateVariable("var"+i, classList));
			}
		}
		else
		{
			for(int i = 0; i<numberOfParams; i++)
			{
				parameterList.add(Variable.generateVariable("var"+i, classList));
			}
		}
	}

	public int getLoc() 
	{
		return loc;
	}

	public void setLoc(int loc) 
	{
		this.loc = loc;
	}

	public MethodSignature getMethodSignature() 
	{
		return methodSignature;
	}

	public String getName() 
	{
		return name;
	}

	public int getMethodCallCounter() 
	{
		return methodCallCounter;
	}

	public void setMethodCallCounter(int methodCallCounter) 
	{
		this.methodCallCounter = methodCallCounter;
	}

	public int getNestedIfCounter() 
	{
		return nestedIfCounter;
	}

	public void setNestedIfCounter(int nestedIfCounter) 
	{
		this.nestedIfCounter = nestedIfCounter;
	}

	public boolean isStatic() 
	{
		return isStatic;
	}

	public int getMaxAllowedMethodCalls() 
	{
		return maxAllowedMethodCalls;
	}

	public void setMaxAllowedMethodCalls(int maxAllowedMethodCalls) 
	{
		this.maxAllowedMethodCalls = maxAllowedMethodCalls;
	}

	public ArrayList<ClassGenerator> getClassList() 
	{
		return classList;
	}

	public int getMaxNestedIfs() 
	{
		return maxNestedIfs;
	}

	/**
	 * API to generate a method for a class.
	 * 
	 * @param generator
	 * @param maxNumberOfParams
	 * @param classList
	 * @param name
	 * @param maxLocPerMethod
	 * @param maxNestedIfs
	 * @param maxAllowedMethodCalls
	 * @param generateMethodBody
	 * @return
	 */
	public static Method generateMethod(ClassGenerator generator,
			int maxNumberOfParams,
			ArrayList<ClassGenerator> classList,
			String name,
			int maxLocPerMethod,
			int maxNestedIfs,
			int maxAllowedMethodCalls,
			boolean generateMethodBody)
	{
		boolean isStatic = ProgGenUtil.coinFlip();

		//we need minimum of two parameters
		int numberOfParams = ProgGenUtil.getRandomIntInRange(maxNumberOfParams);

		if(numberOfParams<2)
		{
			numberOfParams = 2;
		}

		return new Method(isStatic, 
				numberOfParams, 
				generator, 
				classList,
				name, 
				maxLocPerMethod,
				maxNestedIfs,
				maxAllowedMethodCalls,
				generateMethodBody);
	}

	public String toString()
	{
		String str = "";

		str += this.methodSignature;
		str+= "{\n "+ methodBody + returnStatement + "\n}\n\n";

		return str;
	}

	/**
	 * API to generate methods for an interface. Generated methods will not have 
	 * a body generated. Such methods are used only for extracting signatures.
	 * 
	 * @param maxNoOfParameters
	 * @param classList
	 * @param name
	 * @return
	 */
	public static Method generateMethodForInterface(
			int maxNoOfParameters,
			ArrayList<ClassGenerator> classList, 
			String name) 
	{
		int numberOfParams = ProgGenUtil.getRandomIntInRange(maxNoOfParameters);

		if(numberOfParams < 2)
		{
			numberOfParams = 2;
		}
		//TODO: So, interface methods will have at least 2 parameters, but why?
		return new Method(
				false, 
				numberOfParams, 
				null, 
				classList, 
				name, 
				0, 
				0, 
				0, 
				false);
	}

	public HashSet<MethodSignature> getCalledMethods() 
	{
		return calledMethods;
	}	
	
	
	
	
	

}