package JDBC_MySQLWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC_Employees_DB {
	
	
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306/"+databaseName;
	
	static String username = "root";
	static String password = "Friday26";
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		 
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO 'studentDatabase'.'student' ('name') VALUES ('michael vick');");

		int status = ps.executeUpdate();
		
		System.out.println("Status : "+status);
		if(status != 0 ) {
			
			System.out.println("Database was connected");
			System.out.println("record was inserted");
		}
	}
	

}
