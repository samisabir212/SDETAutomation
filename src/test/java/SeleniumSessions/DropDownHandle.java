package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author NaveenKhunteta
 *
 */
public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement dayEle = driver.findElement(By.id("day"));
		WebElement monthEle = driver.findElement(By.id("month"));
		WebElement yearEle = driver.findElement(By.id("year"));

		
//		Select select1 = new Select(dayEle);
//		select1.selectByVisibleText("10");
//		
//		Select select2 = new Select(monthEle);
//		select2.selectByVisibleText("May");
//		
//		Select select3 = new Select(yearEle);
//		select3.selectByVisibleText("1990");

		//selectValueFromDropDown(dayEle, "10");
//		selectValueFromDropDown(monthEle, "Jun");
//		selectValueFromDropDown(yearEle, "1990");

//		Select select = new Select(dayEle);
//		select.selectByIndex(5);
		//selectValueFromDropDown(dayEle, 9);
		
//		getAllDropBoxValues(dayEle);
//		getAllDropBoxValues(monthEle);
//		getAllDropBoxValues(yearEle);

		//Select select = new Select(dayEle);
		//System.out.println(select.isMultiple());
		
		selectDropBoxByPassingValue(monthEle, "Oct");
		
		
	}
	
	/**
	 * This method is used to select the values from drop down on the basis of text
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}
	
	/**
	 * This method is used to select the values from drop down on the basis of index
	 * @param element
	 * @param index
	 */
	public static void selectValueFromDropDown(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);

	}
	
	/**
	 * This method is used to get all the values from drop down
	 * @param element
	 */
	public static void getAllDropBoxValues(WebElement element){
		System.out.println("-------getting values from drop down------");
		Select select = new Select(element);
		List<WebElement> dropList = select.getOptions();
		
		for(int i=0; i<dropList.size(); i++){
			String dropVal = dropList.get(i).getText();
			System.out.println(dropVal);
		}
	}
	
	/**
	 * This method is used to select the values from a drop box on the basis of passed value
	 * @param element
	 * @param value
	 */
	public static void selectDropBoxByPassingValue(WebElement element, String value){
		System.out.println("-------getting values from drop down------");
		Select select = new Select(element);
		List<WebElement> dropList = select.getOptions();
		
		for(int i=0; i<dropList.size(); i++){
			String dropVal = dropList.get(i).getText();
			System.out.println(dropVal);
				if(dropVal.equals(value)){
					dropList.get(i).click();
					break;
				}
		}
	}

}
