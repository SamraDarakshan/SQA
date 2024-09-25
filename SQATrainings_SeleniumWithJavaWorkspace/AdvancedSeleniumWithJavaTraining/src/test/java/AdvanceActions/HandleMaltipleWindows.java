package AdvanceActions;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleMaltipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-casual-shoes");
		
		driver.manage().window().maximize();
		//Read the title
		String title =  driver.getTitle();
		System.out.println("Tittle of page:"+ title);
		Thread.sleep(5000);
		
		//xpath or locator of child window
		driver.findElement(By.xpath("/html/head/script[13]")).click();
		
		Set <String> handle = driver.getWindowHandles();
		Iterator <String> it = handle.iterator();
	
		String parentwindowid = it.next();
		System.out.println("Your parent window id is" + parentwindowid);
	
		String childwindowid = it.next();
		System.out.println("Your child window id is" + childwindowid);
	
		driver.switchTo().window(childwindowid);
	
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		Assert.assertEquals("Men Casual - Buy Men Casual online in India", title1);

	}

}
