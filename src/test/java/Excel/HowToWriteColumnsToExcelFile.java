package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Lib.Lib;

public class HowToWriteColumnsToExcelFile {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		
		String timeStamp = Lib.getcurrentdateyyMMddHHmm();
		String excelPath = "/Users/sami/Desktop/GitTechTekSolution/"
				+ "SDETautomation/RegressionResults/YourNameHere/ExcelResults/RunResults"+timeStamp+".xlsx";

		writeExcel2(excelPath);
		
	}
	
	
	
	public static void writeExcel2(String File_name) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Result");
		
		String[] columns = new String[] { "Date", "Enviornment",
				"Application", "Service Name",  
				"Account Status","Status", "Test Name", "Endpoint","Comment" };


		Row r = sheet.createRow(0);
		
		for (int rn = 0; rn < columns.length; rn++) {

			r.createCell(rn).setCellValue(columns[rn]);
		}

		try {
			FileOutputStream outputStream = new FileOutputStream(File_name);
			workbook.write(outputStream);
			workbook.close();
			System.out.println("wrote columns to excel");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File Not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO exception");
		}

	}

	
	
	

}
