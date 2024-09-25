//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginSteps2 {
//    private WebDriver driver;
//
//    @Given("the user navigates to the Orange HRM login page")
//    public void user_navigates_to_orange_HRM_login_page() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver",
//            "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
//
//        driver = new ChromeDriver(); 
//        driver.get("https://opensource-demo.orangehrmlive.com/"); 
//        driver.manage().window().maximize();
//        System.out.println("Title of page: " + driver.getTitle());
//        Thread.sleep(2000);
//    }
//
//    @When("the user inputs {string} and {string}")
//    public void user_inputs_username_and_password(String username, String password) {
//        WebElement usernameField = driver.findElement(By.name("username"));
//        usernameField.sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//        System.out.println("Entered Username: " + username + " and Password: " + password);
//    }
//
//    @And("the user selects the login button")
//    public void user_selects_login_button() {
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        System.out.println("Clicked on login button");
//    }
//
//    @Then("the user should be directed to the dashboard")
//    public void user_should_be_directed_to_the_dashboard() {
//        String expectedTitle = "OrangeHRM";
//        if (driver.getTitle().equals(expectedTitle)) {
//            System.out.println("User redirected to the dashboard");
//        } else {
//            System.out.println("Login failed.");
//        }
//    }
//
//    @But("the user should receive a welcome message on the dashboard")
//    public void checkWelcomeMessage() {
//        // Add code to verify the welcome message on the dashboard
//        WebElement welcomeMessage = driver.findElement(By.id("welcome"));
//        if (welcomeMessage.isDisplayed()) {
//            System.out.println("Welcome message displayed: " + welcomeMessage.getText());
//        } else {
//            System.out.println("Welcome message not found.");
//        }
//        driver.quit();
//    }
//}
