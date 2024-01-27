package ragDB.query.expression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import ragDB.database.TableDetails.DBTables;
import ragDB.database.TableDetails.TableData;

/**
 * @author Arthi 
 * Any SelectExpression instance should return a set of parameters
 *         with the set of table names
 */
public class SelectExpression {
	static List<String> tablesSelected;
	static List<HashMap<String, String>> paramsSelected;
	boolean isJoinExpr_true;
	List<String> thisDatatype;
	Properties prop;
	Boolean sExprInsertFlag;

	SelectExpression() {
	}

	public SelectExpression(int numberOfTables, int isJoinStmt,
			List<String> datatypeNeeded, List<String> tablesNotToUse,
			Boolean insertExpr) {

		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("WhereExpression: Could not load the properties file: "
							+ configFileError);
		}

		sExprInsertFlag = insertExpr;
		if (isJoinStmt == 1) {
			isJoinExpr_true = true;
		} else {
			isJoinExpr_true = false;
		}
		thisDatatype = datatypeNeeded;
		tablesSelected = new ArrayList<String>();
		paramsSelected = new ArrayList<HashMap<String, String>>();
		TableExpression tableExp = new TableExpression();
		tablesSelected = tableExp.getTables(numberOfTables, isJoinExpr_true,
				thisDatatype, tablesNotToUse);
	}

	public List<String> returnTables() {
		return tablesSelected;
	}

	public List<HashMap<String, String>> returnSelectExpr(int numParamsInSQ) {

		if (thisDatatype == null && thisDatatype.size() == 0) {
			// No nested query format
		} else {
			int isInsert = Integer.parseInt(prop
					.getProperty("flagInsert.nested"));
			if (isInsert == 0) {
				numParamsInSQ = 1;
				return getParams(numParamsInSQ);
			} else {
				return getParamsInsertQ(thisDatatype.size());
			}
		}
		tablesSelected = null;
		return paramsSelected;
	}

	private List<HashMap<String, String>> getParamsInsertQ(int numParamsInSQ) {
		// TODO Auto-generated method stub
		if (sExprInsertFlag == false) {
			return getParams(1);
		} else {
			// Add to parametersSelected
			Random selectSingleTable = new Random();
			int numTables = tablesSelected.size();
			for (int i = 0; i < numParamsInSQ; i++) {
				String thisDT = thisDatatype.get(i);
				int numberOfTablesSearched = 0;
				boolean flagObtained = false;

				do {

					numberOfTablesSearched++;
					String tabName = tablesSelected.get(selectSingleTable
							.nextInt(numTables));
					DBTables dbtables = new DBTables("dummy");
					TableData td = dbtables.getTableByName(tabName);
					int numParamsInTable = td.getNumOfParams();

					for (int j = 0; j < numParamsInTable; j++) {
						HashMap<String, String> thisParam = td.returnParam(j);
						if ((thisParam.values().toString())
								.equalsIgnoreCase(thisDT)) {
							flagObtained = true;
							paramsSelected.add(thisParam);
							break;
						}
					}

				} while (flagObtained == false
						&& numberOfTablesSearched <= numTables);

				// Generate own value
				if (flagObtained == false) {
					if (thisDT.contains("float") || thisDT.contains("int")) {
						String randomData = Integer.toString((int) Math
								.floor(Math.random() * 11));
						HashMap<String, String> temp = new HashMap<String, String>();
						temp.put(randomData, thisDT);
						paramsSelected.add(temp);
					} else if (thisDT.contains("char")
							|| thisDT.contains("varchar")) {
						Random r = new Random();
						String randomData = "'"
								+ Long.toString(Math.abs(r.nextLong()), 36)
								+ "'";
						HashMap<String, String> temp = new HashMap<String, String>();
						temp.put(randomData, thisDT);
						paramsSelected.add(temp);
					}
				}
			}
		}
		return paramsSelected;
	}

	private List<HashMap<String, String>> getParams(int numParamsInSQ) {
		// Can select between 0 to n parameters in select expression
		Random selectSingleTable = new Random();
		Random selectSingleParam = new Random();
		for (int i = 0; i < numParamsInSQ; i++) {

			String tabName = tablesSelected.get(selectSingleTable
					.nextInt(tablesSelected.size()));
			DBTables dbtables = new DBTables("dummy");
			TableData td = dbtables.getTableByName(tabName);
			int p = 0;

			int totalP = td.getNumOfParams();
			int checkedP = 0;
			boolean flagToAdd = true;
			do {
				checkedP++;
				if (checkedP > totalP) {
					flagToAdd = false;
					break;
				}
				p = selectSingleParam.nextInt(td.getNumOfParams());

				// To get the parameter of required datatype
				if (thisDatatype != null && thisDatatype.size() != 0) {
					String dataypeOfParam = td.returnParam(p).values()
							.toString();
					if (!(dataypeOfParam.equals(thisDatatype.get(0)))) {
						checkedP--;
						continue;
					}
				}
			} while (paramsSelected.contains(td.returnParam(p)));

			if (flagToAdd == true)
				paramsSelected.add(td.returnParam(p));
		}
		return paramsSelected;
	}
}
