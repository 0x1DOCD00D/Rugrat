package edu.uta.cse.proggen.nodes;

import java.util.ArrayList;
import java.util.LinkedList;

import edu.uta.cse.proggen.classLevelElements.Method;
import edu.uta.cse.proggen.classLevelElements.MethodSignature;

public class Node {
	private String threadName; 
	private String instanceName ; 
	private ArrayList<MethodSignature> runMethodList ; 
	
	public Node(String tName, String instName, ArrayList<MethodSignature> methodsToBeInvoked){
	this.threadName = tName ; 
	this.instanceName = instName ;
	this.runMethodList = methodsToBeInvoked ; 
	}
	
	
	public String getThreadName(){
		return this.threadName ;
	}
	
	public String getInstanceName(){
		return this.instanceName ;
	}

	public ArrayList<MethodSignature> getRunMethodList(){
		return this.runMethodList ;
	}
}
