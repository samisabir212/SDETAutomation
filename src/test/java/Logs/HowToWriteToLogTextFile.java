package Logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class HowToWriteToLogTextFile {

	public static void main(String[] args) {

		String path = "/Users/sami/Desktop/eclipse-workspace2k19/SDETAutomation/FolderPlay/ThisIsALogFolder2019_06_13_1738/textfile111.txt";

		HashMap<String, String> headersMap = new HashMap<>();
		headersMap.put("dasd", "dasd");
		headersMap.put("dasd", "dasd");
		headersMap.put("dasd", "dasd");
		headersMap.put("dasd", "dasd");
		headersMap.put("dasd", "dasd");

		for (int i = 0; i < 10; i++) {

			writeToLogfileAppendTolastLine(headersMap, path);

		}

		writeToLogfileAppendTolastLine("Response body : ", path);
		writeToLogfileAppendTolastLine("Response status code : ", path);
		writeToLogfileAppendTolastLine("passed : ", path);

	}

	public static void writeToLogfileAppendTolastLine(String textToAppend, String path) {

		try {
			String data = textToAppend;

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

	public static void writeToLogfileAppendTolastLine(HashMap<String, String> textToAppend, String path) {

		try {

			HashMap<String, String> data = textToAppend;

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
