/**
 * 
 */
package ragDB.database.TableDetails;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Arthi
 * Class containing table data
 */
public class TableData {
	
	String tableName;
	List<String> parameters;
	//<Parameter,Datatype>
	HashMap<String, String> dataTypes;
	//Contains null if table has no primary key
	//Has primary key and all foreign key details for the table
	PrimaryKey keyDetails;
	
	
	public TableData() {
		super();
		parameters = new ArrayList<String>();	    //Contains all parameters in table "tableName"
		dataTypes  = new HashMap<String, String>(); //Contains a map of all parameters with their datatype values
		keyDetails = null;
	}
		
	public TableData addTableDetail(String tableName, HashMap<String, String> param_Types) {
		
		this.tableName = tableName;
		this.dataTypes = param_Types;
		this.parameters = new ArrayList<String>(param_Types.keySet());
		
		return this;
	}
	
	public int getNumOfParams() {
		return this.parameters.size();
	}
	
	public PrimaryKey GetTableKeyInfo(){
		return this.keyDetails;
	}

	public String getTableName() {
		return this.tableName;
	}
	
	public HashMap<String,String> returnParam(int index) {
		String parameter = this.parameters.get(index);
		String datatype = this.dataTypes.get(parameter);
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put(parameter, datatype);
		return hm;
		
	}
	
	
}

	
	