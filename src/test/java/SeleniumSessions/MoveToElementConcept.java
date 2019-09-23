package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		System.out.println(driver.getTitle());
		
		WebElement mainMenuLink = driver.findElement(By.className("menulink"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mainMenuLink).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();
		System.out.println(driver.getTitle());

		
	}

}
