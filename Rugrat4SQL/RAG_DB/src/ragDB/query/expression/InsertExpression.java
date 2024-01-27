package ragDB.query.expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import ragDB.database.TableDetails.DBTables;
import ragDB.database.TableDetails.TableData;

/**
 * @author Arthi
 * Insert expression Generator
 */
public class InsertExpression {

	public InsertExpression() {
	}

	public List<HashMap<String, String>> ReturnInsertColumns(String table) {

		DBTables dbtables = new DBTables("dummy");
		TableData td = dbtables.getTableByName(table);

		int totalNumOfParams = td.getNumOfParams();
		int numOfParams = new Random().nextInt(totalNumOfParams);
		if (numOfParams == 0) {
			numOfParams = 1;
		}
		List<HashMap<String, String>> params = new ArrayList<HashMap<String, String>>();

		if (totalNumOfParams <= numOfParams) {
			for (int i = 0; i < totalNumOfParams; i++) {
				params.add(td.returnParam(i));
			}
		} else {
			Random indexSelector = new Random();
			for (int j = 0; j < numOfParams; j++) {
				HashMap<String, String> oneParam;
				do {
					int index = indexSelector.nextInt(totalNumOfParams);
					oneParam = td.returnParam(index);
				} while (params.contains(oneParam));
				params.add(oneParam);
			}
		}
		return params;
	}
}
