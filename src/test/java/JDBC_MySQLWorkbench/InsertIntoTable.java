package JDBC_MySQLWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.TimeZone;

import Lib.Lib;

public class InsertIntoTable {
	
	static Connection conn;
	static Statement stmt = null;
	static String url = "jdbc:mysql://localhost:3306/GoRestTestData?serverTimezone="
			+ TimeZone.getDefault().getID();
	
	public static void main(String[] args) throws SQLException {
		
		String timestamp= Lib.getcurrentdateyyMMddHHmm();
		timestamp= "2019_05_20_1236";
		
//		insertIntoResultsTable(timestamp,"'"+timestamp+"'","'SIT'", "'Parabank'", "'ACTIVE'", "'Login'", "'Successful'", "'Passed'");
		
		for(int i = 0; i<10;i++) {
			String table = "Users";
			
			String environment = Lib.returnRandomEnvironment();
			String id = Lib.generateRandomNumbers(4);
			String first_name = Lib.generateRandomString(5);
			String last_name = Lib.generateRandomString(6);
			String gender = "male";
			LocalDate DOB = Lib.generateRandomDate();
			String email = Lib.generateRandomString(7);
			email = email+"@gmail.com";
			String phone = Lib.generateRandomNumbers(10);
			String website = Lib.generateRandomString(6);
			website = "http://www."+website+".com";
			String address = Lib.generateRandomString(20);

			try {
				 conn = getJDBCconnection();
				
				stmt = conn.createStatement();		
				
				String sqlQuery = "INSERT INTO "+table+" (environment ,id, first_name, last_name, gender, DOB, email,phone, website, address)" 
				+ "VALUES ('"+environment+"','"+id+"','"+first_name+"','"+last_name+"','"+gender+"','"+DOB+"','"+email+"','"+phone+"','"+website+"','"+address+"')";
				 
				stmt.executeUpdate(sqlQuery);
			     
			} catch (Exception e) {

				System.out.println("Exception :" + e);

			}			
			
		}
	
	
	}
	
	public static void insertIntoResultsTable(String tableName,String date, String env,String app, String accountStatus,
			String serviceName, String testname, String Status) throws SQLException {
		
		System.out.println(tableName);
		try {
			Connection con = getJDBCconnection();
			
			stmt = conn.createStatement();		
			
			String sql = "INSERT INTO "+tableName+" (Date, Environment, Application, AccountStatus, ServiceName, TestName, Status)" 
			
					+ "VALUES ("+date+"," +env+","+ app+"," +accountStatus+","+serviceName+","+testname+","+Status+")";
			 
			stmt.executeUpdate(sql);
		     
		} catch (Exception e) {

			System.out.println("Exception :" + e);

		}		
		
		
	}
	
	public static Connection getJDBCconnection() {

		try {

			conn = DriverManager.getConnection(url, "root", "Friday26");

			if (conn != null) {

				System.out.println("connection successful");

			} else {

				System.out.println("connection unsuccessful");

			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

		return conn;
	}

}
