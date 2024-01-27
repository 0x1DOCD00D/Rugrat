package ragDB.query.FormQueries;

import java.io.FileInputStream;
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
import ragDB.query.Print.PrintNestedInsertQ;
import ragDB.query.Print.QueryWriteToFile;
import ragDB.query.Print.UpdateInsertQWriteXML;
import ragDB.query.expression.InsertExpression;
import ragDB.query.expression.TableExpression;
import ragDB.query.grammar.GenericTreeNode;
import ragDB.query.grammar.InsertTree;

/**
 * @author Arthi 
 * Insert Query Generator
 */
public class InsertQImpl {

	InsertTree insertT;
	GenericTreeNode<String> rootNode;
	static DBTables dbtables;
	static StringBuilder queryBuilder;
	List<String> tablesReturned;
	List<HashMap<String, String>> parametersReturned;
	Properties prop;
	Boolean flagNested;
	Stack<String> allInsertQueries;

	public InsertQImpl() {
		insertT = new InsertTree();
		this.rootNode = insertT.createInsertTree();
		dbtables = TabCreate.getAllTables();
		allInsertQueries = new Stack<String>();

		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("WhereExpression: Could not load the properties file: "
							+ configFileError);
		}
	}

	public void GenerateInsertQ(int no_InsertQ) {

		int nestedLevel = Integer.parseInt(prop.getProperty("NestingLevel"));

		// Nested query: Level - Random Generator
		Random numRandom = new Random();

		for (int queryNum = 0; queryNum < no_InsertQ; queryNum++) {
			int thisNestedLevel;
			if (nestedLevel != 0)
				thisNestedLevel = numRandom.nextInt(nestedLevel);
			else
				thisNestedLevel = 0;

			try {
				if (thisNestedLevel == 0) {

					prop.setProperty("flagInsert.nested", "0");
					prop.store(new FileOutputStream("config.properties"), null);
					flagNested = false;
				} else {
					prop.setProperty("flagInsert.nested", "1");
					prop.store(new FileOutputStream("config.properties"), null);
					flagNested = true;
				}
			} catch (Exception e) {
				System.out
						.println("InsertQImpl: Cannot update 'flagInsert.nested' in config");
				System.exit(1);
			}

			if (thisNestedLevel == 0) {

				String queryThisRun = GenerateInsertQuery();
				allInsertQueries.add(queryThisRun);
			} else {

				// Initial insert query : with space for subqueries
				String queryThisRun = GenerateInsertQuery();
				List<String> dtUsed = new ArrayList<String>();
				for (int j = 0; j < parametersReturned.size(); j++) {
					dtUsed.add(parametersReturned.get(j).values().toString());
				}

				int numSQueriesNeeded = thisNestedLevel - 1;
				Stack<String> selectSubQueries = new Stack<String>();
				for (int i = 0; i < numSQueriesNeeded; i++) {
					String selectQ = GetSelectQuery(dtUsed);
					selectSubQueries.push(selectQ);
				}
				PrintNestedInsertQ printExpr = new PrintNestedInsertQ();
				String entireNestedQ = printExpr.BuildEntireQuery(queryThisRun,
						selectSubQueries);
				allInsertQueries.add(entireNestedQ);
			}
		}
		// WriteToFile
		QueryWriteToFile writeFile = new QueryWriteToFile();
		writeFile.WriteToFile(allInsertQueries, "insert");
		// Write to XML
		UpdateInsertQWriteXML writeToXML = new UpdateInsertQWriteXML("insert");
		writeToXML.WriteToXML(allInsertQueries);
	}

	private String GetSelectQuery(List<String> dtUsed) {
		SelectQImpl selectQuery = new SelectQImpl();
		String eachSelectQ = selectQuery.sQueriesForNInsert(tablesReturned,
				dtUsed);
		return eachSelectQ;
	}

	private String GenerateInsertQuery() {
		GenericTreeNode<String> node = this.rootNode;
		Random pickChild = new Random();
		queryBuilder = new StringBuilder();

		while (node.data != ";") {
			if (node.data.contains("expr")) {
				if (node.data == "priority_expr") {
					// Can be LOW_PRIORITY OR HIGH_PRIORITY
					int lowhigh_Boolean = new Random().nextInt(1);
					if (lowhigh_Boolean == 0) {
						queryBuilder.append("Low_Priority ");
					} else
						queryBuilder.append("High_Priority ");
				}

				else if (node.data == "table_expr") {
					tablesReturned = new ArrayList<String>();
					TableExpression tableExp = new TableExpression();
					// false is for join statement
					// null is for datatype, tables in insert :nested
					tablesReturned = tableExp.getTables(1, false, null, null);
					queryBuilder.append(tablesReturned.get(0).toString() + " ");
				}

				else if (node.data == "column_expr") {
					InsertExpression insertExpr = new InsertExpression();
					// tablesReturned.get(0): Only one table - since it is an
					// insert query
					List<HashMap<String, String>> columnsUsed = insertExpr
							.ReturnInsertColumns(tablesReturned.get(0));
					int totalSize = new DBTables("dummy").getTableByName(
							tablesReturned.get(0)).getNumOfParams();
					if (columnsUsed.size() == totalSize) {
						parametersReturned = columnsUsed;
					} else {

						parametersReturned = columnsUsed;
						String columnsStatement = BuildColumnsStat(parametersReturned);
						queryBuilder.append(columnsStatement);
					}
				} else if (node.data == "columnvalues_expr") {
					if (flagNested == false) {
						String[] valuesArray = BuildColumnValuesExpr();
						int counter = 0;
						int length = valuesArray.length;
						queryBuilder.append("(");
						for (String value : valuesArray) {
							counter++;
							queryBuilder.append(value);
							if (length != counter) {
								queryBuilder.append(",");
							}
						}
						queryBuilder.append(") ");
					} else {
						queryBuilder.append("SUBQUERY");
					}
				}
			} else {

				if (node.data == "values") {
					int temp = Integer.parseInt(prop
							.getProperty("flagInsert.nested"));
					if (temp == 0) {
						queryBuilder.append(node.data + " ");
					}
				} else {
					// just include to the query string
					queryBuilder.append(node.data + " ");
				}
			}
			// get number of children, pick a random number and go to that
			// children
			List<GenericTreeNode<String>> listChildren = node.getChildren();
			node = listChildren.get(pickChild.nextInt(listChildren.size()));

		}
		queryBuilder.append(node.data); // For semicolon

		// Convert StringBuilder to String
		String query = new String(queryBuilder);
		return query;

	}

	private String BuildColumnsStat(List<HashMap<String, String>> parameters) {

		StringBuilder columnExpression = new StringBuilder();
		columnExpression.append("(");
		int counter = 0;
		int length = parameters.size();
		for (HashMap<String, String> i : parameters) {
			counter++;
			String param = i.keySet().toString();
			param = param.replace("[", "").replace("]", "");
			columnExpression.append(param);
			if (counter != length) {
				columnExpression.append(",");
			}
		}
		columnExpression.append(") ");
		return columnExpression.toString();
	}

	private String[] BuildColumnValuesExpr() {
		String[] valuesArray = new String[parametersReturned.size()];
		int i = 0;
		for (HashMap<String, String> element : parametersReturned) {
			String value = element.values().toString();
			if (value.contains("float") || value.contains("int")) {
				String randomData = Integer.toString((int) Math.floor(Math
						.random() * 11));
				valuesArray[i++] = randomData;
			} else if (value.contains("char") || value.contains("varchar")) {
				Random r = new Random();
				String randomData = "'"
						+ Long.toString(Math.abs(r.nextLong()), 36) + "'";
				valuesArray[i++] = randomData;
			}
		}
		return valuesArray;
	}
}
