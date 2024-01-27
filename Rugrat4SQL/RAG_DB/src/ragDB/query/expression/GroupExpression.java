package ragDB.query.expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Group Expression Generator
 * @author Arthi
 */
public class GroupExpression {

	static String paramInAggExpr;
	String queryReturn;
	List<String> returnParams;

	public static String removeChar(String s) {

		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '[')
				r += s.charAt(i);
			if (s.charAt(i) != ']')
				r += s.charAt(i);
		}
		return r;
	}

	// returns the query and the parameters in aggExpr - returns null as aggExpr
	// parameters if number of params is less than 2
	public List<String> formGroupExpr(StringBuilder query,
			List<HashMap<String, String>> parameters) {
		Random aggFunction = new Random();
		int flag = -1;

		// Can be done only if the query has at least 2 parameters in select
		// expression
		if (parameters.size() < 2) {
			queryReturn = new String(new StringBuilder(query.toString()
					.replace("group by", "")));
			returnParams = new ArrayList<String>();
			returnParams.add(queryReturn);
			returnParams.add(null);
			return returnParams;
		}

		else {
			String intParam;
			String groupbyParam;
			String newParam;

			while (flag != 1) {

				switch (aggFunction.nextInt(9)) {

				case 1: // Avg()
					// Select an int parameter
					intParam = selectIntParam(parameters);
					if (intParam == null) {
						flag = 0; // If none of the parameters are integer
					} else {
						flag = 1;
						query = new StringBuilder(
								query.toString().replaceFirst(intParam,
										"avg(" + intParam + ")"));
						// Select a random param from rest
						groupbyParam = selectParamFromRest(intParam, parameters);
						groupbyParam = removeChar(groupbyParam);
						query.append(groupbyParam + " "); // Add the selected
															// param returned
															// after "group by"
															// keyword
						queryReturn = new String(query);
						returnParams = new ArrayList<String>();
						returnParams.add(queryReturn);
						returnParams.add(paramInAggExpr);
						return returnParams;
					}
					break;

				case 2: // Avg(distinct )
					// Select an integer parameter
					intParam = selectIntParam(parameters);
					if (intParam == null)
						flag = 0; // If none of the parameters are integer
					else {

						flag = 1;
						query = new StringBuilder(query.toString().replace(
								intParam, "avg(distinct " + intParam + ")"));
						// Select a random parameter from rest
						groupbyParam = selectParamFromRest(intParam, parameters);
						query.append(groupbyParam + " ");
						queryReturn = new String(query);
						returnParams = new ArrayList<String>();
						returnParams.add(queryReturn);
						returnParams.add(paramInAggExpr);
						return returnParams;

					}
					break;

				case 3: // count(distinct )
					flag = 1;
					newParam = selectParam(parameters);
					query = new StringBuilder(query.toString().replaceFirst(
							newParam, "count(distinct " + newParam + ")"));
					// Select a random parameter from rest
					groupbyParam = selectParamFromRest(newParam, parameters);
					query.append(groupbyParam + " ");
					queryReturn = new String(query);
					returnParams = new ArrayList<String>();
					returnParams.add(queryReturn);
					returnParams.add(paramInAggExpr);
					return returnParams;

				case 4: // max ()
					flag = 1;
					newParam = selectParam(parameters);
					query = new StringBuilder(query.toString().replaceFirst(
							newParam, "max(" + newParam + ")"));
					// Select a random parameter from rest
					groupbyParam = selectParamFromRest(newParam, parameters);
					query.append(groupbyParam + " ");
					queryReturn = new String(query);
					returnParams = new ArrayList<String>();
					returnParams.add(queryReturn);
					returnParams.add(paramInAggExpr);
					return returnParams;

				case 5: // max(distinct )
					flag = 1;
					newParam = selectParam(parameters);
					query = new StringBuilder(query.toString().replaceFirst(
							newParam, "max(distinct " + newParam + ")"));
					// Select a random parameter from rest
					groupbyParam = selectParamFromRest(newParam, parameters);
					query.append(groupbyParam + " ");
					queryReturn = new String(query);
					returnParams = new ArrayList<String>();
					returnParams.add(queryReturn);
					returnParams.add(paramInAggExpr);
					return returnParams;

				case 6: // min()
					flag = 1;
					newParam = selectParam(parameters);
					query = new StringBuilder(query.toString().replaceFirst(
							newParam, "min(" + newParam + ")"));
					// Select a random parameter from rest
					groupbyParam = selectParamFromRest(newParam, parameters);
					query.append(groupbyParam + " ");
					queryReturn = new String(query);
					returnParams = new ArrayList<String>();
					returnParams.add(queryReturn);
					returnParams.add(paramInAggExpr);
					return returnParams;

				case 7: // min(distinct )
					flag = 1;
					newParam = selectParam(parameters);
					query = new StringBuilder(query.toString().replaceFirst(
							newParam, "min(distinct " + newParam + ")"));
					// Select a random parameter from rest
					groupbyParam = selectParamFromRest(newParam, parameters);
					query.append(groupbyParam + " ");
					queryReturn = new String(query);
					returnParams = new ArrayList<String>();
					returnParams.add(queryReturn);
					returnParams.add(paramInAggExpr);
					return returnParams;

				case 8: // sum()
					// Select an integer parameter
					intParam = selectIntParam(parameters);
					if (intParam == null)
						flag = 0; // If no integer parameter is present
					else {
						flag = 1;
						query = new StringBuilder(
								query.toString().replaceFirst(intParam,
										"sum(" + intParam + ")"));
						// Select a random parameter from rest
						groupbyParam = selectParamFromRest(intParam, parameters);
						query.append(groupbyParam + " ");
						queryReturn = new String(query);
						returnParams = new ArrayList<String>();
						returnParams.add(queryReturn);
						returnParams.add(paramInAggExpr);
						return returnParams;
					}
					break;

				case 9: // sum(distinct )
					// Select an integer parameter
					intParam = selectIntParam(parameters);
					if (intParam == null)
						flag = 0; // If no integer parameter is present
					else {
						flag = 1;
						query = new StringBuilder(query.toString()
								.replaceFirst(intParam,
										"sum(distinct " + intParam + ")"));
						// Select a random parameter from rest
						groupbyParam = selectParamFromRest(intParam, parameters);
						query.append(groupbyParam + " ");
						queryReturn = new String(query);
						returnParams = new ArrayList<String>();
						returnParams.add(queryReturn);
						returnParams.add(paramInAggExpr);
						return returnParams;
					}
					break;
				}
			}
			return null;
		}
	}

	public String selectIntParam(
			List<HashMap<String, String>> parametersForIntParam) {
		for (int i = 0; i < parametersForIntParam.size(); i++) {
			if (parametersForIntParam.get(i).containsValue("int")) {
				String intParam = parametersForIntParam.get(i).keySet()
						.toString().replace("[", "").replace("]", "");
				paramInAggExpr = intParam;
				return intParam;
			}
		}
		paramInAggExpr = null;
		return null;
	}

	public String selectParam(
			List<HashMap<String, String>> parametersForIntParam) {
		return parametersForIntParam
				.get(new Random().nextInt(parametersForIntParam.size()))
				.keySet().toString().replace("[", "").replace("]", "");
	}

	public String selectParamFromRest(String removeParam,
			List<HashMap<String, String>> parametersForGroupBy) {
		int sizeOfParams = parametersForGroupBy.size();

		// Remove the parameter used in the aggregate function
		for (int i = 0; i < sizeOfParams; i++) {
			if (parametersForGroupBy.get(i).containsValue(removeParam)) {
				parametersForGroupBy.remove(i);
				sizeOfParams--;
				break;
			}
		}
		// Select a parameter from the rest
		return parametersForGroupBy.get(new Random().nextInt(sizeOfParams))
				.keySet().toString().replace("[", "").replace("]", "");
	}
}
