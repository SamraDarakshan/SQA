package AdvanceActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import ch.qos.logback.core.util.Duration;

public class Waits {
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/iframe");
	
	driver.manage().window().maximize();
	
	//implicit wait
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
 // Wait until the element is visible and clickable
 // Create an explicit wait of up to 10 seconds
    
    WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
    		.until(ExpectedConditions.elementToBeClickable(By.xpath(""));
//    		
//    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//    // Wait until the element is visible and clickable
//    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
//
//    // Now click the element
//    element.click();
	//Read the title
	String title =  driver.getTitle();
	System.out.println("Tittle of page:"+ title);
	}
	
	//Changing how often the code is evaluated (polling interval)
//	Wait<WebDriver> wait =
//	        new FluentWait<>(driver)
//	            .withTimeout(Duration.ofSeconds(2))
//	            .pollingEvery(Duration.ofMillis(300))
//	            .ignoring(ElementNotInteractableException.class);
//
//	    wait.until(
//	        d -> {
//	          revealed.sendKeys("Displayed");
//	          return true;
//	        });

}
