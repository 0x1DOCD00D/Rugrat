package ragDB.query.Print;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ragDB.common.main.TabCreate;
import ragDB.database.TableDetails.DBTables;
import ragDB.database.TableDetails.TableData;


/**
 * @author Arthi
 * Writes Select Query to XML format file
 */
public class SelectQWriteXML {
	DocumentBuilderFactory docFactory;
	DocumentBuilder docBuilder;
	Document doc;
	Element rootElement;
	DBTables dbtables;
	
	public SelectQWriteXML(){
		try{
			  docFactory = DocumentBuilderFactory.newInstance();
			  docBuilder = docFactory.newDocumentBuilder();
		      dbtables = TabCreate.getAllTables();
			  //root elements
			  doc = docBuilder.newDocument();
			  rootElement = doc.createElement("SelectQueries");
			  doc.appendChild(rootElement);
			}
			catch(Exception e){
				System.out.println("Error:<SelectQWriteToXML> Cannot intialize class");
			}
	}

	public void WriteToXML(Stack<String> selectQueries){
		
		//Checking for errors
		if(selectQueries.size() < 1){
			System.out.println("Error:<SelectQWriteToXML> No queries in stack to write to XML");
		}
		while(selectQueries.size()!=0){
			//Current Query to process
			String thisQuery = selectQueries.pop();
			
			List<String> paramsINQ = GetAllParamsInQuery(thisQuery);
			List<String> tables = GetTableNames(paramsINQ);
			boolean result = WriteQueryInfo(thisQuery, paramsINQ, tables);
			
			if(result == false){
				System.out.println();
				System.out.printf("Error:<SelectQWriteXML> Not written to XML : '{0}'",thisQuery);
			}
			//write the content into xml file
			try{
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer;
			  transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource(doc);
			  StreamResult streamResult =  new StreamResult(new File("SelectQueries.xml"));
			  transformer.transform(source, streamResult);
			}
			catch(TransformerConfigurationException tce){
				System.out.println("Error<SelectQWriteXML: TransformerConfigurationException> "+ tce.toString());
			}
			catch(TransformerException te){
				System.out.println("Error<SelectQWriteXML: TransformerException> "+ te.toString());
			}
		}
	}

	private List<String> GetTableNames(List<String> paramsINQ) {
		List<String> tablenames = new ArrayList<String>();
		for(String param:paramsINQ){
			String tableName = param.substring(0, param.indexOf("_P_"));
			if(!(tablenames.contains(tableName))){
				tablenames.add(tableName);
			}
		}
		return tablenames;
	}

	private List<String> GetAllParamsInQuery(String query) {
		
		int index = query.indexOf("from");
		query = query.substring(0, index);
		Pattern p = Pattern.compile("T_\\d+_P_\\d+");
		List<String> parameters = new ArrayList<String>();
		
		 Set<String> words = new HashSet<String>(Arrays.asList(query.split(" ")));
			
		 for(String word: words){
			 if(p.matcher(word).matches()){
				 if(!(parameters.contains(word)))
					 parameters.add(word);
			 }
		 }
		
		return parameters;
	}

	private boolean WriteQueryInfo(String thisQuery,
			List<String> paramsINQ, List<String> tables) {
		
		try{
			//Listing the query itself
			Element eachQuery = doc.createElement("Query");
			rootElement.appendChild(eachQuery);
			eachQuery.setAttribute("value", thisQuery);
			
			for(int j=0;j<paramsINQ.size();j++){
				//Describing the result parameters used in the query
				Element eachResult = doc.createElement("Result");
				eachQuery.appendChild(eachResult);
				eachResult.setAttribute("SeqNumber", Integer.toString(j+1));
				String param = paramsINQ.get(j);
				eachResult.setAttribute("Name",param );
				
				//Get type and table of parameter
				//Trim parameter to get table name
				int index = param.indexOf("_P_");
				String tableName = param.substring(0,index);
				int paramNum = Integer.parseInt(param.substring(index+3));
				
				TableData tbl = dbtables.getTableByName(tableName);
				String datatype = tbl.returnParam(paramNum).values().toString();
				datatype = datatype.replace("[","");
				datatype = datatype.replace("]","");
				
				eachResult.setAttribute("Type", datatype);
				eachResult.setAttribute("Table", tableName);
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		return true;
	}
}
