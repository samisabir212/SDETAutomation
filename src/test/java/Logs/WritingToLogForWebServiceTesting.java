package Logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WritingToLogForWebServiceTesting {
	
	
	public static void main(String[] args) {
		/**
		 * i want a logging function to write what ever i want to a log file one by one
		 * the parameter should be a object type of Object
		 */
		
		
		//RestAssured.baseURI = ""
		//src/resources/java/Files/wordcount.txt
		String path = "src/resources/java/Files/test212.txt";
		
		log("Headers :", path);

		HashMap<String,String> data = new HashMap<>();
		data.put("dasd", "dasda");
		data.put("dasd", "dasda");
		data.put("dasd", "dasda");
		data.put("dasd", "dasda");

		log(data, path);

		
	}

	
	public static void log(String data, String path) {

		try {

			File file = new File(path);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("New File Created Now");
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file, true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n");
			bufferWritter.write(data);
			bufferWritter.close();
			fileWritter.close();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void log(HashMap<String,String> data, String path) {

		try {

			File file = new File(path);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("New File Created Now");
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file, true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n");
			bufferWritter.write(data.toString());
			bufferWritter.close();
			fileWritter.close();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void log(Response data, String path) {

		try {

			File file = new File(path);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("New File Created Now");
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file, true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n");
			bufferWritter.write(data.asString());
			bufferWritter.close();
			fileWritter.close();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void log(int data, String path) {

		try {

			File file = new File(path);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("New File Created Now");
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file, true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n");
			bufferWritter.write(data);
			bufferWritter.close();
			fileWritter.close();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void log(JSONObject data, String path) {

		try {

			File file = new File(path);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("New File Created Now");
			}

			// true = append file
			FileWriter fileWritter = new FileWriter(file, true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write("\n");
			bufferWritter.write(data.toString());
			bufferWritter.close();
			fileWritter.close();

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
