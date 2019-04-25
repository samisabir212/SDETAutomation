package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HowToDragAndDrop {
	
	
	@Test(enabled = true)
	public void dragAndDrop1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0); //<-- the drag and drop elements are inside an iframe so switch to the iframe


		WebElement fromElement = driver.findElement(By.xpath("//div[@id='draggable']"));//item you want to drag
		WebElement toElement = driver.findElement(By.xpath("//div[@id='droppable']"));//destination item you want to drag to
		
		Actions action = new Actions(driver);
		
		// Drag and drop
		//action.dragAndDrop(fromElement, toElement).build().perform();
		
		// Click and hold, move to element, release, build and perform
		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		
		Thread.sleep(4000);
		
		driver.close();
		driver.quit();
		
	}
	

}
