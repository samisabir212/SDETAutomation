package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = "src/resources/java/Features",glue = "StepDefinitions", tags = {"@LOGIN"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
