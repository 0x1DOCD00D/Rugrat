package edu.uta.cse.proggen.statements;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import edu.uta.cse.proggen.classLevelElements.Method;
import edu.uta.cse.proggen.packageLevelElements.ClassGenerator;
import edu.uta.cse.proggen.util.ProgGenUtil;

public class UrlReader {
	private Method method = null;
	private String body = "";
	private String url = null;
	//TODO: Add config option for this file
	
	public UrlReader(Method method, ArrayList<ClassGenerator> classList){
		this.method = method;
		try {
			if (ProgGenUtil.urlList != null) {
				if (!ProgGenUtil.urlList.isEmpty()) {
					int index = new Random().nextInt() % ProgGenUtil.urlList.size();
					url = ProgGenUtil.urlList.get(index);
				}
			}
			body += initReader();
			body += generateBody();
			body += closeReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String initReader() throws IOException
	{	
		String initString = "try {\nURL url = new URL(\"" + url + "\");\nbufferedReader=" +
			"new BufferedReader(new InputStreamReader(url.openStream()));\n";
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