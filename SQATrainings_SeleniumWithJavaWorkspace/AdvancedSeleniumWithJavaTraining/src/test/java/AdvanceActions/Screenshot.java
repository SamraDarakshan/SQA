package AdvanceActions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		//Read the title
		String title =  driver.getTitle();
		System.out.println("Tittle of page:"+ title);

		
		//screenshort for whole page
		TakesScreenshot  takescreenshot  = (TakesScreenshot) driver;
		
		File src = takescreenshot.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("/Personal/Automation-Prac/SQA_Trainings_SeleniumJava/Screenshot/sc1.jpeg"));
		
		//for specific webelement
		WebElement development= driver.findElement(By.linkText("Development"));
	
		File src1 = development.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src1, new File("/Personal/Automation-Prac/SQA_Trainings_SeleniumJava/Screenshot/sc2.jpeg"));
	}
	}


