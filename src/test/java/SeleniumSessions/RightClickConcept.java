package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMeBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions action = new Actions(driver);

		action.contextClick(rightClickMeBtn).build().perform();

		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		System.out.println(copyElement.getText());
		// copyElement.click();
		
		String xpathVal = "//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-item context-menu-icon')]";
		
		if(clickOnRightClickOption(xpathVal,"Select")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
	}

	/**
	 * This method is used to select the value option after right click
	 * @param selectValue
	 */
	public static boolean clickOnRightClickOption(String xpathValue, String selectValue) {
		boolean flag = false;
		List<WebElement> optionsList = driver.findElements(By.xpath(xpathValue));		
		for (int i = 0; i < optionsList.size(); i++) {
			String optionValue = optionsList.get(i).getText();
			System.out.println(optionValue);
			if (optionValue.equals(selectValue)) {
				optionsList.get(i).click();
				flag = true;
				break;
			}
		}
		return flag;
	}

}
