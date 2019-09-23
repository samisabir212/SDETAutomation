package SeleniumSessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.skyscanner.co.in/");

		driver.findElement(By.id("depart-fsc-datepicker-button")).click();

		selectCalendarDate("July 2019", 7);

	}

	public static void selectCalendarDate(String month, int day) {
		boolean flag = false;
		boolean selectFlag = true;
		Select select = new Select(driver.findElement(By.id("depart-calendar__bpk_calendar_nav_select")));
		select.selectByVisibleText(month);

		List<WebElement> datesList = driver.findElements(By.xpath("//tbody//tr//span"));
		System.out.println("total number of dates in caledar: " + datesList.size());

		List<WebElement> diabledDatesList = driver.findElements(By.className("bpk-calendar-date--blocked"));
		int disbledDatesListCount = diabledDatesList.size();
		System.out.println("total disabled dates are: " + disbledDatesListCount);
		month = month.split(" ")[0].trim();
		if (!verifyDisabledDate(day, month, diabledDatesList, datesList)) {
			for (int i = disbledDatesListCount; i < datesList.size(); i++) {
				String dateText = datesList.get(i).getText();
				// System.out.println(dateText);
				if (Integer.parseInt(dateText) == day) {
					datesList.get(i).click();
					flag = true;
					break;
				}
			}
		} else {
			System.out.println("in correct date");
		}

		// if (flag) {
		// System.out.println("correct date got selected");
		// } else {
		// System.out.println("in correct date");
		// }
	}

	public static boolean verifyDisabledDate(int day, String month, List<WebElement> diabledDatesList, List<WebElement> datesList) {
		int disbledDatesListCount = diabledDatesList.size();
		ArrayList<String> at = new ArrayList<String>();
		for (int i = 0; i < disbledDatesListCount; i++) {
			at.add(diabledDatesList.get(i).getText());
		}

		ArrayList<String> all = new ArrayList<String>();
		for (int i = disbledDatesListCount; i < getMonthMap(month) + (getMonthMap(month) - disbledDatesListCount - 1); i++) {
			all.add(datesList.get(i).getText());
		}

		if (at.contains(String.valueOf(day))) {
			if (all.contains(String.valueOf(day))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public static Integer getMonthMap(String month) {
		HashMap<String, Integer> monthMap = new HashMap<String, Integer>();
		monthMap.put("Jan", 31);
		monthMap.put("Feb", 28);
		monthMap.put("Mar", 31);
		monthMap.put("Apr", 30);
		monthMap.put("May", 31);
		monthMap.put("June", 30);
		monthMap.put("July", 31);
		monthMap.put("Aug", 31);
		monthMap.put("Sep", 30);
		monthMap.put("Oct", 31);
		monthMap.put("Nov", 3);
		monthMap.put("Dec", 31);

		return monthMap.get(month);
	}

}
