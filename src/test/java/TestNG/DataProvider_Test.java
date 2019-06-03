package TestNG;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataProvider_Test {
	

	
	
	@Test(dataProvider = "employeeData")
	public void createEmployees3TimesUsingDataProvider(String name, String salary, String age) {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestBody = new JSONObject();
		
		requestBody.put("name", name);
		requestBody.put("salary", salary);
		requestBody.put("age", age);
		
		httpRequest.body(requestBody);
		
		Response response = httpRequest.post();

		String responseBody = response.getBody().asString();
		int responseStatusCode = response.getStatusCode();
		System.out.println("response Body : "+ responseBody);
		System.out.println("response Status code : "+ responseStatusCode);
		
	}
	
	
	@DataProvider(name="employeeData")
	public String [][] getEmployeeData(){
		
		String employeeData[][]= {{"sami sabir","500000","29"},{"Jon Jones Bones","1000000","29"},{"Elon musk","50000","45"}};
		
		return employeeData;
	}
}
