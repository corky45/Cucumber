package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
	(features = "C:\\Users\\clcra\\eclipse-workspace\\Cucumber\\src\\test\\resources\\features\\Practical.feature", 
	glue = "steps",
	tags= " @ColorFeature",
	monochrome = true,
	dryRun= false,
	plugin= {"pretty", "html:target/reports/cucumber.html", "json:target/reports/cucumber.json"}
	)
public class PracticalRunner {
	
}
