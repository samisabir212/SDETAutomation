package FolderAutomation;

import java.io.File;

import Lib.Lib;

public class HowToCreateANewFolder {

	public static void main(String[] args) {

		String path = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/FolderPlay/";
		String currentDate = Lib.getcurrentdateyyMMddHHmm();
		String logFolderPath = createLogFolder(path, "ThisIsALogFolder"+currentDate);
		//Log Folder path : /Users/sami/Desktop/GitTechTekSolution/SDETautomation/FolderPlayThisIsALogFolder2019_06_13_1737

		System.out.println("Log Folder path : "+logFolderPath);
	}

	public static String createLogFolder(String path,String newFolderName) {

		File dir = new File(path+newFolderName);

		dir.mkdir();

		return dir.getAbsolutePath();

	}

}
