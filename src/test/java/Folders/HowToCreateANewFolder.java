package Folders;

import java.io.File;

public class HowToCreateANewFolder {

	public static void main(String[] args) {

		String path = "";
		
	}

	public static String createLogFolder(String path) {

		File dir = new File(path);

		dir.mkdir();

		return dir.getAbsolutePath();

	}

}
