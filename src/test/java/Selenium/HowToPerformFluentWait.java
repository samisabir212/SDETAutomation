package Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HowToPerformFluentWait {
	/**
	 * DONT GET confused and make it hard for your self to understand fluent wait
	 * read below to understand....
	 * 
	 * in my opnion i dont use fluent waits... explicit waits is enough to wait for
	 * elements. but you must know what a fluent wait is. basically just say that
	 * fluent wait allows us to poll for specific amount of times for a specific
	 * amount of time. Fluent Wait: Let’s say you have an element which sometime
	 * appears in just 1 second and some time it takes minutes to appear. In that
	 * case it is better to use fluent wait, as this will try to find element again
	 * and again until it find it or until the final timer runs out.
	 * 
	 * or another way to explain fluent wait :
	 * 
	 * Fluent wait is when we can setup a repeat time cycle to verify the condition
	 * is met or not. Fluent wait allows use to setup frequency with a time frame to
	 * verify the given expected condition at regular time interval. This wait is
	 * used in test scenario where element loading time is variable (it can be 10,15
	 * or 20 secs) In this case we can use frequency to handle
	 * "ElementNotVisibleException".
	 * 
	 * FREE RESOURCE :
	 * https://www.toolsqa.com/selenium-webdriver/implicit-explicit-n-fluent-wait/
	 * http://www.qaautomated.com/2016/10/implicit-wait-explicit-wait-and-fluent.html
	 */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/sami/Desktop/GitTechTekSolution/SDETautomation/src/resources/java/Drivers/chromedriver_73");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit Fluent wait in english :
		/**
		 * FluentWait: For each FluentWait instance, you can specify:
		 * 
		 * Frequency(how many times you want to check) with which FluentWait has to
		 * check the conditions defined. Ignore specific types of exception waiting such
		 * as NoSuchElementExceptions while searching for an element on the page.
		 * Maximum amount of time to wait for a condition
		 * 
		 * SET THE POLLING TIME TO THE AMOUNT OF TIMES YOU WANT TO CHECK FOR THE ELEMENT
		 * if you set it to 5 then you will be checking for this element 5 times for
		 * every 30 seconds total of 150 seconds almost 2 minutes
		 * 
		 * When to use FluentWait: When you try to test the presence of an element that
		 * may appear after every x seconds/minutes
		 * 
		 * FluentWait class has below methods to configure the wait.
		 * 
		 * withTimeOut() pollingEvery() ignoring() until()
		 */

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});
	}

}
