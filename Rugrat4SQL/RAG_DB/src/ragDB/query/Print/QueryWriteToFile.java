package ragDB.query.Print;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

/**
 * @author Arthi
 * Writes Queries to a Text Output
 */
public class QueryWriteToFile {

	public void WriteToFile(Stack<String> queries, String queryType){
		
		FileOutputStream fos;
		DataOutputStream dos = null;
		try{
			File file = null;
			
			if(queryType.equals("select"))
				file= new File("SelectQueriesTxt.txt");
			else if(queryType.equals("update"))
				file= new File("UpdateQueriesTxt.txt");
			else if(queryType.equals("insert"))
				file= new File("InsertQueriesTxt.txt");
			else
			{
				System.out.println("Error: Text output cannot be written");
				System.exit(1);
			}
			fos = new FileOutputStream(file);
			dos=new DataOutputStream(fos);
			
			for(String query: queries){
				dos.writeBytes(query +"\n");
			}
			}
			catch (IOException e) {
			      e.printStackTrace();
			    }
			catch(Exception e){
				e.printStackTrace();
			}
	}
}