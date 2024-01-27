package ragDB.query.Print;

import java.io.File;
import java.util.Stack;

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


/**
 * @author Arthi
 * Writes Update and Insert Query to XML format file
 */
public class UpdateInsertQWriteXML {
	DocumentBuilderFactory docFactory;
	DocumentBuilder docBuilder;
	Document doc;
	Element rootElement;
	DBTables dbtables;
	int queryTypeFlag;
	
	public UpdateInsertQWriteXML(String queryType){
		try{
			  docFactory = DocumentBuilderFactory.newInstance();
			  docBuilder = docFactory.newDocumentBuilder();
		      dbtables = TabCreate.getAllTables();
			  //root elements
			  doc = docBuilder.newDocument();
			  
			  if(queryType == "update"){
				  rootElement = doc.createElement("UpdateQueries");
				  queryTypeFlag = 1;
			  }  
			  else{
				  rootElement = doc.createElement("InsertQueries");
				  queryTypeFlag = 2;
			  }
				 
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
			
			//List<String> paramsINQ = GetAllParamsInQuery(thisQuery);
			//List<String> tables = GetTableNames(paramsINQ);
			boolean result = WriteQueryInfo(thisQuery);
			
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
			  StreamResult streamResult = null;
			  if(queryTypeFlag == 1)
				  streamResult  =  new StreamResult(new File("UpdateQueries.xml"));
			  else if(queryTypeFlag == 2)
				  streamResult =   new StreamResult(new File("InsertQueries.xml"));
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

	private boolean WriteQueryInfo(String thisQuery) {
		
		try{
			//Listing the query itself
			Element eachQuery = doc.createElement("Query");
			rootElement.appendChild(eachQuery);
			eachQuery.setAttribute("value", thisQuery);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		return true;
	}
}