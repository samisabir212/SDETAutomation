package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		//driver.quit();
		
		System.out.println(driver.getTitle()); 
		//close//NoSuchSessionException: invalid session id
		//quit--//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		

	}

}
