package StepDefinitions;

import java.io.IOException;

import Constants.Constants;
import WebDriverManager.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps extends WebDriverManager {

	public Steps() throws IOException {
		super();
	}
	
	
		//background step that can be applied to all or some feature files
		@Given("initialize test")
		public void initialize() {
			
			Constants.totalValidationCount=0;
			Constants.passedValidationCount=0;
			Constants.failedValidationCount=0;

					
		}


	// ~~~~~~~~~~testing env~~~~~~~~~
	@Then("^launch locally$")
	public void launchLocally() throws InterruptedException, IOException {

		System.out.println("hello ");
		// driver.get(Lib.getEndpointProperties("STAGING_PARABANK"));
		//
		// String title = driver.getTitle();
		// System.out.println("title is " + title);
		// Thread.sleep(7000);
		//
		// driver.close();
		// driver.quit();

	}

	@Then("^launch AWS cloud$")
	public void launch_AWS_cloud() {

		System.out.println("hello");

	}

	@Then("^launch browserStack$")
	public void launch_browserStack() {

	}

	@Then("^launch SauceLabs$")
	public void launch_SauceLabs() {

	}
	
	

	
	

	
	
}
