package AdvanceActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	
			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/iframe");
			
			driver.manage().window().maximize();
			//Read the title
			String title =  driver.getTitle();
			System.out.println("Tittle of page:"+ title);
			
			//switch to the requird frame
			//iframe[@id='mce_0_ifr']
			
			WebElement frameT = driver.findElement(By.id("mce_0_ifr"));
			
			driver.switchTo().frame(frameT);
			
		
			driver.findElement(By.id("tinymce")).sendKeys("Samra");
			
			driver.switchTo().defaultContent();
			}
		}


