package JDBC_MySQLWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

import Lib.Lib;

public class InsertIntoTable {
	
	static Connection conn;
	static Statement stmt = null;
	static String url = "jdbc:mysql://localhost:3306/AutomationExecutionResults?serverTimezone="
			+ TimeZone.getDefault().getID();
	
	public static void main(String[] args) throws SQLException {
		
		String timestamp= Lib.getcurrentdateyyMMddHHmm();
		timestamp= "2019_05_20_1236";
		
		insertIntoResultsTable(timestamp,"'"+timestamp+"'","'SIT'", "'Parabank'", "'ACTIVE'", "'Login'", "'Successful'", "'Passed'");
		
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
