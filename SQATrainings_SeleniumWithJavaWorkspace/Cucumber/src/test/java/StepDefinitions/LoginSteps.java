package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private WebDriver driver; // Global driver


    @Given("User is on orange HRM login page")
    public void loginpage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
            "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver(); // Initialize driver globally
        driver.get("https://opensource-demo.orangehrmlive.com/"); // Use correct HRM URL
        driver.manage().window().maximize();
        System.out.println("Tittle of page: " + driver.getTitle());
        Thread.sleep(5000); // Just for demo, not recommended for real use
    }
    @Test(priority=2)
    @When("User enter valid username & password")
    public void credentials() {
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123"); // Fixed CSS selector
        System.out.println("Entered Correct Username and Password");
    }
    @Test(priority=1)
    @And("User click on login button")
    public void clickBtn() {
        driver.findElement(By.xpath("//button[@type='submit']")).click(); // Correct button
        System.out.println("Clicked on button");

    }

    @Then("User should redirect to the dashboard page")
    public void dashboardPage() {
        // Add some check to verify user is on the dashboard
        String expectedTitle = "OrangeHRM"; // or the expected title of the dashboard page
        if (driver.getTitle().equals(expectedTitle)) {
            System.out.println("User redirected to dashboard");
        } else {
            System.out.println("Login failed.");
        }
        //driver.quit(); // Close the browser
    }
}
