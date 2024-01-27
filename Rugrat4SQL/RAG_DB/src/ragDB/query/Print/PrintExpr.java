package ragDB.query.Print;

import java.util.HashMap;
import java.util.List;

/**
 * @author Arthi
 * Builds the Entire Query String
 */
public class PrintExpr {

	public StringBuilder ParametersPrint(StringBuilder query,
			List<HashMap<String, String>> parameters, Boolean AggExp) {

		if (AggExp) { // If AggExp is present. Example: count, sum, max, min
		} else {
			for (int counter = 0; counter < parameters.size(); counter++) {

				if (counter != parameters.size() - 1)
					query.append(parameters.get(counter).keySet().toString()
							.replace("[", "").replace("]", "")
							+ ",");
				else
					query.append(parameters.get(counter).keySet().toString()
							.replace("[", "").replace("]", "")
							+ " ");
			}
		}
		return query;
	}

	// Used to build the tables string in the query
	public StringBuilder TablesPrint(List<String> tables, StringBuilder query) {

		for (int counter = 0; counter < tables.size(); counter++) {
			if (counter == tables.size() - 1) {
				query = query.append(tables.get(counter) + " ");
			} else {
				query = query.append(tables.get(counter) + ",");
			}
		}
		return query;
	}
}
