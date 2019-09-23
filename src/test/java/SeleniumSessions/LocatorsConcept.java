package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);

		// 7 locators:
		// 1. id: --I
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("naveen@gmail.com");
//
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("test@123");
//
//		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
//		loginbutton.click();
		
//		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2. name: --II
		//driver.findElement(By.name("test")).sendKeys("test@gmail.com");
		
		//3. xpath: address of the element and it uses properties of the element --III
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		
		//4. CSS Selector: --III
		//driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		
		//5. Class Name: --IV
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("m-bottom-3")).sendKeys("test@123");
		
		//6. linkText: only for links:
		driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial link text:
		driver.findElement(By.partialLinkText("Sign")).click();
		
		
	}

}
