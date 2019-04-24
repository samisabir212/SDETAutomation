package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToSelectElementFromDropDownMenu {
	
	
	/**
	 * 
	 * Free online resource : https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement element = driver.findElement(By.id("carselect"));
		
		/**
		 * use the Select Class as a helper to select different options in a dropdownlist
		 */
		Select sel = new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select Benz by value");
		sel.selectByValue("benz"); //<-- select by value

		Thread.sleep(2000);
		System.out.println("Select Honda by index");
		sel.selectByIndex(2);//<-- select by index
		
		Thread.sleep(2000);
		System.out.println("Select BMW by visible text");
		sel.selectByVisibleText("BMW");//<-- select by visable text
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> options = sel.getOptions(); //<-- use the select instance object of the dropdown element and use getOptions which returns a list of webelements which returns all the options 
	
		int size = options.size(); //<-- use .size() to get the total amount of options in the drop downlist and store it in a int object called size
		
		for (int i=0; i<size; i++) { //<-- use a for loop to iterate over the total number of elements in the list
			
			String optionName = options.get(i).getText(); //<-- use options.get and pass i as the arguement as the index and get the text and store it in a string object
			System.out.println(optionName);
		}
	
		
		
	}

}
