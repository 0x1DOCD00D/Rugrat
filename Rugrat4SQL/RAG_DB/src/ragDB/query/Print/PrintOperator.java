package ragDB.query.Print;

/**
 * @author Arthi
 * @param <T>
 *
 */
public class PrintOperator {
	
	public PrintOperator() {
	}
	
	public StringBuilder printSimpleOperator(StringBuilder query, String paramOne, String paramTwo,String value, String operator) {
		
		//Param1 and param2 is of the format [param1] and [param2]
		if(paramOne!=null)
			paramOne = paramOne.replace('[',' ').replace(']',' ').trim();
		if(paramTwo!=null)
			paramTwo = paramTwo.replace('[',' ').replace(']',' ').trim();
		
		
		//If "value" is not null, compare with random value
		if(value!=null) {
			query.append(paramOne +" ").append(operator +" ").append(value + " ");
		}
		//Not with constant int/float or string
		else {
			query.append(paramOne +" ").append(operator +" ").append(paramTwo + " ");
		}
		return query;
	}
}