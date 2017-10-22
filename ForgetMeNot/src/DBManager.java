import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
	
	private static final String CREATE_TABLE = "CREATE TABLE REMINDER";
	private static final String DB_DRIVER = "org.h2.Driver";
	private static final String DB_USERNAME = "admin";
	private static final String DB_PASSWORD= "thisisit";
	private static final String DB_URL = "jdbc:h2:~/forgetmedb";
		
	public DBManager() {
		
	}
	
	private void createReminder(String reminder){
		String createQuery = "CREATE TABLE";
	}
	
	public Connection createConnection() throws Exception{
		Connection conn = null;
		//loads driver
		try{
		Class.forName(DB_DRIVER);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			
		
		//opens connection - the db url always needs to start with jdbc:h2
		conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		return conn;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public void closeConnection(Connection conn) throws SQLException{
		conn.close();
	}
}
