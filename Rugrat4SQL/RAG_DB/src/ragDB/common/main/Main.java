package ragDB.common.main;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

/**
 * Starting point of DBUTIL tool
 * @author Arthi
 * 
 */
public class Main {

	static int numQueries;
	public static int numTables;

	public static void main(String[] args) {

		System.out.println("Welcome to RUGRAT DBUTIL - Reading Configuration file");
		try {
			int minParameters;
			int maxParameters;

			HashMap<String, String> hmapQueryTypes;

			System.out.println("Reading configuration file");
			Properties pro = new Properties();
			File f = new File("config.properties");
			FileInputStream in = new FileInputStream(f);
			pro.load(in);
			System.out.println("Configuration file loaded");

			hmapQueryTypes = new HashMap<String, String>();

			numTables = Integer.parseInt(pro.getProperty("NumOfTables"));
			minParameters = maxParameters = 0;

			while (minParameters == 0 || minParameters == 0) {
				minParameters = Integer.parseInt(pro
						.getProperty("MinAttributes"));
				maxParameters = Integer.parseInt(pro
						.getProperty("MaxAttributes"));
			}

			numQueries = Integer.parseInt(pro.getProperty("NumOfQueries"));
			String queryType = null;
			queryType = pro.getProperty("selectQ");
			hmapQueryTypes.put("select", queryType);

			queryType = pro.getProperty("updateQ");
			hmapQueryTypes.put("update", queryType);

			queryType = pro.getProperty("insertQ");
			hmapQueryTypes.put("insert", queryType);

			System.out.println("Beginning Table Creation....");
			TabCreate tabCreation = new TabCreate(numTables, minParameters,
					maxParameters);
			boolean success = tabCreation.ReturnTables();
			if (success) {
				System.out.println("Tables successfully created....");

				ragDB.query.FormQueries.QueryInput queryinput = new ragDB.query.FormQueries.QueryInput(
						hmapQueryTypes, numQueries);
				queryinput.GenerateQueries();
				System.out.println("Please check the current directory for output files - Both XML and TXT format");
			} else {
				System.out.println("Error: Main.java<Tables not created>");
			}
		} catch (Exception e) {
			System.out.println("Error: Main.java<Tables not created>");
		}
	}
}
