package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\CucumberProject\\RLLProjectCucumber\\src\\test\\java\\features\\ContactUs.feature", glue = {
		"steps" }, plugin = { "html:target/Cucumberreport_ContactUs.html", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" })



public class ContactUsPageRunner{

}
