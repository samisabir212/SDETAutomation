package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HowToSolveStaleElementError {
	
	
	/**
	 * The two reasons for Stale element reference are

	--The element has been deleted entirely.
	--The element is no longer attached to the DOM.
	
	We face this stale element reference exception when 
	the element we are interacting is destroyed and then recreated again. 
	When this happens the reference of the element in the DOM becomes stale.
	 Hence we are not able to get the reference to the element.
	 */
	
	@Test(enabled = true)
	public void solutionForStaleElement1() {
		/**
		 * solution1 
		 * refresh the page and try again for the same element 
		 * assume you are trying to click on a link and getting the stale element exception
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();//<-- try refreshing the page to overcome the stale elemtn when trying to interact with a webelement
		
	}
	
	@Test(enabled = true)
	public void solutionForStaleElement2() {
		
		/**
		 * solution2 you can use a try catch block within a for loop
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		for(int i=0; i<=2;i++){
			  try{
			     WebElement element = driver.findElement(By.xpath("xpath here"));
			     element.click();
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			  }
			}
		
		
	}
	
	@Test(enabled = true)
	public void solutionForStaleElement3() {
		
		/**
		 * solution3 
		 * use a WebDriver wait
		 * use ExpectedCondition
		 * Use the method .elementToBeClickable()
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = driver.findElement(By.xpath("locator"));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();//<-- wait until element is clickable

		

	}
	
	@Test(enabled = true)
	public void solutionForStaleElement4() {
		
		/**
		 * solution3 if you are trying to identify an element 
		 * that has text in it you can use the following
		 * use a WebDriver wait
		 * use ExpectedCondition
		 * Use the method .textToBePresentInElement(Element,Text)
		 * 	the two arguements are the locator and text
		 * 	this will return a boolean
		 * 	if true then try and clicking the element
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = driver.findElement(By.xpath("locator"));
		Boolean isElementPresent = wait.until(ExpectedConditions.textToBePresentInElement(element, "text"));//<-- wait until element is clickable
		System.out.println(isElementPresent);
		
		if(isElementPresent.equals(true)) {
			element.click();
		}else {
			System.out.println("element still not found therefor text you are looking for is not present");
		}
		

	}
	
	@Test(enabled = true)
	public void solutionForStaleElement5() {
		
		/**
		 * solution3 
		 * use a WebDriver wait
		 * use ExpectedCondition
		 * Use the method .visibilityOf(element)
		 * this will check if the element is visible then you can click or do something
		 * with the element.
		 */
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = driver.findElement(By.xpath("locator"));
		wait.until(ExpectedConditions.visibilityOf(element)).click();//<-- wait until the element is visiable then click
	
		

	}

}
