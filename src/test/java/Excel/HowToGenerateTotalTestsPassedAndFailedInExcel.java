package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constants;


public class HowToGenerateTotalTestsPassedAndFailedInExcel extends Constants{
	
	static String excelFilePath = "../SDETautomation/ExcelPlay/Excel1.xlsx";
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		
		
		System.out.println("Excel results file path : " + excelFilePath);
		HashMap<String, Integer> resultsMap = getStatusDataReport(excelFilePath);
		Integer passed = resultsMap.get("Passed");
		Integer failed = resultsMap.get("Failed");
		Integer totalTestCases = resultsMap.get("Passed") + resultsMap.get("Failed");

		System.out.println("Total Passed : " + passed);
		System.out.println("Total Failed : " + failed);
		System.out.println("TotalTestCases : " + totalTestCases);

		generateTotalResultsMacro(totalTestCases, passed, failed);

		
	}
	
	public static void generateTotalResultsMacro(Integer totalTestCases, Integer passed, Integer failed)
			throws EncryptedDocumentException, InvalidFormatException, IOException {

		excelwrite(excelFilePath, new Object[] { null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null });

		excelwrite(excelFilePath, new Object[] { null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null });

		excelwrite(excelFilePath, new Object[] { getcurrentdateyyyyMMddHHmmss(), null, null, null, null, null,
				"Total Test Cases", "Passed TC's", "Failed TC's", null, null, null, null, null, null, null, null });
		excelwrite(excelFilePath, new Object[] { getcurrentdateyyyyMMddHHmmss(), null, null, null, null, null,
				totalTestCases, passed,failed, null, null, null, null, null, null, null, null, null });
	}

	
	
	public static HashMap<String, Integer> getStatusDataReport(String path)
			throws IOException {

		XSSFSheet sht = getExcelResultsSheet(path);

		Constants.passed = 0;
		Constants.failed = 0;
		Constants.resultsMap.clear();
		
		System.out.println("total rows : " + sht.getLastRowNum());
		
		for (int i = 0; i <= sht.getLastRowNum(); i++) {
			String status = readexcelvalue_GetTotalcaseAmountResult(i, 6, path);
			// System.out.println("iteration : " +i +" | Status = "+status);
			if (status.equalsIgnoreCase("Passed")) {
				Constants.passed++;
			} else if (status.equalsIgnoreCase("Failed")) {
				Constants.failed++;
			}
		}

		Constants.resultsMap.put("Passed", Constants.passed);
		Constants.resultsMap.put("Failed", Constants.failed);

		for (Entry<String, Integer> e : Constants.resultsMap.entrySet()) {
			 System.out.println(e.getKey()+" : "+e.getValue());
		}
		return Constants.resultsMap;
	}
	
	
	public static void excelwrite(String Filename, Object[] ob)
			throws EncryptedDocumentException, InvalidFormatException,
			IOException {

		FileInputStream inp = new FileInputStream(Filename);

		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheetAt(0);
		int num = sheet.getLastRowNum() + 1;
		System.out.println("row number is   " + num);
		// Row row = sheet.createRow(++num);

		// This data needs to be written (Object[])
		Map<String, Object[]> data = new TreeMap<String, Object[]>();

		data.put("1", ob);
		// Iterate over data and write to sheet
		Set<String> keyset = data.keySet();

		// System.out.println("keysets are ::::  " + keyset);

		// int rownum = 0;
		for (String key : keyset) {
			// this creates a new row in the sheet
			System.out.println(key);
			Row row = sheet.createRow(num++);

			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				// this line creates a cell in the next column of that row
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}

		}
		try {
			// this Writes the workbook gfgcontribute
			FileOutputStream fileOut = new FileOutputStream(Filename);
			wb.write(fileOut);
			fileOut.close();
			System.out.println("write.xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getcurrentdateyyyyMMddHHmmss() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public static XSSFSheet getExcelResultsSheet(String path)
			throws IOException {

		File fl = new File(path);
		// D:\Automation\
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sht = workbook.getSheetAt(0);
		return sht;
	}
	
	public static String readexcelvalue_GetTotalcaseAmountResult(int rownm,
			int colnm, String path) throws IOException {
		
		XSSFSheet sht = getExcelResultsSheet(path);
		XSSFRow rw = sht.getRow(rownm);
		XSSFCell cell = rw.getCell(colnm);

		cell.setCellType(Cell.CELL_TYPE_STRING);

		return cell.getStringCellValue();

	}
	
}
