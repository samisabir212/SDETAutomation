package JDBC_MySQLWorkbench;

import java.sql.*;
import java.util.TimeZone;

public class testDB2 {

	//static String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	static String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=" + TimeZone.getDefault().getID();

	public static void main(String[] args) {
		
		try {
			
			Connection conn = DriverManager.getConnection(url, "root", "Friday26");
			
			if(conn != null) {
				
				System.out.println("connection successful");
			
			}else {
			
				System.out.println("connection unsuccessful");
			
			}
			
			Statement stmt = conn.createStatement();
			ResultSet queryResponse = stmt.executeQuery("SELECT first_name FROM employees.employees");
			
			int counter = 0;
			while(queryResponse.next()) {
				
				System.out.println(queryResponse.getString("first_name"));
				counter++;
			
			}
			
			System.out.println("total firstnames : "+ counter);
			
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
