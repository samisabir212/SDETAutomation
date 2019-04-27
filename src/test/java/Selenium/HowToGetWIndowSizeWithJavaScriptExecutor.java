package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToGetWIndowSizeWithJavaScriptExecutor {
	
	/**
	 * Free online resource : http://www.software-testing-tutorials-automation.com/2015/02/how-to-setget-window-position-and-size.html
	 */
	
	public JavascriptExecutor js; //initialize javascriptexector instance object and call it 'js'
	
	@Test(enabled = true)
	public void testGetWindowSizeWithJavaScriptExecutor() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		js = (JavascriptExecutor) driver; //cast javascript execotor to webdriver instance object
		//driver.get("http://www.google.com");
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'"); //navigate to website

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		// Size of window
		long height = (Long) js.executeScript("return window.innerHeight;"); //get window higher
		long width = (Long) js.executeScript("return window.innerWidth;"); //get window width
		
		System.out.println("Height is: " + height);
		System.out.println("Width is: " + width);
		
		driver.close();
		driver.quit();
		
		
	}

	
	
	
}
