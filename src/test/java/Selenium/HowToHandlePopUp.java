package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandlePopUp {
	
	
	/**
	 * Free online resource : https://www.guru99.com/alert-popup-handling-selenium.html
	 */
	
	@Test(enabled = false)
	public void testAlertAcceptPopUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://letskodeit.teachable.com/pages/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
		driver.quit();
	}
	
	@Test(enabled = true)
	public void testAlertDismissPopUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://letskodeit.teachable.com/pages/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		Thread.sleep(3000);

		driver.close();
		driver.quit();
	}

}
