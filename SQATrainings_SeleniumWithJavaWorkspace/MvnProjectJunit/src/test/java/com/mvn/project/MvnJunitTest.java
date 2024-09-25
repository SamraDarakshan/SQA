package com.mvn.project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MvnJunitTest {
	
	static WebDriver driver;
	@BeforeClass
	public static void setup() {
		//open browser
		//hit url
		System.out.println("Open the chrome browser");
		driver = new ChromeDriver();

	}
	
	@Test
	public void loginTest() throws InterruptedException{
		//Login with valid credentials
		System.out.println("open website");
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		driver.manage().window().maximize();
		//Read the title
		System.out.println("Tittle of page:"+ driver.getTitle());
		Thread.sleep(5000);
		

	}
	
	@AfterClass
	public static void tearDown() {
		//close browser
		System.out.println("Close the browser");
		driver.quit();
	}
}
