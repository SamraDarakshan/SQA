package test2;
import org.openqa.selenium.webDriver;

public class TestCase2 {

	public TestCase2() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\SQA_Trainings_SeleniumJava\\SQATrainings_Softwares\\Browser\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//Read the title
		System.out.println("Tittle of page:"+ driver.getTitle());
		Thread.sleep(5000);
		
	}

}
