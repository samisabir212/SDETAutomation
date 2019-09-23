package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String mainWindowID = it.next();
		System.out.println("main window id is: "+ mainWindowID);
		
		String childWindowID = it.next();
		System.out.println("child window id is: "+ childWindowID);

		driver.switchTo().window(childWindowID);
		
		System.out.println("child window title is: "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(mainWindowID);
		
		System.out.println("main window title is: "+ driver.getTitle());

		
		
	}

}
