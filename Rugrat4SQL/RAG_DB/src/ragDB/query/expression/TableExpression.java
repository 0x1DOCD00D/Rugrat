package ragDB.query.expression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import ragDB.database.TableDetails.*;

/**
 * @author Arthi 
 * Constructs the Table_Expression in a query
 */
public class TableExpression {

	private static Random randTable;
	private static Random randPrimaryKey;
	private static List<PrimaryKey> selectedPK;
	Properties prop;
	int maxTablesAllowed;

	public TableExpression() {
		prop = new Properties();
		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("SelectQImpl: Could not load the properties file: "
							+ configFileError);
		}
		maxTablesAllowed = Integer.parseInt(prop
				.getProperty("TablesInQ.Maximum"));
	}

	public static List<PrimaryKey> GetSelectedPK() {
		return selectedPK;
	}

	public List<String> getTables(int numberOfTables, boolean isJoinExpr,
			List<String> datatype, List<String> tablesNotToUse) {
		List<String> selectedTables = new ArrayList<String>();

		int numOfTablesInUpdate = 0;

		if (tablesNotToUse != null) {
			numOfTablesInUpdate = tablesNotToUse.size();
		} else {
			tablesNotToUse = new ArrayList<String>();
		}

		// To limit the number of tables in a query
		if (numberOfTables > maxTablesAllowed) {
			numberOfTables = maxTablesAllowed;
		}

		// If not a join statement
		if (!isJoinExpr) {
			if (numberOfTables == 0) {
				numberOfTables = 1;
			}
			// Selecting n(numberOfTables) random tables from the database
			int totalTables = DBTables.tables.size();
			if (totalTables < (numberOfTables + numOfTablesInUpdate)) {
				numberOfTables = totalTables - numOfTablesInUpdate;
			}
			randTable = new Random();

			// To select <numberOfTables> unique tables
			if (totalTables >= numberOfTables) {
				for (int i = 0; i < numberOfTables; i++) {
					TableData table = DBTables.tables.get(randTable
							.nextInt(totalTables));
					if (selectedTables.contains(table.getTableName())) {
						i--;
					} else {
						selectedTables.add(table.getTableName());
					}
				}
			}
		}
		// If it is a join statement
		else if (isJoinExpr) {
			List<PrimaryKey> selectedPrimaryKeys = new ArrayList<PrimaryKey>();

			// Join needs atleast 2 tables
			if (numberOfTables < 2) {
				numberOfTables = 2;
			}

			// Selecting n(numberOfTables) random tables from the database
			randTable = new Random();
			randPrimaryKey = new Random();

			List<PrimaryKey> pkList = PrimaryKeyList.getAllPrimaryKeys();
			int numberOfPrimaryKeys = PrimaryKeyList.getNumberOfPrimaryKeys();

			// Pick any primary key
			PrimaryKey pk = pkList.get(randPrimaryKey
					.nextInt(numberOfPrimaryKeys));
			int numberOfTablesObtained = 1;
			if (pk.getfkList() != null)
				numberOfTablesObtained += pk.getfkList().size(); 
			selectedPrimaryKeys.add(pk);

			int totalTables = DBTables.tables.size();
			int numberChecked = 0;
			// Repeat till the needed number of tables or the maximum is
			// obtained
			while (numberOfTablesObtained <= numberOfTables) {
				numberChecked++;
				if (numberChecked > totalTables) {
					break;
				}
				int counter = 0;

				// Obtaining more primary keys
				do {
					counter++;
					if (counter > numberOfPrimaryKeys)
						break;
					pk = pkList
							.get(randPrimaryKey.nextInt(numberOfPrimaryKeys));
				} while (selectedPrimaryKeys.contains(pk));

				if (counter <= numberOfPrimaryKeys) {
					selectedPrimaryKeys.add(pk);
					if (pk.getfkList() != null)
						numberOfTablesObtained += pk.getfkList().size() + 1;
					else
						numberOfTablesObtained += 1;
				}

			} // Outer While

			for (int counter = 0; counter < tablesNotToUse.size(); counter++) {
				String tableCurrent = tablesNotToUse.get(counter);
				for (int i = 0; i < selectedPrimaryKeys.size(); i++) {
					if ((selectedPrimaryKeys.get(i).getTable())
							.equals(tableCurrent)) {
						selectedPrimaryKeys.remove(i);
						i--;
					}
				}
			}

			// Assign to the global variable
			selectedPK = new ArrayList<PrimaryKey>();
			selectedPK = selectedPrimaryKeys;

			for (int i = 0; i < selectedPrimaryKeys.size(); i++) {

				String tableName = selectedPrimaryKeys.get(i).getTable();
				selectedTables.add(tableName);

				List<ForeignKey> fkList = selectedPrimaryKeys.get(i)
						.getfkList();

				if (fkList != null) {
					for (int j = 0; j < fkList.size(); j++) {
						String tableNamefk = fkList.get(j).getTable();
						selectedTables.add(tableNamefk);
					}
				}
			}
		}

		selectedTables.removeAll(tablesNotToUse);

		if (selectedTables.size() == 0) {
			List<String> useTheseTables = getRemainingTables(tablesNotToUse);

			List<PrimaryKey> allPrimaryKeys = PrimaryKeyList
					.getAllPrimaryKeys();

			List<String> tablesWithKey = new ArrayList<String>();

			List<PrimaryKey> primarykeyCurrent = new ArrayList<PrimaryKey>();

			for (int counter = 0; counter < useTheseTables.size(); counter++) {
				for (int i = 0; i < allPrimaryKeys.size(); i++) {
					if ((allPrimaryKeys.get(i).getTable())
							.equals(useTheseTables.get(counter))) {
						primarykeyCurrent.add(allPrimaryKeys.get(i));
						tablesWithKey.add(useTheseTables.get(counter));
						break;
					}
				}
			}
			selectedTables = tablesWithKey;
			selectedPK = primarykeyCurrent;
			if (tablesWithKey.size() == 0) {
				System.out
						.println("Error<TableExpression.java> The number of tables is too low for this operation");
				System.exit(1);
			}
		}
		return selectedTables;
	}

	private List<String> getRemainingTables(List<String> tablesNotToUse) {
		List<TableData> listOfAllTables = DBTables.tables;

		List<String> tablesToUse = new ArrayList<String>();
		for (int i = 0; i < listOfAllTables.size(); i++) {
			String tabName = listOfAllTables.get(i).getTableName();
			if (!(tablesNotToUse.contains(tabName))) {
				tablesToUse.add(tabName);
			}
		}
		return tablesToUse;
	}
}
