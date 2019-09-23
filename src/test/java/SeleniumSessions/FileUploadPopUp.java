package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		//type = file
		WebElement fileUpload = driver.findElement(By.name("upfile"));
		
		fileUpload.sendKeys("/Users/NaveenKhunteta/Desktop/Static_1.png");
		
		
		
		
	}

}
