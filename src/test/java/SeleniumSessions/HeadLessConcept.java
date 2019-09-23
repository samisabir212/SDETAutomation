package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept {

	public static void main(String[] args) {

		//no browser is getting launched
		//testing is happened behind the scene
		//execution is fast
		
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		
//		WebDriver driver = new ChromeDriver(co);
//		
//		driver.get("http://www.google.com");
//		System.out.println(driver.getTitle());
		
		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver1 = new FirefoxDriver(fo);
		driver1.get("http://www.google.com");
		System.out.println(driver1.getTitle());

		
	}

}
