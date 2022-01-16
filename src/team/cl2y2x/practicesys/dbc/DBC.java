package team.cl2y2x.practicesys.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	private static String url = "jdbc:mysql://localhost/q";
	
	private static String user = "root";
	
	private static String password = "123456";
	
	private Connection conn = null;
	
	public DBC() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
	}
	
	public Connection getConnection()throws Exception{
	    return conn;
	}
	
	public void closeAll(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
	
}
