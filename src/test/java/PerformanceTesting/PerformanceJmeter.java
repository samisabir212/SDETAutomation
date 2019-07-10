package PerformanceTesting;

import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PerformanceJmeter {

	public static void main(String[] args) {

		String endpoint = "https://reqres.in/api/login";

		// tell rest assured what the Endpoint is
		RestAssured.baseURI = endpoint;

		// setup request specfication (httpRequest)
		RequestSpecification httpRequest = RestAssured.given();

		// create a headers map to put headers in
		HashMap<String, String> headersMap = new HashMap<String, String>();
		// put header in map
		headersMap.put("Content-Type", "application/json");

		// put headersMap in to httprequest
		httpRequest.headers(headersMap);

		// create json object (json request body)
		JSONObject requestBody = new JSONObject();

		// put username and password in the json request body
		requestBody.put("email", "eve.holt@reqres.in");
		requestBody.put("password", "cityslicka");

		// put request body into the httpRequest
		httpRequest.body(requestBody.toString());

		System.out.println(requestBody);
		System.out.println("request body : " + requestBody.toString());

		long start = System.currentTimeMillis();
		Response response = null;
		for (int i = 1; i < 5; i++) {

			response = httpRequest.post();
			// use response object to get response status code
			int actualStatusCode = response.getStatusCode();
			System.out.println(actualStatusCode);
			// use response object to get response response body as a string
//			String responseBody = response.getBody().asString();


		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);

		// use response object to get response status code
		int actualStatusCode = response.getStatusCode();

		// use response object to get response response body as a string
		String responseBody = response.getBody().asString();

	}

}
