package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1. Launch the browser -- Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		
		//Windows:
		//System.setProperty("webdriver.chrome.driver", "C:\\users\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//2. enter url:
		//driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		
		//3. get the title of the page:
		String title = driver.getTitle();
		System.out.println("page title is: "+ title);
		
		//4. verification point:
		if(title.equals("Google")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		
	}

}
