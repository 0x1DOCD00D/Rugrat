package ragDB.database.TableDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arthi
 * Describes each Primary key Object
 */
public class PrimaryKey {

	private String table;
	private String pkParameter;
	private String pktype;
	List<ForeignKey> foreignKeyList;
	
	public PrimaryKey(String table, String parameter, String datatype){
		this.table = table;
		this.pkParameter = parameter;
		this.pktype = datatype;
		foreignKeyList = new ArrayList<ForeignKey>();
	}
	
	public String getTable()
	{
		return this.table;
	}
	
	public String getpkParameter()
	{
		return this.pkParameter;
	}
	
	public String getpkType()
	{
		return this.pktype;
	}
	
	public List<ForeignKey> getfkList(){
		return this.foreignKeyList;
	}
	
	public PrimaryKey AddForeignKey(ForeignKey fkParam){
		this.foreignKeyList.add(fkParam);
		return this;
	}
	
	
}
