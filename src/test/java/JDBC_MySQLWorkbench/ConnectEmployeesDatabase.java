package JDBC_MySQLWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TimeZone;

import Lib.Lib;

public class ConnectEmployeesDatabase {

	// static String url =
	// "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	static Connection conn;

	static String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=" + TimeZone.getDefault().getID();

	public static void main(String[] args) {

		sqlQuery("select * from employees.employees limit 5");

	}

	public static void sqlQuery(String query) {
		
		try {
	   
		  conn=getJDBCconnection();
			
	      // create the java statement
	      Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	      
	      // iterate through the java resultset
	    	 HashMap<String,String> testdata = new HashMap<>();

	      while (rs.next()) {
	       
	        // print the results
		    	 String employeeID= rs.getString("emp_no");

	    	 String firstname= rs.getString("first_name");
	    	 System.out.println(firstname);
	    	 
	    	 
	    	 testdata.put(firstname, employeeID);
	    	 
	      }
	      
	      System.out.println("printing hashmap with my test data");
	      for(Entry<String,String> map : testdata.entrySet()) {
	    	 String firstname =  map.getKey();
	    	 String employeesid = map.getValue();
	    	  System.out.println("firstname : " +firstname);
	    	  System.out.println("id for this employees named "+firstname + " is "+ employeesid);
	    	  
	    	  
	      }
	      
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  }

	public static void createResultsTable(String tablename) {

		try {

			Connection con = getJDBCconnection();

			PreparedStatement create = con.prepareStatement("CREATE TABLE " + tablename + "("
					+ "Date varchar(255), Environment varchar(255), Application varchar(255), AccountStatus varchar(255), "
					+ "ServiceName varchar(255), TestName varchar(255), Status varchar(255))");

			// Date Enviornment Application Account Status Service Name Test Name Status
			create.executeUpdate();

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
