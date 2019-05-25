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

	static String url = "jdbc:mysql://localhost:3306/AutomationExecutionResults?serverTimezone="
			+ TimeZone.getDefault().getID();

	public static void main(String[] args) {

		String DATEtimeStamp = Lib.getcurrentdateyyMMddHHmm();

		createResultsTable("DATEtimeStamp");

	}

	public static void createResultsTable(String tablename) {

		try {

			Connection con = getJDBCconnection();

			PreparedStatement create = con.prepareStatement("CREATE TABLE " + tablename + "("+ "Date varchar(255), Environment varchar(255), Application varchar(255), AccountStatus varchar(255), "
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
