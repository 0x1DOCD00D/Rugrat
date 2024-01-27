package ragDB.query.FormQueries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Timer;

/**
 * @author Arthi
 * Initiates the different query type generators
 */
public class QueryFormInterface {

	public QueryFormInterface(String queryType, int numOfQueries) {
		Properties prop;

		prop = new Properties();
		try {
			prop.load(new FileInputStream("config.properties"));
		} catch (IOException configFileError) {
			System.out
					.println("QueryFormInterface: Could not load the properties file: "
							+ configFileError);
		}

		//Calendar calendar;
		if (queryType.equalsIgnoreCase("select")) {
			prop.setProperty("flag.nested", "0");
			prop.setProperty("Update.NeededSelectQ", "0");
			prop.setProperty("flagUpdate.nested", "0");
			prop.setProperty("flagInsert.nested", "0");
			try {
				prop.store(new FileOutputStream("config.properties"), null);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Beginning generation of select queries");
			ragDB.query.FormQueries.SelectQImpl selectQuery = new ragDB.query.FormQueries.SelectQImpl();
//			calendar = new GregorianCalendar();
//			System.out.printf("select start " + calendar.get(Calendar.MINUTE)
//					+ "." + calendar.get(Calendar.SECOND) + "."
//					+ calendar.get(Calendar.MILLISECOND));
			selectQuery.GenerateSelectQ(numOfQueries);
//			calendar = new GregorianCalendar();
//			System.out.printf("select end " + calendar.get(Calendar.MINUTE)
//					+ "." + calendar.get(Calendar.SECOND) + "."
//					+ calendar.get(Calendar.MILLISECOND));
			System.out.println("Select Queries generated");
		} else if (queryType.equalsIgnoreCase("update")) {
			prop.setProperty("flag.nested", "0");
			prop.setProperty("Update.NeededSelectQ", "0");
			prop.setProperty("flagUpdate.nested", "0");
			prop.setProperty("flagInsert.nested", "0");
			try {
				prop.store(new FileOutputStream("config.properties"), null);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Beginning generation of update queries");
			ragDB.query.FormQueries.UpdateQImpl updateQuery = new ragDB.query.FormQueries.UpdateQImpl();
//			calendar = new GregorianCalendar();
//			System.out.printf("update start " + calendar.get(Calendar.MINUTE)
//					+ "." + calendar.get(Calendar.SECOND) + "."
//					+ calendar.get(Calendar.MILLISECOND));
			updateQuery.GenerateUpdateQ(numOfQueries);
//			calendar = new GregorianCalendar();
//			System.out.printf("update end " + calendar.get(Calendar.MINUTE)
//					+ "." + calendar.get(Calendar.SECOND) + "."
//					+ calendar.get(Calendar.MILLISECOND));
			System.out.println("Update queries generated");
		} else if (queryType.equalsIgnoreCase("insert")) {
			prop.setProperty("flag.nested", "0");
			prop.setProperty("Update.NeededSelectQ", "0");
			prop.setProperty("flagUpdate.nested", "0");
			prop.setProperty("flagInsert.nested", "0");
			try {
				prop.store(new FileOutputStream("config.properties"), null);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Beginning generation of insert queries");
			ragDB.query.FormQueries.InsertQImpl insertQuery = new ragDB.query.FormQueries.InsertQImpl();
//			calendar = new GregorianCalendar();
//			System.out.printf("insert start " + calendar.get(Calendar.MINUTE)
//					+ "." + calendar.get(Calendar.SECOND) + "."
//					+ calendar.get(Calendar.MILLISECOND));
			insertQuery.GenerateInsertQ(numOfQueries);
//			calendar = new GregorianCalendar();
//			System.out.printf("insert end " + calendar.get(Calendar.MINUTE)
//					+ "." + calendar.get(Calendar.SECOND) + "."
//					+ calendar.get(Calendar.MILLISECOND));
			System.out.println("Insert queries generated");
		}
	}
}
