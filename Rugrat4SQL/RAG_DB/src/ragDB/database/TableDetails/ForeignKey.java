package ragDB.database.TableDetails;

/**
 * @author Arthi
 * Describes a foreign key object
 */
public class ForeignKey {
	
	private String table;
	private String fkParameter;
	private String fktype;
	
	public ForeignKey(String table, String parameter, String datatype){
		this.table = table;
		this.fkParameter = parameter;
		this.fktype = datatype;
	}
	
	public String getTable()
	{
		return this.table;
	}
	
	public String getfkParameter()
	{
		return this.fkParameter;
	}
	
	public String getfkType()
	{
		return this.fktype;
	}
}
