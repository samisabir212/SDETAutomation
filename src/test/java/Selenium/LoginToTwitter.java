package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToTwitter {
	
	
	/**
	login to twitter
	click profile name
	get text of the latest tweet.
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.twitter.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='StaticLoggedOutHomePage-login']//input[@placeholder='Phone, email, or username']")).sendKeys("samisabir22");
		driver.findElement(By.xpath("//div[@id='doc']/div/div/div[1]/div[1]/form/div[2]/input")).sendKeys("Friday27");
		driver.findElement(By.xpath("//input[@class='EdgeButton EdgeButton--secondary EdgeButton--medium submit js-submit']")).click();

		driver.findElement(By.xpath("//a[@class='u-textInheritColor js-nav']")).click();
		String text = driver.findElement(By.xpath("//p[contains(text(),'hellow again 212')]")).getText();

		System.out.println(text);
		//click name //a[@class='u-textInheritColor js-nav']
		//read twweet path //p[contains(text(),'hellow again 212')]
	
		
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	
	
	}

}
