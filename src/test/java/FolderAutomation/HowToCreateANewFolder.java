package FolderAutomation;

import java.io.File;

public class HowToCreateANewFolder {

	public static void main(String[] args) {

		String path = "/Users/sami/Desktop/SDETAutomation/";
		
		String logFolderPath = createLogFolder(path, "ThisIsALogFolder");
		
		System.out.println("Log Folder path : "+logFolderPath);
	}

	public static String createLogFolder(String path,String newFolderName) {

		File dir = new File(path+newFolderName);

		dir.mkdir();

		return dir.getAbsolutePath();

	}

}
