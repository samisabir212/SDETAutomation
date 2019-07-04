package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToSendKeys {
	
	
	/**
	 * 
	 * free online resourse : https://www.guru99.com/accessing-forms-in-webdriver.html
	 * Please 
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement googleTextField = driver.findElement(By.name("q"));
		googleTextField.sendKeys("Avengers end game reviews");
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	
	}

}
