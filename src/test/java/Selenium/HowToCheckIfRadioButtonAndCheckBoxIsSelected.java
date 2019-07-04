package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToCheckIfRadioButtonAndCheckBoxIsSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// clicking on radio button elements
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();

		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();

		Thread.sleep(2000);
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();

		Thread.sleep(2000);
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();

		// using isSelected()
		System.out.println("BMW Radio Button is selected? " + bmwRadioBtn.isSelected());
		System.out.println("Benz Radio Button is selected? " + benzRadioBtn.isSelected());
		System.out.println("BMW Checkbox is selected? " + bmwCheckBox.isSelected());
		System.out.println("Benz Checkbox is selected? " + benzCheckBox.isSelected());

		System.out.println();
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}
}
