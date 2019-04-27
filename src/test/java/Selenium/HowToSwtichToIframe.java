package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToSwtichToIframe {
	
	/**
	Free Online resourses Explanations : https://riptutorial.com/selenium-webdriver/example/16115/to-switch-to-a-frame-using-java
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://letskodeit.teachable.com/pages/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		// Switch to frame by Id
		driver.switchTo().frame("courses-iframe");
		
		// Switch to frame by name
		//driver.switchTo().frame("iframe-name");
		
		// Switch to frame by numbers
		//driver.switchTo().frame(0);
		
		WebElement searchBox = driver.findElement(By.id("search-courses"));
		searchBox.sendKeys("python");
		
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
		driver.close();
		driver.quit();
	}

}
