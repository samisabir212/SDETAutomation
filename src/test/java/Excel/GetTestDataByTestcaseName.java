package Excel;

import java.io.IOException;
import java.util.ArrayList;

import Lib.Lib;

public class GetTestDataByTestcaseName {

	
	
	public static void main(String[] args) throws IOException {
		
		String excelPath = "/Users/sami/Desktop/Automation/getTestCasesData.xlsx";
		
		ArrayList<String> testdataList = Lib.getDataByTestCaseName("Login",excelPath);
		
		for(int i = 0; i<testdataList.size();i++) {
			
			System.out.println(testdataList.get(i));
		}
	
		
		System.out.println("first name : "+ testdataList.get(1));
	}

	
	
	
	
}
