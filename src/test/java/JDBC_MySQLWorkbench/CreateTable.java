package JDBC_MySQLWorkbench;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimeZone;

import Lib.Lib;

public class CreateTable {

	// static String url =
	// "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	static Connection conn;

	static String url = "jdbc:mysql://localhost:3306/GoRestTestData?serverTimezone="
			+ TimeZone.getDefault().getID();

	public static void main(String[] args) {


		createResultsTable("Users");

	}

	public static void createResultsTable(String tablename) {

		try {

			Connection con = getJDBCconnection();

			PreparedStatement create = con.prepareStatement("CREATE TABLE " + 
			tablename + "("+"environment varchar(255),id INT NOT NULL AUTO_INCREMENT, first_name varchar(255), last_name varchar(255), gender varchar(255), "
					+ "DOB DATE, email varchar(255), phone varchar(255), website varchar(255), address varchar(255),PRIMARY KEY ( id ))");

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
