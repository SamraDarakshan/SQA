package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Personal\\Automation-Prac\\POM-Selenium-Java-NaveenAutomation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()  {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
//			String projectPath= System.getProperty("user.dir");
//			System.out.println("projectPath " + projectPath );
//			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver1/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Automation-Prac\\Udemy\\Selenium Java Framework from Scratch\\SeleniumJavaFramework\\drivers\\chromedriver1\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","D:\\Personal\\Automation-Prac\\POM-Selenium-Java-NaveenAutomation\\FreeCRMTest\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			//Firefox
			//String projectPath= System.getProperty("user.dir");
			//System.out.println("projectPath " + projectPath );
			System.setProperty("webdriver.geko.driver","D:\\Personal\\Automation-Prac\\POM-Selenium-Java-NaveenAutomation\\FreeCRMTest\\drivers\\gekodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
		driver.get(prop.getProperty("url"));
	}
	

}
