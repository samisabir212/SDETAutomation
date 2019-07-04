package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToGetAllLinkOnWebPage_GetListOfWebElements {
	/**
	 * this is example shows you how to get a list of webelements.
	 * This example is getting all the links in a webpage by using the 'a' tag
	 * Free online resource : https://www.toolsqa.com/selenium-webdriver/find-all-the-links/
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		/**
		 * this will put all the links that have an "a" tag in a list called linkswithATag
		 * Notice the List is a generic type using WebElement : List<WebElement>
		 * Notice that we are using .findElements not .findElement
		 */
		List<WebElement> linkswithATagList = driver.findElements(By.tagName("a")); 
		
		/**
		 * then use an enhanced for loop to iterate over the list
		 */
		
		for(WebElement e : linkswithATagList) {
			
			String strLinkText = e.getText();//<---- get the text and store in String object
			System.out.println(strLinkText);
		}
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	

}
