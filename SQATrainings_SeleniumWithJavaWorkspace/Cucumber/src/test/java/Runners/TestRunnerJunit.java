package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features", // Path to your .feature file
    glue = {"StepDefinitions"}, // Path to your step definitions package
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // To generate reports
    monochrome = true // Makes console output readable
)
public class TestRunnerJunit {

}