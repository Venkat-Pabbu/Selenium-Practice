package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinitions" }, 
monochrome = false, 
plugin = {"pretty", "html:target/reports/HtmlReports", 
		"json:target/reports/cucumber.json",
		"junit:target/reports/cucumber.xml" },
tags = "@smoketest")
public class TestRunner {

}