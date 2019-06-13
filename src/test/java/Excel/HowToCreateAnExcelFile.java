package Excel;

import Lib.Lib;

public class HowToCreateAnExcelFile {
	
	
	
	public static void main(String[] args) {
		
		String timeStamp = Lib.getcurrentdateyyMMddHHmm();
		String excelPath = "/Users/sami/Desktop/GitTechTekSolution/"
				+ "SDETautomation/RegressionResults/YourNameHere/ExcelResults/RunResults"+timeStamp+".xlsx";
		Lib.createNewExcelWithNewSheet(excelPath,"Results");
	}

}
