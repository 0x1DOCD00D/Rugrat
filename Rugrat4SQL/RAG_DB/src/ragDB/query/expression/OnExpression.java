package ragDB.query.expression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import ragDB.database.TableDetails.ForeignKey;
import ragDB.database.TableDetails.PrimaryKey;

/**
 * @author Arthi
 * Class constructing On Expression in Join statement
 */
public class OnExpression {

	private static Properties properties;
	String[] operatorsTypes;

	public OnExpression() {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("config.properties"));
			String operatorTypesString = properties
					.getProperty("onExprOperator.Types");
			operatorsTypes = operatorTypesString.split(",");

		} catch (IOException configFileError) {
			System.out.println("Could not load the properties file: "
					+ configFileError);
		}
	}

	public String GetJoinOnExpr(List<String> tablesInQuery,
			List<PrimaryKey> selectedPK) {

		StringBuilder onExprSB = new StringBuilder();
		Random operatorRand = new Random();

		// Should not reach here
		if (tablesInQuery.size() < 2) {
			System.out
					.println("Error: OnExpression.java<Join statement cannot be formed with less than 2 tables>");
			System.exit(1);
		}

		for (int counter = 0; counter < selectedPK.size(); counter++) {
			String currentPK = selectedPK.get(counter).getpkParameter();

			if (selectedPK.get(counter).getfkList() != null) {
				List<ForeignKey> fkList = selectedPK.get(counter).getfkList();

				for (int j = 0; j < fkList.size(); j++) {

					// Operator between attributes in ON expression
					int index = operatorRand.nextInt(operatorsTypes.length);
					String operator = operatorsTypes[index];

					String currentFK = fkList.get(j).getfkParameter();

					// Adding the expression after ON keyword Example: currentPK
					// <= currentFK
					onExprSB.append(currentPK + " " + operator + " "
							+ currentFK + " ");

				} // iterating foreign key for
			}// if fkList not null

			// Do next steps, if not currentPK=last primary key in list
			if (counter + 1 != selectedPK.size()) {

				int index = operatorRand.nextInt(operatorsTypes.length);
				String operator = operatorsTypes[index];

				// if(selectedPK.get(counter).getpkType().equals(selectedPK.get(counter+1).getpkType())){
				onExprSB.append(selectedPK.get(counter).getpkParameter() + " "
						+ operator + " "
						+ selectedPK.get(counter + 1).getpkParameter() + " ");
				// }
			}

		}
		return onExprSB.toString();
	}
}
