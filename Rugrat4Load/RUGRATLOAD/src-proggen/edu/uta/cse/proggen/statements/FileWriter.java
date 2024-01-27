package edu.uta.cse.proggen.statements;

import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import edu.uta.cse.proggen.classLevelElements.Method;
import edu.uta.cse.proggen.packageLevelElements.ClassGenerator;
import edu.uta.cse.proggen.util.ProgGenUtil;

public class FileWriter {

	private Method method;
	ArrayList<ClassGenerator> classList;
	private String body = "";
//	private static int variableCounter = 0;
	private static String writeFilePrefix = "__UIC__RUGRAT__";

	public FileWriter(Method method, ArrayList<ClassGenerator> classList){
		this.method = method;
		this.classList = classList;

		//Init logfile
		BufferedWriter logWriter = null;
		File logFile = null;

		try{
			logFile = new File( ProgGenUtil.logfile );
			if( !logFile.exists() ){
				logFile.createNewFile();
			}
			
			//            File file = new Generator().getRandomPath();
		}
		catch( IOException e ){
			e.printStackTrace();
		}


		Random random = new Random();

		File file = null;
		
		try{
			file = new Generator().getRandomFilePath();
			boolean created = file.createNewFile();
			
			int i = 0;
			while (!created) {
				file = new Generator().getRandomFilePath();
				created = file.createNewFile();
				System.out.println(file.getAbsolutePath() + "\t" + (i++) + "\t" + file.canWrite());
			}
			file.deleteOnExit();
		}
		catch( IOException e ){
			e.printStackTrace();
		}


		try {
			body += initWriter(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for( int i = 0 ; i < random.nextInt(1000); i++)
		{
			body += "bufferedWriter.write(\"Writing line " + ( i + 1) + " to file\");\n";
			body += "bufferedWriter.newLine();\n";
			System.out.println(i);
		}

		try {
			body += closeWriter(file, logFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		method.setLoc(method.getLoc() + body.split("\n").length);
	}

	public String toString()
	{
		if( this.method.isStatic() )
		{
			return "";
		}
		return body;	
	}

	private String initWriter( File file ) throws IOException
	{	
		String initString = "try {\nbufferedWriter= new BufferedWriter(new FileWriter(\"" + file.getAbsolutePath().replace("\\", "\\\\") + "\"));\n";
		return initString;
	}

	private String closeWriter(File file, File logFile) throws IOException
	{
		String closeString =  "} catch (FileNotFoundException ex) {\n";
		closeString +=  "ex.printStackTrace();\n";
		closeString +=  "} catch (IOException ex) {\n";
		closeString +=  "ex.printStackTrace();\n} finally {\n";
		closeString += "try {\nif (bufferedWriter != null) {\n";
		closeString +=	"bufferedWriter.flush();\n";
		closeString += "bufferedWriter.close();\n";
//		closeString += "new File(\"" + file.getAbsolutePath() + "\").deleteOnExit();";
//		closeString += "String logfile = " + "\"/home/u2/nischit/Desktop/projects/RugRat/log.txt\";\n";
		closeString += "String logfile = \"" + logFile.getAbsolutePath().replace("\\", "\\\\") + "\";\n";
		closeString += "bufferedWriter = new BufferedWriter( new java.io.FileWriter( logfile, true ) );\n";		
		closeString += "bufferedWriter.append(\"" + file.getAbsolutePath().replace("\\", "\\\\") + "\");";
		closeString += "bufferedWriter.newLine();\n";
		closeString += "bufferedWriter.flush();\nbufferedWriter.close();\n}\n}" +
				       " catch (IOException ex) {\n";
		closeString += "ex.printStackTrace();\n}\n}\n";

		return closeString;
	}

}

class Generator
{
	//Constants for OS
	private final int WINDOWS = 0;
	private final int UNIX_LINUX = 1;

	private int os = -1;

	private ArrayList<File> initialPaths;
	public static final String prefixString = "__UIC__RUGRAT__";

	private static Random rand = new Random();

	public Generator(){
		if( File.separator.equals("/") )
			os = UNIX_LINUX;
		else
			os = WINDOWS;

		initialPaths = new ArrayList<File>();

		if( os == WINDOWS ){
			File[] roots = File.listRoots();
			File windowsHomeDirectory = new File( System.getProperty( "user.home" ) );
			for( int i = 0; i < roots.length; i++ ){
				if (windowsHomeDirectory.getAbsolutePath().contains(roots[i].getAbsolutePath())) {
					initialPaths.add( roots[i] );
				}
			}			
		}
		else{
			initialPaths.add( new File( System.getProperty( "user.home" ) ) );
		}
	}

	public File getRandomFilePath() throws IOException
	{
		String homePath = "";
		String generatedPath = "";
		int pathDepth;
		int max_depth_of_generated_tree = 7;

		homePath = initialPaths.get( rand.nextInt( initialPaths.size() ) ).getAbsolutePath();

		//Generate path depth
		pathDepth = rand.nextInt( max_depth_of_generated_tree );

		File file = new File( homePath );



		for( int i = 0; i < pathDepth; i++ )
		{
			File[] children = file.listFiles();
			ArrayList<File> directories = new ArrayList<File>();
			if (children == null) {
				break;				
			}
			for( int j = 0; j < children.length; j ++ )
			{
				if( children[j].isDirectory() )
				{
					if( !children[j].isHidden() && children[j].canWrite() )
					{
						directories.add( children[j] );
					}
				}
			}
			if( directories.size() > 0 )
			{
				file = directories.get( rand.nextInt( directories.size() ) );
			}
			else
				break;

		}

		generatedPath = File.separator + Generator.getNextString() + ".txt";

		File generatedFile = new File( file.getAbsolutePath() + generatedPath );

		if( !generatedFile.exists() )
			return generatedFile;

		return null;
	}

	public static String getNextString(){
		int strlen = rand.nextInt() % 12;
		if( strlen < 5 )
			strlen = 5;
		String genString = "";

		while( genString.length() < strlen ){
			int selector = rand.nextInt() % 60;
			switch( selector ){
			case 0 : genString += "a";break;
			case 1 : genString += "b";break;
			case 2 : genString += "c";break;
			case 3 : genString += "d";break;
			case 4 : genString += "e";break;
			case 5 : genString += "f";break;
			case 6 : genString += "g";break;
			case 7 : genString += "h";break;
			case 8 : genString += "i";break;
			case 9 : genString += "j";break;
			case 10 : genString += "k";break;
			case 11 : genString += "l";break;
			case 12 : genString += "m";break;
			case 13 : genString += "n";break;
			case 14 : genString += "o";break;
			case 15 : genString += "p";break;
			case 16 : genString += "q";break;
			case 17 : genString += "r";break;
			case 18 : genString += "s";break;
			case 19 : genString += "t";break;
			case 20 : genString += "u";break;
			case 21 : genString += "v";break;
			case 22 : genString += "w";break;
			case 23 : genString += "x";break;
			case 24 : genString += "y";break;
			case 25 : genString += "z";break;
			case 26 : genString += "A";break;
			case 27 : genString += "B";break;
			case 28 : genString += "C";break;
			case 29 : genString += "D";break;
			case 30 : genString += "E";break;
			case 31 : genString += "F";break;
			case 32 : genString += "G";break;
			case 33 : genString += "H";break;
			case 34 : genString += "I";break;
			case 35 : genString += "J";break;
			case 36 : genString += "K";break;
			case 37 : genString += "L";break;
			case 38 : genString += "M";break;
			case 39 : genString += "N";break;
			case 40 : genString += "O";break;
			case 41 : genString += "P";break;
			case 42 : genString += "Q";break;
			case 43 : genString += "R";break;
			case 44 : genString += "S";break;
			case 45 : genString += "T";break;
			case 46 : genString += "U";break;
			case 47 : genString += "V";break;
			case 48 : genString += "W";break;
			case 49 : genString += "X";break;
			case 50 : genString += "Y";break;
			case 51 : genString += "Z";break;
			case 52 : genString += "1";break;
			case 53 : genString += "2";break;
			case 54 : genString += "3";break;
			case 55 : genString += "4";break;
			case 56 : genString += "5";break;
			case 57 : genString += "6";break;
			case 58 : genString += "7";break;
			case 59 : genString += "8";break;
			case 60 : genString += "9";break;
			}
		}
		return prefixString + genString;
	}			
}
