package AdvanceActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/");
		
		driver.manage().window().maximize();
		//Read the title
		String title =  driver.getTitle();
		System.out.println("Tittle of page:"+ title);

		Actions actions = new Actions(driver);
		WebElement documentation = driver.findElement(By.id("m-documentation"));
		WebElement overview = driver.findElement(By.id("m-documentationoverview"));

		//Thread.sleep(30000);
		actions.moveToElement(documentation)
		.moveToElement(overview)
		.keyDown(Keys.CONTROL)
		.click()
		.keyUp(Keys.CONTROL).build().perform();
		
		//for multiple actions we use build for one we use perform
	
	}

}
