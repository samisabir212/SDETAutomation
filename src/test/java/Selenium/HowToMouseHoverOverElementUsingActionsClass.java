package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToMouseHoverOverElementUsingActionsClass {
	

	 /**
	  * 
	  * Free Online Resource : https://www.softwaretestingmaterial.com/mouse-hover-actions-using-selenium/
	  */
	
	 JavascriptExecutor js;

	
	@Test(enabled = true)
	public void testMouseHoverAction1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("http://letskodeit.teachable.com/pages/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(0, 600)");//<-- scroll down window
		
		Thread.sleep(2000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver); //<-- passing WebDriver instance object to Actions Class
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
		
		WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
		action.moveToElement(subElement).click().perform();
		Thread.sleep(2000);

		driver.close();
		driver.quit();
		
	}

}
