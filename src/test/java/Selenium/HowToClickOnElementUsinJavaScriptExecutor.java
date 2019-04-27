package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToClickOnElementUsinJavaScriptExecutor {

	//Free Online Resource : http://learn-automation.com/click-in-selenium-webdriver-using-java-script/
	
	private JavascriptExecutor js;

	@Test()
	public void testJavaScriptExecutorToClickOnELement() throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;

		//driver.get("http://www.expedia.com/");
		js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice'");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letskodeit.teachable.com/pages/practice");
		Thread.sleep(2000);
		
		WebElement checkBoxElement = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", checkBoxElement);
		Thread.sleep(2000);

		driver.close();
		driver.quit();
		
		
	}
	
}
