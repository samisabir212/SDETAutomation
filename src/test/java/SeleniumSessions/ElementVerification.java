package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerification {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/register/");
		
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		WebElement termsElement = driver.findElement(By.name("agreeTerms"));
		System.out.println(termsElement.isSelected());
		termsElement.click();
		System.out.println(termsElement.isSelected());

		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());

		
	}

}
