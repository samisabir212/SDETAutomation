package Logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Constants.Constants;

public class HowToCreateATextFile {

	public static void main(String[] args) throws IOException {
		
		String path = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/FolderPlay/ThisIsALogFolder2019_06_13_1738/";
		createTxtFile("sami", path,"file3");

	}

	public static void createTxtFile(String strLine,String dirPath, String filename) throws IOException {

		File file = new File(dirPath+filename+".txt");
		file.createNewFile();//create new file
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write(strLine + "\n");//write some new line
		bufferedWriter.close();
		fileWriter.close();
	}
}
