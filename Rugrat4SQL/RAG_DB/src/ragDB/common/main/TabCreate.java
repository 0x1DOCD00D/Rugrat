package ragDB.common.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.io.*;
import java.sql.*;

import ragDB.database.TableDetails.*;

/**
 * Class containing utilities to form create queries / excute in database
 * 
 * @author Arthi
 * 
 */
public class TabCreate {
	int numberTables;
	int minParams;
	int maxParams;
	int usedParams;

	int primaryKey;
	int foreignKey;
	private static Properties properties;
	String executeINDB;
	private static DBTables allTables;
	private static PrimaryKeyList primaryKeysInDB;
	TableData eachTable;
	static List<StringBuilder> queries;

	// Constructors
	protected TabCreate(int numTables, int minParameters, int maxParameters) {
		setProperties();
		int percentageOfkeys = Integer.parseInt(properties
				.getProperty("PercentageOfkeys"));
		executeINDB = properties.getProperty("ExecuteINDB.flag");
		percentageOfkeys = (percentageOfkeys * numTables) / 100;
		this.primaryKey = percentageOfkeys / 2 + percentageOfkeys % 2;
		this.foreignKey = percentageOfkeys / 2;
		this.numberTables = numTables;
		this.minParams = minParameters;
		this.maxParams = maxParameters;

		// Initiate classes in table details to store table,parameters and their
		// types
		allTables = new DBTables();

		// Initiate query list
		queries = new ArrayList<StringBuilder>();
	}

	public static PrimaryKeyList GetPrimaryKeyList() {
		return primaryKeysInDB;
	}

	private static void setProperties() {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out.println("Could not load the properties file: "
					+ configFileError);
		}
	}

	public static DBTables getAllTables() {
		return allTables;
	}

	public static Properties getConfig() {
		return properties;
	}

	// Returns true on success
	public boolean ReturnTables() {
		// Initiate primary key list
		primaryKeysInDB = new PrimaryKeyList();

		int counter = 1;
		usedParams = 0;

		// For primary, foreign keys and their flag
		int countPrimaryKeys = 0;
		int countForeignKeys = 0;
		String flagKey = null;

		// Creating random object to randomly chose a number in the range
		// min-max Params
		Random randIndexParams = new Random();
		Random randIndexDT = new Random();
		int range = maxParams - minParams + 1;

		try {
			String dataTypesString = properties
					.getProperty("parameter.dataTypes");
			String[] dataTypes = dataTypesString.split(",");

			while (counter <= numberTables) {
				// To check whether the number of needed primary keys is not
				// reached
				if (countPrimaryKeys < this.primaryKey) {
					flagKey = "primary";
				}
				// If primary keys are all set, to check whether the number of
				// foreign keys are reached
				else if (countForeignKeys < this.foreignKey) {
					flagKey = "foreign";
				}
				// Both primary and foreign keys are set, No action needed
				else {
					flagKey = null;
				}

				// selecting a random index from the number of parameters-range
				int numParams = randIndexParams.nextInt(range) + minParams;
				usedParams = usedParams + numParams;

				// Initial query string
				StringBuilder createTabQ = new StringBuilder();
				String tableName = "T_" + counter;
				createTabQ.append("create table T_" + counter + "(");
				eachTable = new TableData();
				HashMap<String, String> hashmap = new HashMap<String, String>();
				// Build and append each column "columnname datatype"
				for (int j = 0; j < numParams; j++) {

					int datatypeIndex = randIndexDT.nextInt(dataTypes.length);
					String dataTypeAppend = null;

					if (dataTypes[datatypeIndex].contains("char"))
						dataTypeAppend = dataTypes[datatypeIndex] + "(30)";
					else
						dataTypeAppend = dataTypes[datatypeIndex];

					// To create a primary key parameter in table
					if (j == 0 && flagKey == "primary") {
						String parameterToAdd = new StringBuilder("T_"
								+ counter + "_P_" + j).toString();

						PrimaryKey pkParam = new PrimaryKey(tableName,
								parameterToAdd, dataTypeAppend);
						primaryKeysInDB.AddPrimaryKey(pkParam);

						// Add the parameter as primary key to the query
						// Example: p_2 int Primary Key
						createTabQ.append(parameterToAdd + " " + dataTypeAppend
								+ " Primary Key");
						countPrimaryKeys++;
						flagKey = null;
					}

					// To create a foreign key parameter in table
					else if (flagKey == "foreign") {

						// Pick a primary key with same datatype
						PrimaryKey pkRandom = null;
						if (primaryKeysInDB != null) {
							pkRandom = primaryKeysInDB
									.getRandomPrimaryKey(dataTypeAppend);
						}

						if (pkRandom != null) {

							String fkParam = new StringBuilder("T_" + counter
									+ "_P_" + j).toString();

							primaryKeysInDB.RemovePrimaryKey(pkRandom);
							primaryKeysInDB.AddPrimaryKey(pkRandom);
							ForeignKey fkAdd = new ForeignKey("T_" + counter,
									fkParam, dataTypeAppend);
							pkRandom = pkRandom.AddForeignKey(fkAdd);

							createTabQ.append(fkParam + " " + dataTypeAppend
									+ ",");
							createTabQ.append("Foreign Key(" + fkParam
									+ ") references " + pkRandom.getTable()
									+ "(" + pkRandom.getpkParameter() + ")");

							countForeignKeys++;
							flagKey = null;
						} else if (pkRandom == null) {

							createTabQ.append("T_" + counter + "_P_" + j + " "
									+ dataTypeAppend);
							flagKey = "foreign";

						}

					}
					// If both primary and foreign key limit is reached
					else {
						createTabQ.append("T_" + counter + "_P_" + j + " "
								+ dataTypeAppend);
					}

					if (j + 1 != numParams)
						createTabQ.append(" ,");

					// Adding the parameter to the hashmap
					String key = "T_" + counter + "_P_" + j;
					hashmap.put(key, dataTypeAppend);

				}

				// Adding the tableDetails in Table data
				eachTable.addTableDetail("T_" + counter, hashmap);
				// Adding the tableData object to DBTables
				allTables.addTable(eachTable);

				// Close the Query statement
				createTabQ.append(");");
				// System.out.println(createTabQ);
				queries.add(createTabQ);

				counter++;
			} // All create queries are built and added to the "queries" list

			// Execute the built queries in database if flag is set true in
			// config
			if (executeINDB.equals("true")) {
				MysqlConnect sqlConn = new MysqlConnect(properties);
				if (sqlConn.conn == null)
					System.out.println("Error: Not connected to database");
				Statement stmt = sqlConn.conn.createStatement();
				boolean returnValue = executeQueryInDB(queries, stmt);
				return returnValue;
			}

			return true;
		} catch (Exception e) {
			System.out.println("Error:TabCreate<cannot build query>\n" + e);
			System.out.println("Check whether database is empty");
			System.exit(1);
		}
		// }
		return true;
	}

	// Purpose: To execute each statement on database
	// Arguments: queries to execute - queryToExecute
	// sql statement - stmt
	// return: void
	public boolean executeQueryInDB(List<StringBuilder> queryToExecute,
			Statement stmt) {
		System.out.println("Executing create statements on the database");
		if (queryToExecute == null) {
			System.out.println("Error: TabCreate.java<Cannot create tables>");
			return false;
		} else if (queryToExecute.size() == 0) {
			System.out
					.println("Error: TabCreate.java<There are no create queries>");
			return false;
		} else {
			for (int i = 0; i < queryToExecute.size(); i++) {
				// Execute the statement in the DB
				String createTabQuery = new String(queryToExecute.get(i));

				try {
					// System.out.println(createTabQuery);
					stmt.executeUpdate(createTabQuery);
				} catch (SQLException se) {
					System.out
							.println("Error:TabCreate<Cannot execute query in database - Table already exists>");
					return false;
				} catch (Exception e) {
					return false;
				}
			}
			return true;
		}
	}
}
