package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToPerformImplicitWait {
	
	/**
	 * 
	 * Free Online Resource : https://www.guru99.com/implicit-explicit-waits-selenium.html
	 */
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		
		// implicit wait in English :
		/**
		 * An implicit wait is to tell WebDriver to wait for a certain amount of time
		 * when trying to find an element or elements if they are not immediately available.
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
