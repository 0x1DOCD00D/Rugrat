package ragDB.common.main;

import java.sql.*;
import java.util.Properties;

/**
 * Database connector class
 * @author Arthi
 *
 */
public class MysqlConnect {
	Connection conn;
	
	MysqlConnect(Properties properties)
	{
	    this.conn = null;
	    /*Reading connection properties from configuration*/
	    String url = properties.getProperty("db.connUrl");
	    String dbName = properties.getProperty("db.connName");
	    String driver = properties.getProperty("db.connDriver");
	    String userName = properties.getProperty("db.connUsername");
	    String password = properties.getProperty("db.connPassword");
	    
	    try {
	      Class.forName(driver).newInstance();
	      conn = DriverManager.getConnection(url+dbName,userName,password);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	}
}
