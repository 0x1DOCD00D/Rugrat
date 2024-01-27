package ragDB.query.Print;

import java.util.List;

/**
 * @author Arthi
 * Builds the entire Nested Update Query String
 */
public class PrintNestedUpdateQ {

	public PrintNestedUpdateQ() {
	}

	public String BuildEntireQuery(String queryThisRun,
			List<String> selectSubQueries) {
		String finalQuery = queryThisRun;
		int length = selectSubQueries.size();

		for (int i = 0; i < length; i++) {
			String innerQuery = selectSubQueries.get(i);

			finalQuery = appendToUpdateQuery(finalQuery, innerQuery);
		}
		return finalQuery;
	}

	private String appendToUpdateQuery(String baseString, String stringToReplace) {

		int intIndexOfMatch = baseString.indexOf("SUBQUERY");

		// Loop over the string value replacing out each matching
		// substring.
		while (intIndexOfMatch != -1) {
			// Relace out the current instance.
			baseString = baseString.replace("SUBQUERY", stringToReplace);

			// Get the index of any next matching substring.
			intIndexOfMatch = baseString.indexOf("SUBQUERY");
		}
		return baseString;
	}
}