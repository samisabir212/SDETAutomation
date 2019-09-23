package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static void main(String[] args) {
		String headless = "no";
		String imageDisabled = "no";

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(BrowserOptions.getChromeOptions(headless, imageDisabled));
		driver.get("http://amazon.com");
		
		System.out.println(driver.getTitle());
	}

}
