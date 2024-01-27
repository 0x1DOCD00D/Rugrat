package edu.uta.cse.proggen.statements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import edu.uta.cse.proggen.classLevelElements.Method;
import edu.uta.cse.proggen.packageLevelElements.ClassGenerator;
import edu.uta.cse.proggen.util.ProgGenUtil;

public class DiskFileReader {
	private Method method = null;
	private String body = "";
	//TODO: Add config option for this file
	private final String defaultReadFile = "config.xml";
	
	public DiskFileReader(Method method, ArrayList<ClassGenerator> classList){
		this.method = method;
		try {
			File file = new File(ProgGenUtil.logfile);
			File defaultFile = new File(defaultReadFile);
			body += initReader(file, defaultFile);
			body += generateBody();
			body += closeReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String initReader(File logfile, File defaultReadFile) throws IOException
	{	
		String initString = "try {\nbufferedReader= new BufferedReader(new FileReader(getNextFile(\"" 
								+ logfile.getAbsolutePath().replace("\\", "\\\\") 
								+ "\",\"" + defaultReadFile.getAbsolutePath().replace("\\", "\\\\") 
								+"\")));\n";
		return initString;
	}
	
	private String generateBody() {
		String bodyString = "String line = null;\n" + "" +
								"while((line = bufferedReader.readLine()) != null){\n" +
								"System.out.println(\"Read line = \" + line );\n}\n}\n";
		return bodyString;
	}
	
	private String closeReader() {
		String closeString = "catch(Exception e){\ne.printStackTrace();\n}\n";
		return closeString;
	}
	
	public String toString()
	{
		if( this.method.isStatic() )
		{
			return "";
		}
		return body;	
	}
}
