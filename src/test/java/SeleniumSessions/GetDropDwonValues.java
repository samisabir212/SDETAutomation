package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDropDwonValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//1. get all the values/options
		//2. select a value
		
		List<WebElement> dayOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
		int totalDays = dayOptions.size();
		
		for(int i=0; i<totalDays; i++){
			String dayVal = dayOptions.get(i).getText();
			System.out.println(dayVal);
				if(dayVal.equals("15")){
					dayOptions.get(i).click();
					break;
				}
		}
		
		for(int i=0; i<totalDays; i++){
			String dayVal = dayOptions.get(i).getText();
			System.out.println(dayVal);
			dayOptions.get(i).click();

		}
		
		
	}

}
