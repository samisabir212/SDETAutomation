package com.qa.restclient;

import java.util.List;

import Lib.Lib;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class RestClient {
	
	public static Response doGet(String contentType, String baseURI, String basePath, String token, boolean log) {
		RestClient.setBaseURI(baseURI);
		RequestSpecification request = RestClient.createRequest(contentType, token, log);
		return RestClient.getResponse("GET", request, basePath);
	}
	
	public static Response doGet(String contentType, String URI, String token, boolean log) {
		RestClient.setBaseURI(URI);
		RequestSpecification request = RestClient.createRequest(contentType, token, log);
		return RestClient.getResponseData("GET", request, URI);
		
		
	}
	
	public static Response doPost(String contentType, String baseURI, String basePath, String token, boolean log, Object obj) {
		RestClient.setBaseURI(baseURI);
		RequestSpecification request = RestClient.createRequest(contentType, token, log);
		String jsonStringBodyPayload = Lib.getSerializedJson(obj);
		request.body(jsonStringBodyPayload);
		return RestClient.getResponse("POST", request, basePath);
	}

	public static Response doPost2(String contentType, String URI, String token, boolean log,RequestSpecification request) {
		RestClient.setBaseURI(URI);
		RequestSpecification requests = RestClient.createRequest(contentType, token, log);
		return RestClient.getResponseData("GET", requests, URI);

	}

	public static void doPut() {

	}

	public static void doDelete() {

	}

	// generic api methods:
	/**
	 * this method is used to set base URI
	 * 
	 * @param baseURI
	 */
	public static void setBaseURI(String baseURI) {
		RestAssured.baseURI = baseURI;
	}

	/**
	 * This method is used to create request
	 * 
	 * @param contentType
	 * @param token
	 * @param log
	 * @return request
	 */
	public static RequestSpecification createRequest(String contentType, String token, boolean log) {
		RequestSpecification request;
		if (log) {
			request = RestAssured.given().log().all();
		} else {
			request = RestAssured.given();
		}
		if (token != null) {
			request.header("Authorization", "Bearer " + token);
		}

		if (contentType.equalsIgnoreCase("JSON")) {
			request.contentType(ContentType.JSON);
		} else if (contentType.equalsIgnoreCase("XML")) {
			request.contentType(ContentType.XML);
		} else if (contentType.equalsIgnoreCase("TEXT")) {
			request.contentType(ContentType.TEXT);
		}
		return request;
	}

	public static Response getResponse(String httpMethod, RequestSpecification request, String basePath) {
		return executeAPI(httpMethod, request, basePath);
	}
	public static Response getResponseData(String httpMethod, RequestSpecification request,String URI) {
		return executeAPIRequest(httpMethod, request,URI);
	}

	/**
	 * this method is used to execute the API on the basis of HTTP METHOD (GET,
	 * POST, PUT, DELETE)
	 * 
	 * @param httpMethod
	 * @param request
	 * @param basePath
	 * @return
	 */
	private static Response executeAPI(String httpMethod, RequestSpecification request, String basePath) {
		Response response = null;

		switch (httpMethod) {
		case "GET":
			response = request.get(basePath);
			break;
		case "POST":
			response = request.post(basePath);
			break;
		case "PUT":
			response = request.put(basePath);
			break;
		case "DELETE":
			response = request.delete(basePath);
			break;

		default:
			System.out.println("Please pass the correct http method");
			break;
		}

		return response;
	}
	
	private static Response executeAPIRequest(String httpMethod, RequestSpecification request, String URI) {
		Response response = null;

		switch (httpMethod) {
		case "GET":
			response = request.get(URI);
			break;
		case "POST":
			response = request.post(URI);
			break;
		case "PUT":
			response = request.put(URI);
			break;
		case "DELETE":
			response = request.delete(URI);
			break;

		default:
			System.out.println("Please pass the correct http method");
			break;
		}

		return response;
	}

	// generic methods for response:
	public static JsonPath getJsonPath(Response response) {
		return response.jsonPath();
	}

	public static int getStatucCode(Response response) {
		return response.getStatusCode();
	}

	public static String getHeaderValue(Response response, String headerName) {
		return response.getHeader(headerName);
	}

	public static int getResponseHeaderCount(Response response) {
		Headers headers = response.getHeaders();
		return headers.size();
	}

	public static List<Header> getResponseHeaders(Response response) {
		Headers headers = response.getHeaders();
		List<Header> headerList = headers.asList();
		return headerList;
	}

	public static void getPrettyResponsePrint(Response response) {
		System.out.println("========response String in pretty format======");
		response.prettyPrint();
	}

}
