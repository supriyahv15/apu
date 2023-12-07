package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)

	@CucumberOptions(features= {"src/test/resources/Login/"},
	glue = "StepDefnition",
	dryRun = false,
	tags = "@positiveTest",
	plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber1.xml","json:testoutput/cucumber2.json"})

	public class TestRunner2 {

	}
