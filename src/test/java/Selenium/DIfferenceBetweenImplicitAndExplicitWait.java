package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DIfferenceBetweenImplicitAndExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {

	/**
	 * Free Online Resource : https://www.testingexcellence.com/webdriver-explicit-implicit-fluent-wait/
	 * https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/WebDriver.Timeouts.html#implicitlyWait-long-java.util.concurrent.TimeUnit-
	 https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html
	 */
		

		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// implicit wait in English : https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/WebDriver.Timeouts.html#implicitlyWait-long-java.util.concurrent.TimeUnit-
		/**
		 * An imzplicit wait is to tell WebDriver to wait for a certain amount of time
		 *  the driver should poll the page until the element has been found, 
		 *  or this timeout expires before throwing a NoSuchElementException.
		 *   When searching for multiple elements, 
		 *   the driver should poll the page until at least one 
		 *   element has been found or this timeout has expired.

Increasing the implicit wait timeout should be used judiciously as it will have an adverse effect on test run time, especially when used with slower location strategies like XPath.
		 */

		
		//Explicit Wait in english : https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html

		/**
		 * The explicit wait is used to tell the 
		 * Web Driver to wait for certain conditions (Expected Conditions) or 
		 * the maximum time exceeded before throwing an "ElementNotVisibleException" exception.
		 */
		
	
		
		WebElement signUpButton = (new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='login-link s-btn s-btn__primary py8 btn-topbar-primary']")));
		
	
		signUpButton.click();
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
	}

}
