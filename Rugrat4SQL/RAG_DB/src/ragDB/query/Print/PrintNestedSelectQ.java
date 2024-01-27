package ragDB.query.Print;

import java.util.Stack;

/**
 * @author Arthi 
 * Builds the entire Nested Select Query String
 */
public class PrintNestedSelectQ {

	public PrintNestedSelectQ() {
	}

	public String BuildEntireQuery(Stack<String> dsQuery) {
		String finalQuery = null;

		while (!dsQuery.isEmpty()) {

			String thisQuery = dsQuery.pop();

			if (dsQuery.size() == 0) {

				String temp = replace(thisQuery, "SUBQUERY", finalQuery);

				finalQuery = temp;
			} else {

				thisQuery = replace(thisQuery, "SUBQUERY", finalQuery);
				String temp = "(" + thisQuery + ")";

				finalQuery = temp;
			}

		}
		finalQuery = replace(finalQuery, ";", "");
		finalQuery = finalQuery + ";";

		return finalQuery;
	}

	static String replace(String str, String pattern, String replace) {
		int s = 0;
		int e = 0;
		StringBuffer result = new StringBuffer();

		while ((e = str.indexOf(pattern, s)) >= 0) {
			result.append(str.substring(s, e));
			result.append(replace);
			s = e + pattern.length();
		}
		result.append(str.substring(s));
		return result.toString();
	}
}