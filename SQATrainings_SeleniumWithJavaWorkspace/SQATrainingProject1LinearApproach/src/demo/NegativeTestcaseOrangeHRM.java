package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class NegativeTestcaseOrangeHRM {
	public static WebDriver driver = new ChromeDriver();

	public static void myCommon() {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}


	public static void main(String[] args) throws InterruptedException {

		NegativeTestcaseOrangeHRM.myCommon();
		WebElement usernamefield= driver.findElement(By.name("username"));
		System.out.println("Field is disable "+ usernamefield.isDisplayed());
		System.out.println("Field is enable "+usernamefield.isEnabled());
		usernamefield.sendKeys("Admin");
//		//paswrod;
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("");
	//	driver.findElement(By.xpath("//input[@type='password']"));
//		
//		//button
	 driver.findElement(By.tagName("button")).click();
////        // Step 5: Verify the validation message
	 WebElement validationMessage1 = driver.findElement(By.tagName("span"));
////        // Explicit wait to wait for the validation message to appear
           //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));         
    //      WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']']"))); // Adjust the locator based on the actual message element
////
////        // Check if the validation message is as expected
       String expectedMessage = "Required"; // The expected validation message
      String actualMessage = validationMessage1.getText();
////
         if (actualMessage.equals(expectedMessage)) {
            System.out.println("Test Passed: Validation message is displayed correctly for empty password.");
        } else {
           System.out.println("Test Failed: Validation message is incorrect.");
            System.out.println("Expected: " + expectedMessage);
           System.out.println("Actual: " + actualMessage);
       }
//    } catch (Exception e) {
//        System.out.println("An error occurred: " + e.getMessage());
//   } finally {
//////        // Close the browser
//       driver.quit();
//   }
//		
//
          
      	NegativeTestcaseOrangeHRM.myCommon();
 		WebElement usernamefield1= driver.findElement(By.name("username"));
 		System.out.println("Field is disable "+ usernamefield1.isDisplayed());
 		System.out.println("Field is enable "+usernamefield1.isEnabled());
 		usernamefield1.sendKeys("");
// 		//paswrod;
 		driver.findElement(By.xpath("//input[@type='password']"));
 		usernamefield1.sendKeys("admin123");
// 		
// 		//button
 		 driver.findElement(By.tagName("button")).click();
////         // Step 5: Verify the validation message
 		Thread.sleep(500);
 		 WebElement validationMessage2 = driver.findElement(By.tagName("span"));
 		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 		//WebElement validationMessage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.tagName("span")));
////         // Explicit wait to wait for the validation message to appear
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));         
     //      WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']']"))); // Adjust the locator based on the actual message element
 ////
////         // Check if the validation message is as expected
          String expectedMessage1 = "Required"; // The expected validation message
          String actualMessage1 = validationMessage2.getText();
 ////
          if (actualMessage1.equals(expectedMessage1)) {
             System.out.println("Test Passed: Validation message is displayed correctly for empty username.");
         } else {
            System.out.println("Test Failed: Validation message is incorrect.");
             System.out.println("Expected: " + expectedMessage1);
            System.out.println("Actual: " + actualMessage1);
        }
          
   		NegativeTestcaseOrangeHRM.myCommon();
   		WebElement usernamefield2= driver.findElement(By.name("username"));
   		System.out.println("Field is disable "+ usernamefield2.isDisplayed());
   		System.out.println("Field is enable "+usernamefield2.isEnabled());
   		usernamefield2.sendKeys("");
//   		//paswrod;
   		driver.findElement(By.xpath("//input[@type='password']"));
   		usernamefield2.sendKeys("");
//   		
//   		//button
   		 driver.findElement(By.tagName("button")).click();
////           // Step 5: Verify the validation message
   		Thread.sleep(500);
   		 WebElement validationMessage3 = driver.findElement(By.tagName("span"));
   		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   		//WebElement validationMessage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.tagName("span")));
////           // Explicit wait to wait for the validation message to appear
              //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));         
       //      WebElement validationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']']"))); // Adjust the locator based on the actual message element
   ////
////           // Check if the validation message is as expected
            String expectedMessage2 = "Required"; // The expected validation message
            String actualMessage2 = validationMessage3.getText();
   ////
            if (actualMessage2.equals(expectedMessage2)) {
               System.out.println("Test Passed: Validation message is displayed correctly for both empty.");
           } else {
              System.out.println("Test Failed: Validation message is incorrect.");
               System.out.println("Expected: " + expectedMessage2);
              System.out.println("Actual: " + actualMessage2);
          }
	}
	
}

////Create Following Negative Testcases:
//Testcase01: UserName_Mandatory
//Enter Password.
//Donot Enter Username
//Click login button
//Verify Validation Message i.e Required
//Testcase02: Password_Mandatory
//Enter Username.
//Donot Enter Password 
//Click login button
//Verify Validation Message i.e Required
//
//Testcase03: Login_Invalid
//Enter Invalid Username
//Enter Invalid Password
//Click login button
//Verify that Error Message appears: "Invalid credentials"
