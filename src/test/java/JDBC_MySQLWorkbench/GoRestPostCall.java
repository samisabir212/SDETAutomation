package JDBC_MySQLWorkbench;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.Map.Entry;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GoRestPostCall {

	/**
	 * this test will use jdbc connection with rest asssured
	 */
	static Connection conn;

	static String url = "jdbc:mysql://localhost:3306/GoRestTestData?serverTimezone=" + TimeZone.getDefault().getID();

	public static void main(String[] args) {

		goRestPostCreateUserTenTimes();

	}

	public static void goRestPostCreateUserTenTimes() {

		HashMap<String, String> testdata = new HashMap<>();

		try {

			conn = getJDBCconnection();

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery("SELECT * FROM GoRestTestData.Users");

			// iterate through the java resultset

			while (rs.next()) {

				// print the results
				int id_int = rs.getInt("id");

				String id = Integer.toString(id_int);
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String gender = rs.getString("gender");
				Date DOB = rs.getDate("DOB");
				DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
				String strDate = dateFormat.format(DOB);
				System.out.println("Converted String: " + strDate);
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("address");


				RestAssured.baseURI = "https://gorest.co.in/public-api/users";
				RequestSpecification request = RestAssured.given().log().all();

				JSONObject requestbody = new JSONObject();

				request.header("Authorization", "Bearer PwTbBOLhqZczdY9xnuDg5v9lBsWh_wtMifuE");
				request.contentType("application/json");
				requestbody.put("id",id);
				requestbody.put("first_name", first_name);
				requestbody.put("last_name", last_name);
				requestbody.put("gender", gender);
				requestbody.put("DOB", strDate);
				requestbody.put("email", email);
				requestbody.put("phone", phone);
				requestbody.put("address", address);
				requestbody.put("status", "active");

				request.body(requestbody.toString());

				Response response = request.post();

				int actualStatusCode = response.getStatusCode();
				Headers headers = response.getHeaders();
				String responseBody = response.getBody().asString();

				System.out.println(actualStatusCode);
				System.out.println(headers);
				System.out.println(responseBody);

			}

			st.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
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
