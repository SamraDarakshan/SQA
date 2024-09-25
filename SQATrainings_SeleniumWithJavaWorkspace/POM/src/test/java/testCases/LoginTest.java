package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

	 private WebDriver driver;
	 LoginPage loginpage;
	 HomePage homepage;
	
	 @BeforeTest
	 public void setup() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().window().maximize();
			//Read the title
			
			System.out.println("Tittle of page:"+ driver.getTitle());
			
			loginpage = new LoginPage(driver);
			homepage = new HomePage(driver);
			
			Thread.sleep(2000);
			
	 }
	 
	 @Test
	 public void getheading() {
		 homepage.getlinkheading();
	 }
	 
	 @Test
	 public void testValidateLogin() {
	     loginpage.enterUsername("Admin");
	     loginpage.enterPassword("admin123");
	     loginpage.clickLogin();
	 }
	 
	 @AfterTest
	 public void teardown() {
		 driver.close();
	 }
}
