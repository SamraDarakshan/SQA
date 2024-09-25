package demo;
import java.time.Duration;

import org.openqa.selenium.By;
//I have manually imported becuase i was geeting issue
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//selenium 4 k latest mein need nh hoti but kabi kabi issue ajata h na den tou
		
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		
		//Interview Q if this 
		//it is a polymorphic reference kiun webdriver interface ko chrome ne implement kia hua hai
		WebDriver driver = new ChromeDriver();
		// WebDriver driver is a reference variable, it is
		// not an object of WebDriver because webdriver is an interface
		// and interface ka kabi object nhi banta
		// yahan pe object ChromeDriver class ka object hai
		// because it implements webdriver interface
		// driver k pbject se koi b command koi b object use krlenegn
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// by default window maximize nh hoti humen khud krni parti h
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.Window.html
		driver.manage().window().maximize();
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
		 
		
		//Read the title
		System.out.println("Tittle of page:"+ driver.getTitle());
//		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		//username 
		//jab ksi field pe multiple action perform krne ki need parjae tou hum fied ko ksi reference k andr store krwadete hen
		//storing object reference with the help of web element . when we need to perfom multiple actions
		//in username field which is of type webElement
		
		
		//Positive testcases
		
		WebElement usernamefield= driver.findElement(By.name("username"));
		System.out.println("Field is disable "+ usernamefield.isDisplayed());
		System.out.println("Field is enable "+usernamefield.isEnabled());
		usernamefield.sendKeys("Admin");
		//paswrod;
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
	//	driver.findElement(By.xpath("//input[@type='password']"));
		
		//button
		driver.findElement(By.tagName("button")).click();
		
		
		//driver.findElement(By.className("orangehrm-login-forgot")).click();
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
//		//Create Following Negative Testcases:
//		Testcase01: UserName_Mandatory
//		Enter Password.
//		Donot Enter Username
//		Click login button
//		Verify Validation Message i.e Required
//		WebElement usernamefield= driver.findElement(By.name("username"));
//		System.out.println("Field is disable "+ usernamefield.isDisplayed());
//		System.out.println("Field is enable "+usernamefield.isEnabled());
//		usernamefield.sendKeys("Admin");
//		//paswrod;
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("");
//	//	driver.findElement(By.xpath("//input[@type='password']"));
//		
//		//button
//		driver.findElement(By.tagName("button")).click();
//        // Step 5: Verify the validation message
//        // Explicit wait to wait for the validation message to appear
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']']"))); // Adjust the locator based on the actual message element
//
//        // Check if the validation message is as expected
//        String expectedMessage = "Required"; // The expected validation message
//        String actualMessage = validationMessage.getText();
//
//        if (actualMessage.equals(expectedMessage)) {
//            System.out.println("Test Passed: Validation message is displayed correctly.");
//        } else {
//            System.out.println("Test Failed: Validation message is incorrect.");
//            System.out.println("Expected: " + expectedMessage);
//            System.out.println("Actual: " + actualMessage);
//        }
//    } catch (Exception e) {
//        System.out.println("An error occurred: " + e.getMessage());
//    } finally {
//        // Close the browser
//        driver.quit();
//    }
		
//
//		Testcase02: Password_Mandatory
//		Enter Username.
//		Donot Enter Password 
//		Click login button
//		Verify Validation Message i.e Required
//
//		Testcase03: Login_Invalid
//		Enter Invalid Username
//		Enter Invalid Password
//		Click login button
//		Verify that Error Message appears: "Invalid credentials"
        
        
		
		

	}
	

}
