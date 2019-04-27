package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HowToSolveElementNotClickable {

	@Test(enabled = true)
	public void solutionELementNotClickable1() throws InterruptedException {

		// Element is loaded in DOM, but it is overlapped by another element
		// Element is not visible because of another element
		
		/**
		 * use Explicit wait (ExpectedCondition webdriver wait)
		 * .invisibilityOfElementLocated
		 * or
		 * Use JavaScriptExecutor
		 */

		System.setProperty("webdriver.chrome.driver",
				Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.name("username")).sendKeys("testing");
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		
		boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		
		if (invisible) {
			WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
			loginButton.click();
		}
		WebElement loginButtonJS = driver.findElement(By.xpath("//input[@value='Login']"));
		js.executeScript("arguments[0].click();", loginButtonJS);

		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	
	@Test(enabled = true)
	public void solutionELementNotClickable2() throws InterruptedException {

		// Element is loaded in DOM, but it is overlapped by another element
		// Element is not visible because of another element
		
		/**
		 * use Actions Class
		 * use the moveToElement functions 
		 */

		System.setProperty("webdriver.chrome.driver",
				Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("some url");
		
		WebElement element = driver.findElement(By.id("navigationPageButton"));
	
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		
		driver.close();
		driver.quit();
		
	}
	
	@Test(enabled = true)
	public void solutionELementNotClickable3() throws InterruptedException {

	/**
	 * In this case induce ExplicitWait with ExpectedConditions set 
		to invisibilityOfElementLocated for the Overlay to be invisible.
	 */
		System.setProperty("webdriver.chrome.driver",
				Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("some url");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("ele_to_inv")));
		
		driver.close();
		driver.quit();
		
	}
	
	@Test(enabled = true)
	public void solutionELementNotClickable4() throws InterruptedException {

	/**
	 * use java script executor to click on element
	 */
		System.setProperty("webdriver.chrome.driver",
				Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("some url");
		
		WebElement ele = driver.findElement(By.xpath("element_xpath"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		driver.close();
		driver.quit();
		
	}

}
