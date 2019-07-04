package FolderAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class HowToMergeTwoFolders {

	
	public static void main(String[] args) {
		
		String folder1 = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/FolderPlay/MergeFolders/folder1";
		String folder2 = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/FolderPlay/MergeFolders/folder2";
		String finalFolder = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/FolderPlay/MergeFolders/finalFolder";
		
		mergeFolders(folder1, finalFolder);
		mergeFolders(folder2, finalFolder);

	}
	
	public static void mergeFolders(String sourceFolder, String DestinationFolder) {

			
			File dir1 = new File(sourceFolder);
			File dir2 = new File(DestinationFolder);
			
			try {
			    FileUtils.copyDirectory(dir1, dir2);
			} catch (IOException e) {
			    e.printStackTrace();
			}
			
		
		
	}
	
	
	
	
	
}
