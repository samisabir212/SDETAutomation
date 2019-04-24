package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToSendKeys {
	
	
	/**
	 * 
	 * free online resourse : https://www.guru99.com/accessing-forms-in-webdriver.html
	 */
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("albert Einstein");
		driver.close();
		driver.quit();
		
	}

}
