package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToClearTextField {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("how to send text to field using selenium");
		Thread.sleep(3000);
		searchField.clear();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
