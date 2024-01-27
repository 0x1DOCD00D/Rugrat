/**
 * 
 */
package ragDB.query.expression;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import ragDB.database.TableDetails.ForeignKey;
import ragDB.database.TableDetails.PrimaryKey;

/**
 * Join Expression Generator 
 * Constructs the table expression in
 *         the join statement
 * @author Arthi 
 */
public class JoinExpression {

	private static Properties properties;
	String[] dataTypes;
	String[] operatorTypes;

	public JoinExpression() {

		try {
			properties = new Properties();
			properties.load(new FileInputStream("config.properties"));
			String dataTypesString = properties.getProperty("joinQuery.Types");
			dataTypes = dataTypesString.split(",");
			String operatorTypesString = properties
					.getProperty("onExprOperator.Types");
			operatorTypes = operatorTypesString.split(",");

		} catch (IOException configFileError) {
			System.out.println("Could not load the properties file: "
					+ configFileError);
		}
	}

	public String GetJoinTableExpr(List<String> tablesInQuery,
			List<PrimaryKey> selectedPK, List<String> tablesNotToUseThisQ) {

		Random joinTypeSelector = new Random();
		Random operatorRand = new Random();
		StringBuilder joinTablesExpr = new StringBuilder();
		if (dataTypes == null) {
			System.out
					.println("Error: JoinExpression.java<Could not load types of join statements from config>");
		} else {

			for (int counter = 0; counter < selectedPK.size(); counter++) {

				PrimaryKey currentPK = selectedPK.get(counter);

				if (currentPK.getfkList() != null) {

					if (counter == 0) {
						joinTablesExpr.append(currentPK.getTable());
					}
					List<ForeignKey> currentfkList = currentPK.getfkList();

					if (tablesNotToUseThisQ != null) {
						for (int i = 0; i < currentfkList.size(); i++) {
							ForeignKey thisFK = currentfkList.get(i);
							String tabName = thisFK.getTable();

							if (tablesNotToUseThisQ.contains(tabName)) {
								currentfkList.remove(i);
								i--;
							}
						}
					}

					for (int j = 0; j < currentfkList.size(); j++) {
						ForeignKey currentFK = currentfkList.get(j);

						int indexjoinType = joinTypeSelector
								.nextInt(dataTypes.length);
						String joinType = dataTypes[indexjoinType];

						// Operator between attributes in ON expression
						int indexOperator = operatorRand
								.nextInt(operatorTypes.length);
						String operator = operatorTypes[indexOperator];

						// Form join Expr Example: t1 join t2 on t1.p1 = t2.p2
						joinTablesExpr.append(" " + joinType + " "
								+ currentFK.getTable() + " on ");

						joinTablesExpr.append(currentPK.getpkParameter() + " "
								+ operator + " " + currentFK.getfkParameter());
					}
				}

				// Process for all primary key objects
				if (counter + 1 != selectedPK.size()) {

					int indexjoinType = joinTypeSelector
							.nextInt(dataTypes.length);
					String joinType = dataTypes[indexjoinType];

					int indexOperator = operatorRand
							.nextInt(operatorTypes.length);
					String operator = operatorTypes[indexOperator];

					// if(selectedPK.get(counter).getpkType().equals(selectedPK.get(counter+1).getpkType())){
					joinTablesExpr.append(" " + joinType + " "
							+ selectedPK.get(counter + 1).getTable() + " on ");
					joinTablesExpr.append(selectedPK.get(counter)
							.getpkParameter()
							+ " "
							+ operator
							+ " "
							+ selectedPK.get(counter + 1).getpkParameter());
					// }
				}
			}
			joinTablesExpr.append(" ");
		}
		return joinTablesExpr.toString();
	}
}
