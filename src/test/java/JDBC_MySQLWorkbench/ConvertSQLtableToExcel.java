package JDBC_MySQLWorkbench;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ConvertSQLtableToExcel {
	
	static String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=" + TimeZone.getDefault().getID();

	public static void main(String[] args) throws Exception {
		
		try {
			
			Connection conn = DriverManager.getConnection(url, "root", "Friday26");
			
			if(conn != null) {
				
				System.out.println("connection successful");
			
			}else {
			
				System.out.println("connection unsuccessful");
			
			}
			convertSQLDataToExcel(conn);

		
			
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	 public static void convertSQLDataToExcel(Connection con) throws Exception  { 
	        @SuppressWarnings("unused")
	        Workbook readWorkbook = WorkbookFactory.create(new FileInputStream("/Users/sami/Desktop/GitTechTekSolution/SDETautomation/RegressionResults/YourNameHere/ExcelResults/RunResultsSQLtoEXCEL.xlsx") );
	        @SuppressWarnings("resource")
	        Workbook writeWorkbook = new HSSFWorkbook();
	        Sheet resultsSheet = writeWorkbook.createSheet("results");

	        Statement stmt = null;
	        ResultSet rs = null;
	        try{
	            String query ="SELECT * FROM employees limit 5";

	            stmt = con.createStatement();
	            rs = stmt.executeQuery(query);
	            ResultSetMetaData rsmd = rs.getMetaData();
	            int columnsNumber = rsmd.getColumnCount();

	            Row desRow1 = resultsSheet.createRow(0);
	            for(int col=0 ;col < columnsNumber;col++) {
	                Cell newpath = desRow1.createCell(col);
	                newpath.setCellValue(rsmd.getColumnLabel(col+1));
	            }
	            while(rs.next()) {
	                System.out.println("Row number" + rs.getRow() );
	                Row desRow = resultsSheet.createRow(rs.getRow());
	                for(int col=0 ;col < columnsNumber;col++) {
	                    Cell newpath = desRow.createCell(col);
	                    newpath.setCellValue(rs.getString(col+1));  
	                }
	                FileOutputStream fileOut = new FileOutputStream("/Users/sami/Desktop/GitTechTekSolution/SDETautomation/RegressionResults/YourNameHere/ExcelResults/RunResultsSQLtoEXCEL.xlsx");
	                writeWorkbook.write(fileOut);
	                fileOut.close();
	            }
	        }
	        catch (SQLException e) {
	            System.out.println("Failed to get data from database");
	        }
	    }


}
