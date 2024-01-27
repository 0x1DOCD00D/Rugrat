package ragDB.database.TableDetails;

import java.util.List;
import java.util.ArrayList;
/**
 * Class Representing Table Data structure
 * @author Arthi
 */
public class DBTables {
	
	public static List<TableData> tables;
	
	public DBTables() {
		super();
		tables = new ArrayList<TableData>();
	}
	
	public DBTables(String DoNotUse) {
	}
	public List<TableData> addTable(TableData newTableDetail) {
		
		tables.add(newTableDetail);
		return tables;
	}
	
	public TableData getTable(int index) {
		return tables.get(index);
	}
	
	public TableData getTableByName(String tableName) {
		for(int i=0;i<tables.size();i++)
		{
			if((tables.get(i).tableName).equals(tableName))
				return tables.get(i);
		}
		return null;
	}
	
	public List<TableData> getTablesbyName(List<String> tableNames) {
		
		List<TableData> tablesData = new ArrayList<TableData>();
		if(tableNames == null)
			System.out.print("DBTables : tablenames is null" );
		
		for(int counter=0;counter<tableNames.size();counter++) {
			
			tablesData.add(getTableByName(tableNames.get(counter)));
			
		}
		//System.out.print("DBTables: the table data is : " + tablesData.get(0).tableName);
		return tablesData;
	}
	
	public int getNumberOfTables() {
		return tables.size();
	}
	
	public static int getNumberOfParams(TableData table) {
		return table.getNumOfParams();
	}
	
	//Get total parameters for a number of tables together
	public static int getTotalParams(List<TableData> tables) {
		int totalParams = 0;
		for(int counter=0;counter<tables.size();counter++) {
			totalParams+=getNumberOfParams(tables.get(counter));
		}
		return totalParams;
	}
}
