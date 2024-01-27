package ragDB.database.TableDetails;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * Class containing the list of primary key objects
 * 
 * @author Arthi
 */
public class PrimaryKeyList {

	private static List<PrimaryKey> allPrimaryKey;
	private static Random pickPrimaryonDataType;
	private Properties properties;
	static HashMap<String, List<PrimaryKey>> primaryKeysofDataTypes;
	static String[] dataTypeArray;

	public PrimaryKeyList() {
		if (allPrimaryKey == null) {
			allPrimaryKey = new ArrayList<PrimaryKey>();
			pickPrimaryonDataType = new Random();
			primaryKeysofDataTypes = new HashMap<String, List<PrimaryKey>>();

			try {
				this.properties = new Properties();
				properties.load(new FileInputStream("config.properties"));

				String dataTypes = properties
						.getProperty("parameter.dataTypes");
				dataTypeArray = dataTypes.split(",");

				for (int j = 0; j < dataTypeArray.length; j++) {
					primaryKeysofDataTypes = new HashMap<String, List<PrimaryKey>>();
					primaryKeysofDataTypes.put(dataTypeArray[j],
							new ArrayList<PrimaryKey>());
				}
			} catch (IOException configFileError) {
				System.out.println("Could not load the properties file: "
						+ configFileError);
			}
		}
	}

	public void AddPrimaryKey(PrimaryKey primaryKey) {

		for (int j = 0; j < dataTypeArray.length; j++) {

			if (primaryKey.getpkType().contains(dataTypeArray[j])) {
				List<PrimaryKey> listPK = primaryKeysofDataTypes
						.get(dataTypeArray[j]);
				if (listPK == null)
					listPK = new ArrayList<PrimaryKey>();

				listPK.add(primaryKey);
				primaryKeysofDataTypes.put(dataTypeArray[j], listPK);
				break;
			}
		}
		allPrimaryKey.add(primaryKey);
	}

	public PrimaryKey GetPrimaryKey(int index) {
		if (index == -1) {
			return null;
		}
		if (allPrimaryKey.size() < index) {
			System.out
					.println("Internal error: PrimaryKeyList<Index is greater than array size>");
			return null;
		} else {
			return allPrimaryKey.get(index);
		}
	}

	// Purpose: To get a random primary key of a given data type
	// Arguments: datatype needed
	// Return Value: a Primary Key of datatype 'dataType'
	public PrimaryKey getRandomPrimaryKey(String dataType) {

		List<PrimaryKey> listgivenDataType = new ArrayList<PrimaryKey>();
		if (dataType != null && dataTypeArray != null) {
			for (int i = 0; i < dataTypeArray.length; i++) {
				if (dataType.contains(dataTypeArray[i])) {
					listgivenDataType = primaryKeysofDataTypes
							.get(dataTypeArray[i]);
					break;
				} else if (i + 1 == dataTypeArray.length) {
					System.out
							.println("Error: PrimaryKeyList.java<Unknown data type, check config file>");
				}
			}
		}
		if (listgivenDataType != null) {
			if (listgivenDataType.size() != 0) {
				int primaryKeyIndex = pickPrimaryonDataType
						.nextInt(listgivenDataType.size());
				return listgivenDataType.get(primaryKeyIndex);
			} else {
				return null;
			}
		}
		return null;
	}

	public boolean RemovePrimaryKey(PrimaryKey pkRemove) {
		allPrimaryKey.remove(pkRemove);
		RemovefromDataTypeArray(pkRemove);
		return true;
	}

	private void RemovefromDataTypeArray(PrimaryKey pkRemove) {
		for (int i = 0; i < dataTypeArray.length; i++) {
			if (pkRemove.getpkType().contains(dataTypeArray[i])) {
				List<PrimaryKey> listPK = primaryKeysofDataTypes
						.get(dataTypeArray[i]);
				listPK.remove(pkRemove);
				primaryKeysofDataTypes.put(dataTypeArray[i], listPK);
				break;
			}
		}
	}

	public PrimaryKey GetPrimaryKeyUsingTableName(String tableName) {
		int size = allPrimaryKey.size();
		for (int i = 0; i < size; i++) {
			if (allPrimaryKey.get(i).getTable() == tableName)
				return allPrimaryKey.get(i);
		}
		return null; // The table has no primary key set
	}

	public static int getNumberOfPrimaryKeys() {
		return allPrimaryKey.size();
	}

	public static List<PrimaryKey> getAllPrimaryKeys() {
		return allPrimaryKey;
	}
}
