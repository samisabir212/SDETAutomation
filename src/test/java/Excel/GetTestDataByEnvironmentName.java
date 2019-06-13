package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constants;

public class GetTestDataByEnvironmentName {
	
	
	public static void main(String[] args) throws IOException {
		
		String paraBankTestDatPath = "/Users/sami/Desktop/Automation/sidrissi/Parabank/Properties/ParaBankTestData.xlsx";

		int rowNum = return_Match_RowNum_By_ENVIRONMENT_value(paraBankTestDatPath, "DEV");
		
		Constants.testData.put("firstname", readExcelValue(paraBankTestDatPath,rowNum, 3));
		Constants.testData.put("lastname", readExcelValue(paraBankTestDatPath,rowNum, 4));
		Constants.testData.put("address", readExcelValue(paraBankTestDatPath,rowNum, 5));
		Constants.testData.put("city", readExcelValue(paraBankTestDatPath,rowNum, 6));
		Constants.testData.put("state", readExcelValue(paraBankTestDatPath,rowNum, 7));
		Constants.testData.put("zipcode", readExcelValue(paraBankTestDatPath,rowNum, 8));
		Constants.testData.put("phonenumber", readExcelValue(paraBankTestDatPath,rowNum, 9));
		Constants.testData.put("ssn", readExcelValue(paraBankTestDatPath,rowNum, 10));
		Constants.testData.put("username", readExcelValue(paraBankTestDatPath,rowNum, 1));
		Constants.testData.put("password", readExcelValue(paraBankTestDatPath,rowNum, 2));
		
		for(Entry<String,String> map : Constants.testData.entrySet()) {
			
			System.out.println("key name : "+ map.getKey()+" , "+"Value : "+map.getValue());
		}
		
		Constants.FIRSTNAME = Constants.testData.get("firstname");
		System.out.println("First name : "+ Constants.FIRSTNAME);
		
	}
	
	public static String readExcelValue(String excelPath,int rownm, int colnm) throws IOException {

		XSSFSheet sht = connectToExcelSheet(excelPath);
		XSSFRow rw = sht.getRow(rownm);
		XSSFCell cell = rw.getCell(colnm);

		cell.setCellType(Cell.CELL_TYPE_STRING);
//		System.out.println(cell.getStringCellValue());

		return cell.getStringCellValue();

	}
	
	public static int return_Match_RowNum_By_ENVIRONMENT_value(String excelPath,String env) throws IOException {

		int i = 0;

		XSSFSheet sht = connectToExcelSheet(excelPath);

		for (i = 0; i < sht.getPhysicalNumberOfRows(); i++) { // check each row
			XSSFRow rw = sht.getRow(i);
			if (returncellvalue(rw, 0).equalsIgnoreCase(env)) {
//				System.out.println("we found matching row number   " + i);
				break;
			}
		}

		return i;
	}
	
	

	public static XSSFSheet connectToExcelSheet(String path) throws IOException {


		File fl = new File(path);

		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sht = wb.getSheetAt(0);
		return sht;
	}
	

	public static String returncellvalue(XSSFRow rw, int colnum) {

		XSSFCell cll = rw.getCell(colnum);

		return cll.getStringCellValue();

	}
	
}
