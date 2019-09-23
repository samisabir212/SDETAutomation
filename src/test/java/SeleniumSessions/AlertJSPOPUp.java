package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertJSPOPUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//click on Go button
		
		//Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		alert.accept();//click on Ok button
		
		//alert.dismiss(); //cancel the pop up
				
	}

}
