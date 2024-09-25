package demo;
import java.time.Duration;

import org.openqa.selenium.By;
//I have manually imported becuase i was geeting issue
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PositiveTestcaseOrangeHRM {
	
	public static WebDriver driver = new ChromeDriver();

	public static void myCommon() {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		
		//Positive testcases
		
		PositiveTestcaseOrangeHRM.myCommon();
		WebElement usernamefield= driver.findElement(By.name("username"));
		System.out.println("Field is disable "+ usernamefield.isDisplayed());
		System.out.println("Field is enable "+usernamefield.isEnabled());
		usernamefield.sendKeys("Admin");
		//paswrod;
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
	//	driver.findElement(By.xpath("//input[@type='password']"));
		
		//button
		driver.findElement(By.tagName("button")).click();
		
		//ForgetPassword
		PositiveTestcaseOrangeHRM.myCommon();
		driver.findElement(By.className("orangehrm-login-forgot")).click();
		
		//Click link
		PositiveTestcaseOrangeHRM.myCommon();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
		

	}
	

}
/*

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

		*/
		//username 
		//jab ksi field pe multiple action perform krne ki need parjae tou hum fied ko ksi reference k andr store krwadete hen
		//storing object reference with the help of web element . when we need to perfom multiple actions
		//in username field which is of type webElement
		
