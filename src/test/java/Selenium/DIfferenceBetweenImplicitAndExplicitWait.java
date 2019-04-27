package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIfferenceBetweenImplicitAndExplicitWait {
	
	public static void main(String[] args) {

	/**
	 * Free Online Resource : https://www.testingexcellence.com/webdriver-explicit-implicit-fluent-wait/
	 */
		

		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// implicit wait in English :
		/**
		 * An implicit wait is to tell WebDriver to wait for a certain amount of time
		 * when trying to find an element or elements if they are not immediately available.
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//Explicit Wait in english :
		/**
		 * The explicit wait is used to tell the 
		 * Web Driver to wait for certain conditions (Expected Conditions) or 
		 * the maximum time exceeded before throwing an "ElementNotVisibleException" exception.
		 */
		
		WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElement")));
		
		
		
	}

}
