package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClickOnRadioButton {
	
	//free online resource : https://www.toolsqa.com/selenium-webdriver/checkbox-radio-button-operations/
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		
		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		System.out.println();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}

}
