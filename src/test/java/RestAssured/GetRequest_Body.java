package RestAssured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetRequest_Body {

	
	public static void main(String[] args) {
		
		
	}
	
	
	
	public static void basicRestAssuredGetRequest() {
		
		
		String endpoint = "";


		RestAssured.baseURI = endpoint;
		RequestSpecification httpRequest = RestAssured.given();	
		
	}
}
