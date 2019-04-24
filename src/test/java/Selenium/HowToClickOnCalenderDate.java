package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToClickOnCalenderDate {
	
	//Free Online Resource : http://learn-automation.com/handle-calender-in-selenium-webdriver/
	
	
	@Test(enabled = false)
	public void seleniumpractiseDatePicker1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();

		//find the xptah of all the TD elements
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement W : allDates){
		
			String text = W.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("6")) {
				System.out.println("found the 6th date");
				W.click();
				Boolean isDateSelected = W.isEnabled();
				System.out.println(isDateSelected);
			}
			
		}
		
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
		
	}
	
	
	@Test(enabled = true)
	public void expediaDatePickerTest1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		// Find departing field
		WebElement departingField = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
		// Click departing field
		departingField.click();
		Thread.sleep(3000);
		// Find the date to be selected
		WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]//tbody//tr[4]//td[6]"));
		String text = dateToSelect.getText();
		System.out.println(text);
		// Click the date
		dateToSelect.click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	
	
	////div[@class='datepicker-cal-month'][1]//table//tbody//tr[1]
	
	@Test(enabled = true)
	public void expediaDatePickerTest2() throws InterruptedException {
		
		/**
		 * iterate over <tr> and get each date and put it in a list
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		// Find departing field
		WebElement departingField = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
		// Click departing field
		departingField.click();
		Thread.sleep(3000);
	
		//get all elements and put in list
		for(int i = 1; i<5;i++) {
			
			List<WebElement> elementlist = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][1]//table//tbody//tr["+i+"]"));
			
			for(int j = 0; j<elementlist.size();j++) {
				
				String eleText = elementlist.get(j).getText();
				ArrayList<String> strElementList = new ArrayList<String>();
				System.out.println(eleText);
				strElementList.add(eleText);
				
			}
			
			
			
		}
		
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	
	
}
	


