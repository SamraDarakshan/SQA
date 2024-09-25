package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps3 {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user navigates to the Orange HRM login page")
    public void user_navigates_to_orange_HRM_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
            "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver(); 
        driver.get("https://opensource-demo.orangehrmlive.com/"); 
        driver.manage().window().maximize();
        
        loginPage = new LoginPage(driver); // Initialize the page object

        System.out.println("Title of page: " + driver.getTitle());
        Thread.sleep(2000);
    }

    @When("the user inputs {string} and {string}")
    public void user_inputs_username_and_password(String username, String password) {
        loginPage.enterUsername(username);  // Using POM methods
        loginPage.enterPassword(password);
        System.out.println("Entered Username: " + username + " and Password: " + password);
    }

    @And("the user selects the login button")
    public void user_selects_login_button() {
        loginPage.clickLoginButton();  // Using POM methods
        System.out.println("Clicked on login button");
    }

    @Then("the user should be directed to the dashboard")
    public void user_should_be_directed_to_the_dashboard() {
        String expectedTitle = "OrangeHRM";
        if (loginPage.getTitle().equals(expectedTitle)) {
            System.out.println("User redirected to the dashboard");
        } else {
            System.out.println("Login failed.");
        }
    }
}
