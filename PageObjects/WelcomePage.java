package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Util.Logger;
import WebDriverManager.WebDriverManager;

public class WelcomePage extends WebDriverManager {

	// welcome page is the page the server send you too after you registering a new account

	public WelcomePage() throws IOException {
		super();
	}

	public static @FindBy(xpath = ".//*[@id='rightPanel']/p") WebElement successfulRegistrationMessageTxt;

	public static @FindBy(xpath = ".//*[@id='rightPanel']/h1") WebElement welcomeLinkUsernameTxt;

	public static @FindBy(xpath = ".//*[@id='leftPanel']/p") WebElement welcomelinkFirstlastnameTxt;

	public void validateSuccessfulRegistrationMessage() throws IOException {

		String actualText = successfulRegistrationMessageTxt.getText();

		String expectedText = "Your account was created successfully. You are now logged in.";

		
		if (actualText.equals(expectedText)) {
			
			Logger.log("validateSuccessfulRegistrationMessage : Passed", "Registration", "Successful_Registration");
			System.out.println("validateSuccessfulRegistrationMessage : PASSED");
			passedValidationCount++;
			
		} else {
			
			try {
				
				Assert.assertEquals(actualText, expectedText);
				
			}catch(java.lang.AssertionError e) {
				
				failedValidationCount++;
				Logger.log("validateSuccessfulRegistrationMessage : Failed", "Registration", "Successful_Registration");
				failedValidationMessageList.add(e.getMessage());

			}
			
			System.out.println("validateSuccessfulRegistrationMessage : FAILED");
		}

	}
	
	public void validate_Welcome_Text_With_First_and_lastName(String firstname, String lastname) throws IOException {
		
		String firstnameLastname_WelcomeTxt = welcomelinkFirstlastnameTxt.getText();
		
		
		if(firstnameLastname_WelcomeTxt.contains(firstname)&&firstnameLastname_WelcomeTxt.contains(lastname)) {
			
			Logger.log("validate_Welcome_Text_With_First_and_lastName : Passed", "Registration", "Successful_Registration");
			passedValidationCount++;
			
		}else {
			
			try {
				
				Assert.assertEquals(firstnameLastname_WelcomeTxt.contains(firstname), true);
				Assert.assertEquals(firstnameLastname_WelcomeTxt.contains(lastname), true);
			
			}catch(java.lang.AssertionError e) {
				
				Logger.log("validate_Welcome_Text_With_First_and_lastName : Passed", "Registration", "Successful_Registration");
				failedValidationCount++;
				failedValidationMessageList.add(e.getMessage());

			}
		}
		
		System.out.println("firstnameLastname_WelcomeTxt : "+firstnameLastname_WelcomeTxt);
	}

	
	
	
	
	
	
	
	
	
}
