package Excel;

import java.io.FileInputStream;
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


public class HowToWriteResultsToExcelFile {
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
		writeToExcel();
		
	}
	
	public static void writeToExcel() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String excelPath = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/RegressionResults/YourNameHere/ExcelResults/RunResults.xlsx";
		
		excelwrite(excelPath, new Object[] { "some text","Some more text" });
		
	}

	
	public static void excelwrite(String Filename, Object[] ob)
			throws EncryptedDocumentException, InvalidFormatException, IOException {
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

		// System.out.println("keysets are :::: " + keyset);

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
	
}
