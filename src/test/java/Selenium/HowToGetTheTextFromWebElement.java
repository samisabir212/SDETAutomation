package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToGetTheTextFromWebElement {
	
	//this is simple we just use .getText() of the webelement and we store the text in a string object and do what ever we want do with it.
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		WebElement radioButtonExampleLegend = driver.findElement(By.xpath(".//*[@id='radio-btn-example']/fieldset/legend"));
		String radioButtonExampleLegendText = radioButtonExampleLegend.getText();//<---- getting the text and storing the return value in a string object
		System.out.println(radioButtonExampleLegendText);//<---outputing text to the output console window
		Thread.sleep(5000);
		driver.close();
		driver.quit();
			
	}

}
