package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
    features = "src/test/resources/Features", // Path to your .feature file
    glue = {"StepDefinitions"}, // Correct package for step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Report generation
    monochrome = true // Readable console output
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setup() {
        System.out.println("Test execution starting...");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Test execution finished.");
    }
}
