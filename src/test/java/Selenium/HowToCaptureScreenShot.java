package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToCaptureScreenShot {
	
	
	//free Online Resource : https://www.guru99.com/take-screenshot-selenium-webdriver.html
	
	@Test(enabled =true)
	public void howToScreenShot() throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//clicking flights tab
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		
		// Find departing field
		WebElement departingField = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
	
		// Click departing field
		departingField.click();
		Thread.sleep(2000);
		
		// Find the date to be selected
		WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]//tbody//tr[4]//td[6]"));
		
		String text = dateToSelect.getText();
		System.out.println(text);//<-- just printing out the text of the date to select
		//Click the date
		dateToSelect.click();
		Thread.sleep(3000);

		//capturing screenshot
		String fileName = getRandomString(10) + ".png";
		String directory = "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/ScreenShots/";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
		
		
	}
	
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			
			sb.append(characters.charAt(index));
		}
		
		String screenShotFile = "ScreenShot_"+sb.toString();
		
		return screenShotFile;
	}

}
