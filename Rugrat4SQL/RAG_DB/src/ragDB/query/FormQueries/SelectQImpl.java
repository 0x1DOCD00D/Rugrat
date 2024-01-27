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

import ragDB.query.Print.PrintExpr;
import ragDB.query.Print.PrintNestedSelectQ;
import ragDB.query.Print.QueryWriteToFile;
import ragDB.query.Print.SelectQWriteXML;
import ragDB.query.expression.GroupExpression;
import ragDB.query.expression.JoinExpression;
import ragDB.query.expression.SelectExpression;
import ragDB.query.expression.TableExpression;
import ragDB.query.expression.WhereExpression;
import ragDB.query.grammar.*;
import ragDB.common.main.*;
import ragDB.database.TableDetails.DBTables;
import ragDB.database.TableDetails.PrimaryKey;

/**
 * @author Arthi
 * Select Query generator
 */
public class SelectQImpl {

	SelectTree selectT;
	GenericTreeNode<String> rootNode;
	static DBTables dbtables;
	static StringBuilder queryBuilder;
	static List<String> tablesReturned;
	static List<HashMap<String, String>> parametersReturned;
	static List<String> aggParameters;
	int tableExprNumOfTabs;
	static Properties prop;
	int CONST_JOINSTMT = 0;
	List<String> dataTypeToUse;
	List<String> tablesNotToUse;
	Boolean selectExprFlag;
	Stack<String> allSelectQueries;

	public SelectQImpl() {
		selectT = new SelectTree();
		this.rootNode = selectT.createSelectTree();
		dbtables = TabCreate.getAllTables();
		aggParameters = new ArrayList<String>();
		allSelectQueries = new Stack<String>();

		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("SelectQImpl: Could not load the properties file: "
							+ configFileError);
		}

		tableExprNumOfTabs = DBTables.tables.size();
		dataTypeToUse = new ArrayList<String>();
		tablesNotToUse = new ArrayList<String>();
	}

	public String returnOrderExp(List<HashMap<String, String>> parameters,
			Random paramSelect) {
		int index = paramSelect.nextInt(parameters.size());
		String selectedParam = parameters.get(index).keySet().toString();
		return selectedParam.replace("[", "").replace("]", "");
	}

	public Stack<String> sQueriesForNUpdate(String datatype,
			List<String> tablesINUpdate) {

		tablesNotToUse = tablesINUpdate;
		dataTypeToUse.add(datatype);
		int temp = Integer.parseInt(prop.getProperty("Update.NeededSelectQ"));
		int numOfQueriesForNU = temp - 1;
		try {
			if (temp == 0) {

				prop.setProperty("flag.nested", "0");
				prop.store(new FileOutputStream("config.properties"), null);
			} else {
				prop.setProperty("flag.nested", "1");
				prop.store(new FileOutputStream("config.properties"), null);
			}
		} catch (Exception e) {
			System.out
					.println("SelectQImpl: Cannot update 'flag.nested' in config");
			System.exit(1);
		}

		Stack<String> selectQueries = buildNestedSQ(numOfQueriesForNU, true);
		return selectQueries;
	}

	public String sQueriesForNInsert(List<String> tablesINInsert,
			List<String> datatype) {

		dataTypeToUse = datatype;
		tablesNotToUse = tablesINInsert;
		int temp = Integer.parseInt(prop.getProperty("NestingLevel"));
		int thisNL = (new Random()).nextInt(temp / 2);
		try {
			if (thisNL == 0) {
				prop.setProperty("flag.nested", "0");
				prop.store(new FileOutputStream("config.properties"), null);
			} else {
				prop.setProperty("flag.nested", "1");
				prop.store(new FileOutputStream("config.properties"), null);
			}
		} catch (Exception e) {
			System.out
					.println("SelectQImpl: Cannot update 'flag.nested' in config");
			System.exit(1);
		}
		selectExprFlag = true;
		if (thisNL == 0) {
			String queryThisRun = GenerateEachSubQuery();
			// System.out.println("The single select query is :"+ queryThisRun);
			return queryThisRun;
		} else {
			Stack<String> allSelectQs = buildNestedSQ(thisNL, true);
			// for(int counter=0;counter<allSelectQs.size();counter++){
			// System.out.println(counter+" query is "+allSelectQs.get(counter));
			// }
			PrintNestedSelectQ printNQuery = new PrintNestedSelectQ();
			String nestedQuery = printNQuery.BuildEntireQuery(allSelectQs);
			// System.out.println("The nested select query is :"+ nestedQuery);
			return nestedQuery;
		}
	}

	public void GenerateSelectQ(int numOfSelectQuery) {
		int no_selectQ = numOfSelectQuery;

		tableExprNumOfTabs = DBTables.tables.size();

		// Nested Level - from config file
		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("SelectQImpl: Could not load the properties file: "
							+ configFileError);
		}
		int nestedLevel = Integer.parseInt(prop.getProperty("NestingLevel"));

		// Nested query: Level - Random Generator
		Random numRandom = new Random();

		for (int queryNum = 0; queryNum < no_selectQ; queryNum++) {
			int thisNestedLevel;
			if (nestedLevel != 0)
				thisNestedLevel = numRandom.nextInt(nestedLevel);
			else
				thisNestedLevel = 0;

			try {
				if (thisNestedLevel == 0) {

					prop.setProperty("flag.nested", "0");
					prop.store(new FileOutputStream("config.properties"), null);
				} else {
					prop.setProperty("flag.nested", "1");
					prop.store(new FileOutputStream("config.properties"), null);
				}
			} catch (Exception e) {
				System.out
						.println("SelectQImpl: Cannot update 'flag.nested' in config");
				System.exit(1);
			}

			if (thisNestedLevel == 0) {

				String queryThisRun = GenerateEachSubQuery();
				allSelectQueries.push(queryThisRun);
			} else {
				buildNestedSQ(thisNestedLevel, false);
			}
		}

		// Writing to file
		QueryWriteToFile writeFile = new QueryWriteToFile();
		writeFile.WriteToFile(allSelectQueries, "select");
		// Writing to xml
		SelectQWriteXML writeXML = new SelectQWriteXML();
		writeXML.WriteToXML(allSelectQueries);
	}

	private Stack<String> buildNestedSQ(int thisNestedLevel, boolean flag) {
		// Build Stack
		Stack<String> dsQuery = new Stack<String>();

		int numQueriesNeeded = thisNestedLevel + 1;
		// System.out.println("Needed Queries :"+numQueriesNeeded);
		int counter = 0;
		do {
			if (counter + 1 == numQueriesNeeded) {
				// Last or Innermost Sub-Query
				// Set nested.flag = 0
				prop.setProperty("flag.nested", "0");
				try {
					prop.store(new FileOutputStream("config.properties"), null);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			String queryThisRun = GenerateEachSubQuery();
			dsQuery.push(queryThisRun);
			counter++;
		} while (counter < numQueriesNeeded);

		if (flag == false) {
			PrintNestedSelectQ printNQuery = new PrintNestedSelectQ();
			String nestedQuery = printNQuery.BuildEntireQuery(dsQuery);
			allSelectQueries.push(nestedQuery);
			return null;
		} else {
			return dsQuery;
		}

	}

	private String GenerateEachSubQuery() {
		// Datatype to give out in case of subqueries
		List<String> DataypeThisQuery = dataTypeToUse;
		List<String> tablesNotToUseThisQ = tablesNotToUse;

		Random numberOfTables = new Random();
		Random paramForOrderBy = new Random();

		GenericTreeNode<String> node = this.rootNode;
		Random pickChild = new Random();
		queryBuilder = new StringBuilder();
		parametersReturned = new ArrayList<HashMap<String, String>>();

		while (node.data != ";") {
			if (node.data.contains("expr")) {
				// Path taken according to keyword
				if (node.data == "select_expr") {
					// Initialize print expression print class
					PrintExpr exprPrint = new PrintExpr();

					SelectExpression sExpr = new SelectExpression(
							numberOfTables.nextInt(tableExprNumOfTabs),
							CONST_JOINSTMT, DataypeThisQuery,
							tablesNotToUseThisQ, selectExprFlag);
					selectExprFlag = false;
					tablesReturned = sExpr.returnTables();

					int numOfParams = 0;
					for (int k = 0; k < tablesReturned.size(); k++) {
						numOfParams += dbtables.getTableByName(
								tablesReturned.get(k)).getNumOfParams();
					}
					parametersReturned = sExpr.returnSelectExpr(numOfParams);
					// Add the obtained parameters to the query
					queryBuilder = exprPrint.ParametersPrint(queryBuilder,
							parametersReturned, false);
				}

				else if (node.data == "join_expr") {
					JoinExpression jExpr = new JoinExpression();
					// Get the primary keys present in selected tables
					List<PrimaryKey> selectedPK = TableExpression
							.GetSelectedPK();
					String joinTablesExpr = jExpr.GetJoinTableExpr(
							tablesReturned, selectedPK, tablesNotToUseThisQ);

					queryBuilder.append(joinTablesExpr);

				} else if (node.data == "on_expr") {
					// Join query identifier is again set to zero (reset)
					CONST_JOINSTMT = 0;
				} else if (node.data == "where_expr") {
					WhereExpression whereExpr = new WhereExpression(
							tablesReturned, aggParameters);
					List<String> resultElements = whereExpr
							.branchINWhereExpr(queryBuilder);
					queryBuilder = new StringBuilder(resultElements.get(0));
					dataTypeToUse = resultElements; // Was resultelements.get(1)
				}

				// Inclusion of group by in the query
				else if (node.data == "var_select_no_agg_expr") {
					GroupExpression grpExp = new GroupExpression();
					List<String> groupExprReturn = grpExp.formGroupExpr(
							queryBuilder, parametersReturned);
					if (groupExprReturn != null) {
						queryBuilder = new StringBuilder(groupExprReturn.get(0)); 
						aggParameters.add(groupExprReturn.get(1)); 
					}
				} else if (node.data == "desc_expr") {
					String parameterInOrderBy = returnOrderExp(
							parametersReturned, paramForOrderBy);
					queryBuilder.append(parameterInOrderBy + " desc ");
				} else if (node.data == "asc_expr") {
					String parameterInOrderBy = returnOrderExp(
							parametersReturned, paramForOrderBy);
					queryBuilder.append(parameterInOrderBy + " asc ");
				}
			} else if (node.data == "joinStmt_True") {
				CONST_JOINSTMT = 1;
			} else {
				// just include to the query string
				queryBuilder.append(node.data + " ");// Space after each keyword

				if (node.data == "from" && CONST_JOINSTMT != 1) {
					// Append the tables next to "from" keyword
					for (int counter = 0; counter < tablesReturned.size(); counter++) {
						if (tablesReturned.size() - 1 != counter)
							queryBuilder.append(tablesReturned.get(counter)
									+ ",");
						else
							queryBuilder.append(tablesReturned.get(counter)
									+ " ");
					}
				}
			}

			if (node.data == "select") {
				int isJoinPsbl = Integer.parseInt(prop
						.getProperty("PercentageOfkeys"));
				if (isJoinPsbl > 0) {
					List<GenericTreeNode<String>> listChildren = node
							.getChildren();
					node = listChildren.get(pickChild.nextInt(listChildren
							.size()));
				} else {
					List<GenericTreeNode<String>> listChildren = node
							.getChildren();
					node = listChildren.get(1);
				}
			} else if (Integer.parseInt(prop.getProperty("flag.nested")) == 1) {
				if (node.data == "on_expr" || node.data == "table_expr") {
					List<GenericTreeNode<String>> listChildren = node
							.getChildren();
					node = listChildren.get(1);
				} else {
					// get number of children, pick a random number and go to
					// that children
					List<GenericTreeNode<String>> listChildren = node
							.getChildren();
					node = listChildren.get(pickChild.nextInt(listChildren
							.size()));
				}
			} else {
				// get number of children, pick a random number and go to that
				// children
				List<GenericTreeNode<String>> listChildren = node.getChildren();
				node = listChildren.get(pickChild.nextInt(listChildren.size()));
			}
		}
		queryBuilder.append(node.data); // For semicolon

		// Convert StringBuilder to String
		String query = new String(queryBuilder);
		tablesReturned = null;
		return query;
	}
}