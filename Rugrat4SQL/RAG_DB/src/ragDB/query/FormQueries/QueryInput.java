package ragDB.query.FormQueries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.HashMap;

/**
 * @author Arthi
 */
public class QueryInput {

	Properties properties;
	String[] queryTypeArray;
	ragDB.query.FormQueries.QueryFormInterface callQueryImpl;
	int numOfQuery;

	// Contains a "yes" value for the query types needed to the user
	HashMap<String, String> queryTypes;

	// Constructors
	public QueryInput(HashMap<String, String> queriesAllowed, int numOfQuery) {
		this.queryTypes = queriesAllowed;
		this.numOfQuery = numOfQuery;
		try {
			this.properties = new Properties();
			properties.load(new FileInputStream("config.properties"));

			String queryTypeString = properties.getProperty("query.Types");
			queryTypeArray = queryTypeString.split(",");
		} catch (IOException configFileError) {
			System.out.println("Could not load the properties file: "
					+ configFileError);
		}
	}

	public void GenerateQueries() {
		int typesOfQueries = 0;
		for (int k = 0; k < queryTypeArray.length; k++) {
			if (queryTypes.get(queryTypeArray[k]).equalsIgnoreCase("yes")) {
				typesOfQueries++;
			}
		}

		int eachTypeNumberofQueries = numOfQuery / typesOfQueries;

		for (int j = 0; j < queryTypeArray.length; j++) {
			if (queryTypes.get(queryTypeArray[j]).equalsIgnoreCase("yes")) {
				// For each if value is yes, instantiate class and call the
				// function
				callQueryImpl = new ragDB.query.FormQueries.QueryFormInterface(
						queryTypeArray[j], eachTypeNumberofQueries);
			}
		}
	}
}