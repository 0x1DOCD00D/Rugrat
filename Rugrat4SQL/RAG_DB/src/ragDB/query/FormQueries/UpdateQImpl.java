package ragDB.query.FormQueries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Stack;

import ragDB.common.main.TabCreate;
import ragDB.database.TableDetails.DBTables;
import ragDB.database.TableDetails.PrimaryKey;
import ragDB.database.TableDetails.TableData;
import ragDB.query.expression.TableExpression;
import ragDB.query.expression.WhereExpression;
import ragDB.query.grammar.GenericTreeNode;
import ragDB.query.grammar.UpdateTree;
import ragDB.query.Print.*;

/**
 * @author Arthi
 * Update Query generator
 */
public class UpdateQImpl {

	UpdateTree updateT;
	GenericTreeNode<String> rootNode;
	static DBTables dbtables;
	PrintExpr printExpr;
	static List<String> tablesSelected;
	List<String> allParameters;
	Properties prop;
	List<String> datatypeForSQ;
	List<String> tabNamesInUpdate;
	int tabNumberInUpdate;
	Boolean flagNested;
	Stack<String> allUpdateQueries;

	// Constructor
	UpdateQImpl() {
		updateT = new UpdateTree();
		this.rootNode = updateT.createUpdateTree();
		dbtables = TabCreate.getAllTables();
		// Initialize print expression print class
		printExpr = new PrintExpr();
		tablesSelected = new ArrayList<String>();
		allParameters = new ArrayList<String>();
		tabNamesInUpdate = new ArrayList<String>();
		allUpdateQueries = new Stack<String>();

		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("WhereExpression: Could not load the properties file: "
							+ configFileError);
		}

		datatypeForSQ = new ArrayList<String>();
	}

	public String returnOrderExp(Random tableSelect, Random paramSelect) {
		int tableIndex = tableSelect.nextInt(tablesSelected.size());
		TableData table = TabCreate.getAllTables().getTableByName(
				tablesSelected.get(tableIndex));
		int parameterIndex = paramSelect.nextInt(table.getNumOfParams());
		String selectedParam = table.returnParam(parameterIndex).keySet()
				.toString();
		return selectedParam.replace("[", "").replace("]", "");
	}

	// For set_expr parameters
	public List<HashMap<String, String>> returnParams() {
		// If it is a primary key...do not use it!
		int tableIndex = new Random().nextInt(tablesSelected.size());
		TableData table = TabCreate.getAllTables().getTableByName(
				tablesSelected.get(tableIndex));

		// Number of parameters in set expression
		int totalParams = table.getNumOfParams();
		int paramsINSetExpr = 0;

		if (totalParams != 0) {
			if (totalParams == 1)
				paramsINSetExpr = 1;
			else {
				Random pickNumber = new Random();
				do {
					paramsINSetExpr = pickNumber.nextInt(totalParams);
				} while (paramsINSetExpr == 0);
			}

			Random selectOneParam = new Random();
			List<HashMap<String, String>> setExpr = new ArrayList<HashMap<String, String>>();

			// Get table primary key info
			PrimaryKey tablePKInfo = table.GetTableKeyInfo();
			String tablePKParameter = null;
			if (tablePKInfo != null) {
				tablePKParameter = tablePKInfo.getpkParameter();

				for (int i = 0; i < paramsINSetExpr; i++) {
					HashMap<String, String> temp = null;
					boolean primarykeyTest = true;

					do {
						while (primarykeyTest == true) {
							int index = selectOneParam.nextInt(totalParams);
							temp = table.returnParam(index);
							if (!(tablePKParameter.equals(temp))) {
								primarykeyTest = false;
							}
						}
					} while (setExpr.contains(temp));
					// Add new parameter every time : TODO: ADD check for non
					// primary key here
					setExpr.add(temp);
				}
			}

			else {
				for (int i = 0; i < paramsINSetExpr; i++) {
					HashMap<String, String> temp = null;
					do {
						int index = selectOneParam.nextInt(totalParams);
						temp = table.returnParam(index);
					} while (setExpr.contains(temp));
					// Add new parameter every time : TODO: ADD check for non
					// primary key here
					setExpr.add(temp);
				}
			}
			return setExpr;
		} else {
			System.out.println("Error(UpdateQImpl): The table data is null");
			return null;
		}

	}

	public void GenerateUpdateQ(int no_updateQ) {
		int nestedLevel = Integer.parseInt(prop.getProperty("NestingLevel"));

		// Nested query: Level - Random Generator
		Random numRandom = new Random();

		for (int queryNum = 0; queryNum < no_updateQ; queryNum++) {
			int thisNestedLevel;
			if (nestedLevel != 0)
				thisNestedLevel = numRandom.nextInt(nestedLevel);
			else
				thisNestedLevel = 0;

			try {
				if (thisNestedLevel == 0) {

					prop.setProperty("flagUpdate.nested", "0");
					prop.store(new FileOutputStream("config.properties"), null);
					flagNested = false;
				} else {
					prop.setProperty("flagUpdate.nested", "1");
					prop.store(new FileOutputStream("config.properties"), null);
					flagNested = true;
				}
			} catch (Exception e) {
				System.out
						.println("UpdateQImpl: Cannot update 'flagUpdate.nested' in config");
				System.exit(1);
			}

			if (thisNestedLevel == 0) {

				String queryThisRun = GenerateUpdateQuery();
				allUpdateQueries.add(queryThisRun);
			} else {

				int numSQueriesNeeded = thisNestedLevel;
				int counter = 0;
				String queryThisRun = null;
				int countOfSQ = 0;

				List<String> selectSubQueries = new ArrayList<String>();
				do {

					if (counter == 1) {

						// Set flagUpdate.nested = 0
						prop.setProperty("flagUpdate.nested", "0");
						try {
							prop.store(
									new FileOutputStream("config.properties"),
									null);
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}

						// Generate inner nested select subqueries
						selectSubQueries = GenerateSubQForUpdateQ(
								numSQueriesNeeded, countOfSQ, datatypeForSQ,
								tabNamesInUpdate, tabNumberInUpdate);
					} else if (counter == 0) {
						queryThisRun = GenerateUpdateQuery();
						if (tablesSelected.size() > 1) {
							int startIndex = queryThisRun.indexOf("order");
							if (startIndex != -1) {
								queryThisRun = queryThisRun.substring(0,
										startIndex - 1) + ";";
							}
						}
						countOfSQ = getCountOfSQ(queryThisRun);
					}
					// dsQuery.push(queryThisRun);
					counter++;
				} while (counter < 2);

				PrintNestedUpdateQ printNQuery = new PrintNestedUpdateQ();
				String nestedQuery = printNQuery.BuildEntireQuery(queryThisRun,
						selectSubQueries);
				allUpdateQueries.add(nestedQuery);
			}

		}

		// WriteToFile
		QueryWriteToFile writeFile = new QueryWriteToFile();
		writeFile.WriteToFile(allUpdateQueries, "update");
		// WriteToXML
		UpdateInsertQWriteXML writeToXML = new UpdateInsertQWriteXML("update");
		writeToXML.WriteToXML(allUpdateQueries);
	}

	// For select sub queries
	private List<String> GenerateSubQForUpdateQ(int numSQueriesNeeded,
			int countOfSQ, List<String> datatypeForSQ,
			List<String> tablesINUpdate, int numTabsINUpdate) {
		List<String> allSelectSubQueries = new ArrayList<String>();

		int numOfSQ = numSQueriesNeeded / countOfSQ;
		prop.setProperty("Update.NeededSelectQ", Integer.toString(numOfSQ));
		try {
			prop.store(new FileOutputStream("config.properties"), null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int counter = 0; counter < countOfSQ; counter++) {
			String thisQuery = getSelectQuery(datatypeForSQ.get(counter),
					tablesINUpdate, numTabsINUpdate);
			allSelectSubQueries.add(thisQuery);
		}
		return allSelectSubQueries;
	}

	private String GenerateUpdateQuery() {

		Random pickChild = new Random();
		Random numberOfTables = new Random();
		Random paramForOrderBy = new Random();
		Random tableSelect = new Random();
		int tableExprNumOfTabs = DBTables.tables.size();

		GenericTreeNode<String> node = this.rootNode;
		StringBuilder queryBuilder = new StringBuilder();

		while (node.data != ";") {

			if (node.data.contains("expr")) {
				if (node.data == "table_expr") {
					TableExpression tExpr = new TableExpression();
					// false is for join statement
					// null is for datatype, tablesNotToUse :nested
					int numberTables = numberOfTables
							.nextInt(tableExprNumOfTabs / 2);
					if (numberTables == 0)
						numberTables = 1;
					tablesSelected = tExpr.getTables(numberTables, false, null,
							null);
					tabNamesInUpdate = tablesSelected;
					tabNumberInUpdate = numberTables;
					queryBuilder = printExpr.TablesPrint(tablesSelected,
							queryBuilder);
				} else if (node.data == "set_expr") {

					// select non-primary key attribute from the table being set
					// generate a random value according to the attribute type
					List<HashMap<String, String>> setExprParams = returnParams();

					for (int counter = 0; counter < setExprParams.size(); counter++) {
						String[] pairKeyValue = setExprParams.get(counter)
								.toString().split("=");
						String key = pairKeyValue[0].replace("{", "");
						String value = pairKeyValue[1].replace("}", "");

						int isNested = Integer.parseInt(prop
								.getProperty("flagUpdate.nested"));
						StringBuilder eachParam = new StringBuilder();
						if (isNested == 1) {
							datatypeForSQ.add(value);
							eachParam.append(key).append("=")
									.append(" SUBQUERY");
						} else {
							if (value.contains("float")
									|| value.contains("int")) {
								String randomData = Integer.toString((int) Math
										.floor(Math.random() * 11));
								eachParam.append(key).append("=")
										.append(randomData);
							} else if (value.contains("char")
									|| value.contains("varchar")) {
								Random r = new Random();
								String randomData = "'"
										+ Long.toString(Math.abs(r.nextLong()),
												36) + "'";
								eachParam.append(key).append("=")
										.append(randomData);
							}
						}

						if (counter != setExprParams.size() - 1)
							eachParam.append(" ,");
						else
							eachParam.append(" ");

						queryBuilder.append(eachParam);
					}

				} else if (node.data == "where_expr") {
					WhereExpression whereExpr = new WhereExpression(
							tablesSelected, null);
					List<String> resultElements = whereExpr
							.branchINWhereExpr(queryBuilder);
					queryBuilder = new StringBuilder(resultElements.get(0));
					String datatype = resultElements.get(1);
					datatypeForSQ.add(datatype);
				} else if (node.data == "var_select_expr") {
					String parameterInOrderBy = returnOrderExp(tableSelect,
							paramForOrderBy);
					queryBuilder.append(parameterInOrderBy + " ");
				}
			} else {
				// just include to the query string
				queryBuilder.append(node.data + " ");// Space after each keyword

			}
			// get number of children, pick a random number and go to that
			// children
			List<GenericTreeNode<String>> listChildren = node.getChildren();
			node = listChildren.get(pickChild.nextInt(listChildren.size()));
		}

		// Append the ; to the end of the query
		queryBuilder.append(node.data);

		// String Query is formed from the queryBuilder
		String query = new String(queryBuilder);
		return query;
	}

	// Gets the inner nested subquery for an update query
	// returns : String representing query
	private String getSelectQuery(String datatype, List<String> tablesINUpdate,
			int numTabsINUpdate) {
		String innerQuery = null;
		SelectQImpl selectQuery = new SelectQImpl();

		Stack<String> selectQueries = selectQuery.sQueriesForNUpdate(datatype,
				tablesINUpdate);

		PrintInnerSelectQueries printQuery = new PrintInnerSelectQueries();

		innerQuery = printQuery.BuildEntireQuery(selectQueries);

		return innerQuery;

	}

	// Determines number of select subqueries needed in a single update query
	// returns : count of required select queries
	private int getCountOfSQ(String queryThisRun) {
		String searchFor = "SUBQUERY";
		int len = searchFor.length();
		int result = 0;
		if (len > 0) {
			int start = queryThisRun.indexOf(searchFor);
			while (start != -1) {
				result++;
				start = queryThisRun.indexOf(searchFor, start + len);
			}
		}
		return result;
	}
}