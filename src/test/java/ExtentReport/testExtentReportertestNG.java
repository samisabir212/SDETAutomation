package ExtentReport;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Constants.Constants;
import Lib.Lib;

public class testExtentReportertestNG extends Constants {
	
	public static ExtentHtmlReporter extentReporter;


	
	@BeforeSuite()
	public void beforeSuite() {
		
		String currentDate = Lib.getcurrentdateyyMMddHHmm();
		extentReporter = new ExtentHtmlReporter("./Reports/RegressionExtentReport"+currentDate+".html");

		
	}
	
	@Test(enabled = true)
	public void testExtent() throws IOException {
		
		ExtentReports extent = new ExtentReports();

	    
         // attach the reporter which we created in Step 1
	    extent.attachReporter(extentReporter);
	    
         // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("LoginTest","this is a description of the test");
	    
         // log method will add logs in report and provide the log steps which will come in report
	    logger.log(Status.PASS, "Login to amazon");
	   
	    logger.log(Status.PASS, "Title verified");
	   
         // Flush method will write the test in report- This is mandatory step  
	    extent.flush();
		
         // You can call createTest method multiple times depends on your requirement
         // In our case we are calling twice which will add 2 testcases in our report
	    ExtentTest logger2=extent.createTest("Logoff Test");
	    
	    logger2.log(Status.FAIL, "Title verified");
	    
	    logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mukeshotwani/Desktop/logo.jpg").build());
     
	    logger2.pass("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mukeshotwani/Desktop/logo.jpg").build());

         // This will add another test in report
	    extent.flush();
		
		
	}

}
