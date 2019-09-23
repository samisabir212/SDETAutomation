package com.qa.gorest.tests;

import java.util.ArrayList;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.gorest.services.Users;
import com.qa.restclient.RestClient;

import Constants.Constants;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GoRestApiTests extends Constants {
	
	
	String baseURI = "https://gorest.co.in";
	String basePath = "/public-api/users/";
	String token = "PwTbBOLhqZczdY9xnuDg5v9lBsWh_wtMifuE";
	
	@Test(enabled = false)
	public void getUserListAPITest(){
		
		Response response = com.qa.restclient.RestClient.doGet("JSON", baseURI, basePath, token, true);
		Assert.assertEquals(RestClient.getStatucCode(response), Constants.HTTP_STATUS_CODE_200);
		RestClient.getPrettyResponsePrint(response);
		
		JsonPath js = RestClient.getJsonPath(response);
//		System.out.println(js.getString("_meta.message"));
		
		ArrayList results = js.get("result");
//		System.out.println(results.size());
//		System.out.println(results.get(0));
		
		Map<String, Object>firstUserData = (Map<String, Object>) results.get(0);
		
		
		
		for(Map.Entry<String, Object> entry : firstUserData.entrySet()){
			System.out.println("Key = " + entry.getKey() +  ", value = " + entry.getValue());
		}
		
		System.out.println("Full map : "+ firstUserData);
		
	}
	
	
	
	@Test(enabled = true)
	public void PostNewUser(){
		
		Users user = new Users("Irina","Z","female","01-01-1975","irina123@gmail.com","+1-222-333-2323", "http://www.irina.com", "test address","active");
		
		Response response = com.qa.restclient.RestClient.doPost("JSON", baseURI, basePath, token, true, user);
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().prettyPrint());
		
	}
	
	
	

}
