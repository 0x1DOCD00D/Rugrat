package ragDB.query.expression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import ragDB.common.main.TabCreate;
import ragDB.database.TableDetails.DBTables;
import ragDB.database.TableDetails.TableData;
import ragDB.query.Operators.ComparisonOperators;
import ragDB.query.Print.PrintOperator;

/**
 * @author Arthi Constructs the Where_Expression in a query
 */
public class WhereExpression {

	static List<TableData> selectedTables;
	static Random randomTable;
	static Random randomParam;
	static Random branchINWhere;
	int branchTaken;
	ComparisonOperators comparisonOpers;

	static List<String> paramsINAggExpr;
	static int totalParams;
	static Random selectParamsSize;
	static PrintOperator printOper;
	private String paramB4WhrDT;

	// Can be simple comparison operators, keywords "in","like","not in" with
	// constant values or subqueries
	// Since we want the queries to be more complex...we give the first case
	// only 25% probability and the other 2 35% and 40%
	// This is decided by the random variable branchINWhere and integer value
	// 	branchTaken
	// Arguments: Tables used, Parameters used in Aggregate functions
	public WhereExpression(List<String> tableNames,
			List<String> paramsINAggNames) {

		if (branchINWhere == null)
			branchINWhere = new Random();

		selectParamsSize = new Random(); // To pick number of parameters
		randomTable = new Random(); // To pick random table
		randomParam = new Random(); // To pick random parameter

		if (paramsINAggNames != null)
			paramsINAggExpr = new ArrayList<String>(paramsINAggNames);
		else
			paramsINAggExpr = new ArrayList<String>();

		branchTaken = branchINWhere.nextInt(100);

		DBTables dbtablesLocal = TabCreate.getAllTables();
		selectedTables = new ArrayList<TableData>(
				dbtablesLocal.getTablesbyName(tableNames));
		// Total number of parameters in the selectedTables
		totalParams = DBTables.getTotalParams(selectedTables);
		// Create an instance of the Operators class
		comparisonOpers = new ComparisonOperators(); 
		printOper = new PrintOperator();
	}

	public List<String> branchINWhereExpr(StringBuilder query) {

		List<String> resultQueryandDT = new ArrayList<String>();

		String[] complexOperators = { "IN", "NOT IN", "EXISTS", "NOT EXISTS" };
		List<HashMap<String, String>> selectedParameters = new ArrayList<HashMap<String, String>>();

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("WhereExpression: Could not load the properties file: "
							+ configFileError);
		}

		String useConstant = prop.getProperty("selectQ.useConstantValue");
		int size = 0;
		if (useConstant.equals("false")) {
			size = 2;
		}
		selectedParameters = SelectParameters(size);

		if (Integer.parseInt(prop.getProperty("flag.nested")) == 1
				|| Integer.parseInt(prop.getProperty("flagUpdate.nested")) == 1) {
			// Keywords "in", "not in" etc with sub-queries
			resultQueryandDT = WhereInComplexN(selectedParameters, query,
					complexOperators);
		} else {
			// Give 25% probability for comparison operators
			if (this.branchTaken <= 25) {

				resultQueryandDT = WhereSimpleCompare(selectedParameters, query);
			} else {
				resultQueryandDT = WhereInComplex(selectedParameters, query,
						complexOperators);
			}
		}
		return resultQueryandDT;
	}

	// IN, NOT IN, EXISTS, NOT EXISTS - using raw data
	private List<String> WhereInComplex(
			List<HashMap<String, String>> selectedParameters,
			StringBuilder query, String[] complexOperators) {

		Random oprComplex = new Random();
		String operator = complexOperators[oprComplex.nextInt(2)];

		String param = selectedParameters.get(0).keySet().toString();
		param = param.replace('[', ' ').replace(']', ' ').trim();
		String datatype = selectedParameters.get(0).values().toString();

		query.append(param + " " + operator + " " + "(");
		Random numberOfItemsRandom = new Random();
		int numberOfItems = numberOfItemsRandom.nextInt(20);
		if (numberOfItems == 0)
			numberOfItems = 1;

		// Since only one operator, generate random number/string according to
		// data type
		if (datatype.contains("int") || datatype.contains("float")) {
			for (int counter = 0; counter < numberOfItems; counter++) {
				int randomData = (int) Math.floor(Math.random() * 11);
				query.append(randomData);
				if (counter + 1 != numberOfItems) {
					query.append(",");
				}
			}

		} else // char or varchar
		{
			Random r = new Random();

			for (int counter = 0; counter < numberOfItems; counter++) {
				String token = "'" + Long.toString(Math.abs(r.nextLong()), 36)
						+ "'";
				query.append(token);
				if (counter + 1 != numberOfItems) {
					query.append(",");
				}
			}
		}
		query.append(") ");

		// No need to note the datatype of the previous query as it is not a
		// nested query
		paramB4WhrDT = null;
		List<String> returnValue = new ArrayList<String>();
		returnValue.add(query.toString());
		returnValue.add(paramB4WhrDT);
		return returnValue;
	}

	// IN, NOT IN, EXISTS, NOT EXISTS - using Subquery
	private List<String> WhereInComplexN(
			List<HashMap<String, String>> selectedParameters,
			StringBuilder query, String[] complexOperators) {
		int flag = 0;
		Random oprComplex = new Random();
		String operator = complexOperators[oprComplex.nextInt(4)];

		String param = selectedParameters.get(0).keySet().toString();
		String datatype = selectedParameters.get(0).values().toString();
		param = param.replace('[', ' ').replace(']', ' ').trim();
		if (operator.equals("NOT EXISTS") || operator.equals("EXISTS")) {
			flag = 1;
			query.append(operator + " ");
		} else {
			query.append(param + " " + operator + " ");
		}
		query.append("SUBQUERY ");

		if (flag == 1) {
			// No need to note the datatype of the previous query as even though
			// it is nested, EXISTS OR NOT EXISTS does not need it
			paramB4WhrDT = null;
			List<String> returnValue = new ArrayList<String>();
			returnValue.add(query.toString());
			returnValue.add(paramB4WhrDT);
			return returnValue;
		} else {
			// Note the datatype of previous element
			paramB4WhrDT = datatype;
			List<String> returnValue = new ArrayList<String>();
			returnValue.add(query.toString());
			returnValue.add(paramB4WhrDT);
			return returnValue;
		}
	}

	// builds simple comparison expressions with constants or with other
	// parameter of same type
	// Example: p_5_10 >10 , p_5_10>p_5_20
	List<String> WhereSimpleCompare(
			List<HashMap<String, String>> selectedParameters,
			StringBuilder query) {
		int parametersCount = selectedParameters.size();
		// prop.getProperty("flag.nested"))
		// If just one check the data type of the parameter and pick any
		// comparison operator
		if (parametersCount == 1) {
			String datatype = selectedParameters.get(0).values().toString();
			String operator = comparisonOpers.GetSimpleOperator(datatype);

			// Since only one operator, generate random number/string according
			// to data type
			if (datatype.contains("int") || datatype.contains("float")) {
				int randomData = (int) Math.floor(Math.random() * 11);
				// Add to end of query after "where" keyword in the pattern
				// "param operator value"
				query = printOper.printSimpleOperator(query, selectedParameters
						.get(0).keySet().toString(), null,
						Integer.toString(randomData), operator);
			} else // char or varchar
			{
				Random r = new Random();
				String token = "'" + Long.toString(Math.abs(r.nextLong()), 36)
						+ "'";

				// Add to end of query after "where" keyword in the pattern
				// "param operator value"
				query = printOper.printSimpleOperator(query, selectedParameters
						.get(0).keySet().toString(), null, token, operator);
			}
		} else {
			Random andorOperator = new Random();
			for (int i = 0; i < parametersCount; i++) {
				String param = selectedParameters.get(i).keySet().toString();
				String datatype = selectedParameters.get(0).values().toString();
				String operator = comparisonOpers.GetSimpleOperator(datatype);

				// Since only one operator, generate random number/string
				// according to data type
				if (datatype.contains("int") || datatype.contains("float")) {
					int randomData = (int) Math.floor(Math.random() * 11);
					// Add to end of query after "where" keyword in the pattern
					// "param operator value"
					query = printOper.printSimpleOperator(query, param, null,
							Integer.toString(randomData), operator);
				} else // char or varchar
				{
					Random r = new Random();
					String token = "'"
							+ Long.toString(Math.abs(r.nextLong()), 36) + "'";
					// Add to end of query after "where" keyword in the pattern
					// "param operator value"
					query = printOper.printSimpleOperator(query, param, null,
							token, operator);
				}

				if (i + 1 != parametersCount) {
					int selectAndOr = andorOperator.nextInt(2);
					String andorOpr = null;
					if (selectAndOr == 0)
						andorOpr = "and ";
					else
						andorOpr = "or ";
					query.append(andorOpr);
				}
			}
		}

		// No need to note the datatype of the previous query as it is not a
		// nested query
		paramB4WhrDT = null;
		List<String> returnValue = new ArrayList<String>();
		returnValue.add(query.toString());
		returnValue.add(paramB4WhrDT);
		return returnValue;
	}

	// To select a random list of parameters to be used in where expression
	List<HashMap<String, String>> SelectParameters(int size) {

		// Select the parameters to be in the where expression
		int currentParamsSize = selectParamsSize.nextInt(totalParams);

		if (currentParamsSize == 0) {
			currentParamsSize = 1;
		} else if (currentParamsSize > 10) {
			currentParamsSize = 10;
		}
		// For not using constant values
		if (size == 2) {
			if (currentParamsSize < 2) {
				currentParamsSize = size;
			}
		}

		List<HashMap<String, String>> selectedParameters = new ArrayList<HashMap<String, String>>();

		// Till the desired number of parameters is reached
		for (int counter = 0; counter < currentParamsSize; counter++) {
			// Select a random table
			TableData tbl = selectedTables.get(randomTable
					.nextInt(selectedTables.size()));

			// and then a random parameter in it
			HashMap<String, String> param = new HashMap<String, String>();
			int timesParam = 0;
			// Iterate till a new parameter is found which also does not exist
			// in parameters-in-aggregate expression
			do {

				if (timesParam > tbl.getNumOfParams())
					break;

				param = tbl.returnParam(randomParam.nextInt(tbl
						.getNumOfParams()));

				timesParam++;
			} while (selectedParameters.contains(param)
					|| paramsINAggExpr.contains(param.keySet().toString()));

			selectedParameters.add(param);
		}
		return selectedParameters;
	}
}
