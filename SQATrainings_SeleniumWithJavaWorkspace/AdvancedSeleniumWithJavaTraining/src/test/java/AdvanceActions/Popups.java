package AdvanceActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.manage().window().maximize();
	//Read the title
	String title =  driver.getTitle();
	System.out.println("Tittle of page:"+ title);
	
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	
	Thread.sleep(5000);
	
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	driver.switchTo().alert().sendKeys("Samra");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	}
}
