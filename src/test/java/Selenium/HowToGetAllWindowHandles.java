package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetAllWindowHandles {
	
	
	/**
	 * 
	 *Free online resources :
	 *http://learn-automation.com/handle-multiple-windows-in-selenium-webdriver/
	 *https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://letskodeit.teachable.com/pages/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		
		// Find Open Window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();

		// Get all handles
		Set<String> handles = driver.getWindowHandles();

		// Switching between handles
		for (String handle: handles) {
			System.out.println(handle);
		}
		
		driver.close();
		driver.quit();
	}
	
}
