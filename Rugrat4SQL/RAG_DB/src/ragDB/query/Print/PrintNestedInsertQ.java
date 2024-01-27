/**
 * 
 */
package ragDB.query.Print;

import java.util.Stack;

/**
 * @author Arthi
 * Builds the entire Nested Insert Query String
 */
public class PrintNestedInsertQ {

	public PrintNestedInsertQ(){
	}
	
	public String BuildEntireQuery(String insertQ, Stack<String> selectSubQ){
		StringBuilder selectQs = new StringBuilder();
		
		if(selectSubQ!=null){
			for(int i=0;i<selectSubQ.size();i++){
				selectQs.append(selectSubQ.pop());
				if(selectSubQ.size()>=0){
					selectQs.append(" union ");
				}
		}
		String innerQ = selectQs.toString();
		int removeChar = innerQ.lastIndexOf("union");
		if(removeChar!=-1){
			innerQ = innerQ.substring(0, removeChar-1);
		}

		innerQ = innerQ.replaceAll(";", "");

		int intIndexOfMatch = insertQ.indexOf( "SUBQUERY" );
		
		if(intIndexOfMatch!=-1){
			insertQ = insertQ.replace("SUBQUERY",innerQ);
		}
		else{
			System.out.println("Error in PrintNestedInsertQ: Insert statement is not of nested type");
			System.exit(1);
			}
		}
		return insertQ;
	}
}