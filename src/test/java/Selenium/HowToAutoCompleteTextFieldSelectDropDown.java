package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToAutoCompleteTextFieldSelectDropDown {

	//free Online resource : http://total-qa.com/auto-suggestion-auto-complete-text-box-visibilityofallelementslocatedby-example/
	
	
	public static void main(String[] args) throws InterruptedException {
		////input[@id='flight-origin-hp-flight']
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		Thread.sleep(4000);
	
		WebElement destinationField =driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
		destinationField.sendKeys("miami ");
		Thread.sleep(4000);
		
		WebElement elements = driver.findElement(By.xpath("//div[@class='display-group-results']"));
		
		List<WebElement> results = elements.findElements(By.tagName("li"));
		int size = results.size();

		System.out.println("The size of the list is: " + size);

		for (int i = 0; i < size; i++) {
			System.out.println(results.get(i).getText());
		}

		Thread.sleep(3000);
		String searchingText = "Miami, FL, United States";
		
		for (WebElement result : results) {
			if (result.getText().contains(searchingText)) {
				result.click();
				break;
			}
		}
		Thread.sleep(4000);


		driver.close();
		driver.quit();
		
	}
	
	
}
