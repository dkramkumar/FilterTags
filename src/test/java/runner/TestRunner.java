package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				tags = "",
				features = {"src/test/resources/features/"},
				glue = {"stepDefination"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				monochrome = true)

public class TestRunner {

	
}
