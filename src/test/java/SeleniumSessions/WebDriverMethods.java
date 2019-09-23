package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("ssl")){
			System.out.println("PASS");
		}
		
		System.out.println(driver.getPageSource());
		
		//close the browser:
		driver.quit();
		
	}

}
