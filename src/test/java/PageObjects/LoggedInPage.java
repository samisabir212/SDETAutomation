package PageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Lib.Logger;

public class LoggedInPage extends BasePage {

	public LoggedInPage() throws IOException {
		super();
	}

	public static @FindBy(xpath = ".//*[@id='leftPanel']/p") WebElement welcomeFirstNameAndLastNameTxt;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/h2") WebElement accountServicesTxt;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[1]/a") WebElement openNewAccountLink;
	public static @FindBy(xpath = ".//div[@id='bodyPanel']/div[1]/ul/li[2]/a") WebElement accountOverviewLink;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[3]/a") WebElement transferFundsLink;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[4]/a") WebElement billPayLink;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[5]/a") WebElement findTransactionsLink;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[6]/a") WebElement updateContactInfoLink;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[7]/a") WebElement requestLoanLink;
	public static @FindBy(xpath = ".//*[@id='leftPanel']/ul/li[8]/a") WebElement logoutLink;

	private static List<WebElement> accountServicesLinks_LIST = new ArrayList<WebElement>();
	private static List<String> expectedAccountServicesLinks_LIST = new ArrayList<String>();

	public void validateAllAccountservicesLinks() throws IOException {

		accountServicesLinks_LIST = returnActualAccountServicesLinks();
		expectedAccountServicesLinks_LIST = returnExpectedAccountServicesLinks();

		if (accountServicesLinks_LIST.get(0).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(0))
				&& accountServicesLinks_LIST.get(1).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(1))
				&& accountServicesLinks_LIST.get(2).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(2))
				&& accountServicesLinks_LIST.get(3).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(3))
				&& accountServicesLinks_LIST.get(4).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(4))
				&& accountServicesLinks_LIST.get(5).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(5))
				&& accountServicesLinks_LIST.get(6).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(6))
				&& accountServicesLinks_LIST.get(7).getText().equalsIgnoreCase(expectedAccountServicesLinks_LIST.get(7))) {

		passedValidationCount++;
		Logger.log("validateAllAccountservicesLinks : Passed", "Registration", "Successful_Registration");

		}else {
			
			try {
				
				Assert.assertEquals(accountServicesLinks_LIST.get(0).getText(), expectedAccountServicesLinks_LIST.get(0));
				
			}catch(java.lang.AssertionError e) {
				
				Logger.log("validateAllAccountservicesLinks : Failed "+ e.getMessage(), "Registration", "Successful_Registration");
				failedValidationCount++;
				failedValidationMessageList.add(e.getMessage());

			}
		}

	}

	public List<WebElement> returnActualAccountServicesLinks() {

		accountServicesLinks_LIST.add(openNewAccountLink);
		accountServicesLinks_LIST.add(accountOverviewLink);
		accountServicesLinks_LIST.add(transferFundsLink);
		accountServicesLinks_LIST.add(billPayLink);
		accountServicesLinks_LIST.add(findTransactionsLink);
		accountServicesLinks_LIST.add(updateContactInfoLink);
		accountServicesLinks_LIST.add(requestLoanLink);
		accountServicesLinks_LIST.add(logoutLink);

		return accountServicesLinks_LIST;

	}

	public List<String> returnExpectedAccountServicesLinks() {

		expectedAccountServicesLinks_LIST.add("Open New Account");
		expectedAccountServicesLinks_LIST.add("Accounts Overview");
		expectedAccountServicesLinks_LIST.add("Transfer Funds");
		expectedAccountServicesLinks_LIST.add("Bill Pay");
		expectedAccountServicesLinks_LIST.add("Find Transactions");
		expectedAccountServicesLinks_LIST.add("Update Contact Info");
		expectedAccountServicesLinks_LIST.add("Request Loan");
		expectedAccountServicesLinks_LIST.add("Log Out");

		return expectedAccountServicesLinks_LIST;

	}

	public void clickAccountOverViewLink() throws InterruptedException, IOException {

		// clickOnElementUsingCustomTimeout(accountOverviewLink, driver, 15);
		waitAndClickElement(accountOverviewLink);
		System.out.println("clicked on accountOverViewLink");

	}

	public void clickLogout() throws InterruptedException, IOException {

		// clickOnElementUsingCustomTimeout(logoutLink, driver, 7);
		waitAndClickElement(logoutLink);
	}

}
