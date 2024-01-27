/**
 * 
 */
package ragDB.query.Operators;

import java.util.Properties;
import java.util.Random;

import ragDB.common.main.TabCreate;

/**
 * @author Arthi
 * Returns a suitable Comparison Operator for the Query
 */
public class ComparisonOperators {

	private static Random pickOperator;
	private static Properties config;
	private static String[] simpleOperatorsNum;
	private static String[] simpleOperatorsString;

	public ComparisonOperators() {

		if (pickOperator == null) {
			pickOperator = new Random();
			config = TabCreate.getConfig();
			simpleOperatorsNum = config.getProperty("simpleOperators.Numbers")
					.split(",");
			simpleOperatorsString = config
					.getProperty("simpleOperators.String").split(",");
		}
	}

	public String GetSimpleOperator(String dataType) {

		int operatorSelected = 0;

		if (dataType.contains("int") || dataType.contains("float")) {
			operatorSelected = pickOperator.nextInt(simpleOperatorsNum.length);
			return simpleOperatorsNum[operatorSelected];
		} else if (dataType.contains("char") || dataType.contains("varchar")) {
			operatorSelected = pickOperator
					.nextInt(simpleOperatorsString.length);
			return simpleOperatorsString[operatorSelected];
		} else {
			return null;
		}
	}
}
