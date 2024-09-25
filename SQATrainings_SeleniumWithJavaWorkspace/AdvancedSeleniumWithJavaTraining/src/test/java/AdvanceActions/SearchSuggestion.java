package AdvanceActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		//Read the title
		String title =  driver.getTitle();
		System.out.println("Tittle of page:"+ title);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	   List <WebElement> suggestion_list = driver.findElements(By.xpath("//ul/li[@class='sbct PZPZlf']"));
	   System.out.println(suggestion_list.size());
	   Thread.sleep(2000);
	   
	   for(WebElement suggestion_name: suggestion_list) {
		   String suggestion_value= suggestion_name.getText();
	   
	   System.out.println(suggestion_value);
	   
	   //for exact keyword like look in console selenium uses put here
	   if(suggestion_value.equalsIgnoreCase("selenium element")){
		   suggestion_name.click();
	   }
     else if
	   (suggestion_value.contains("selenium")) {
    	 suggestion_name.click();
     }
     else
    	 System.out.println("Nothing found");
		  
	   
	   }
//		
		
	}

}
