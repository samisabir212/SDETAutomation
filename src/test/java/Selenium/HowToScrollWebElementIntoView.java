package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToScrollWebElementIntoView {
	
	/**
	 * Free online resource : http://learn-automation.com/how-to-scroll-into-view-in-selenium-webdriver/
	 */
	
	private JavascriptExecutor js;

	
	@Test()
	public void testScrollWebElementIntoView() throws InterruptedException {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		js = (JavascriptExecutor) driver;

		//driver.get("http://www.expedia.com/");
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		// Scroll Down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		
		// Scroll Up
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);
		
		// Scroll Element Into View
		WebElement element = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true);", element); 
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		driver.close();
		driver.quit();
		
		
	}

}
