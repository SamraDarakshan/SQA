package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashoboardPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	DashoboardPage dashboardPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		 loginPage = new LoginPage();
	}
	
//	@Test(priority=1)
//	public void loginPageTitleTest() {
//		String title = loginPage.validateLoginPageTitle();
//		Assert.assertEquals(title, "OrangeHRM");
//	}
//	
	@Test (priority=1)
	public void hrmLogoImageTest() {
		boolean flag = loginPage.validateHRMImage();
		if(loginPage.validateHRMImage()) {
		Assert.assertTrue(flag);
		   System.out.println("The element is visible on the webpage.");
		}
		else {
			   System.out.println("The element is not svisible on the webpage.");
			   Assert.assertTrue(flag);
		}
	}
//
//	@Test (priority=3)
//	public void loginTest() {
//		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	    
//	}
	
	@Test (priority=2)
	public void loginTestWithInvalidUsernamePassword() {
		loginPage = loginPage.invalidlogin(prop.getProperty("wrongUsername"), prop.getProperty("wrongPassword"));
	    
	String actual_error = loginPage.actualErrorMessage();
	String expected_error = loginPage.expectedErrorMessage(prop.getProperty("expected_error"));

	Assert.assertEquals(actual_error,expected_error);
		System.out.println("Actual error " + actual_error);
		System.out.println("Expected error " + expected_error);
	}
	
	@Test (priority=3)
	public void loginTestWithInvalidUsername() {
		dashboardPage = loginPage.login(prop.getProperty("wrongUsername"), prop.getProperty("password"));
		String actual_error = loginPage.actualErrorMessageWithAttribute();
		String expected_error = loginPage.expectedErrorMessage(prop.getProperty("expected_error"));

		Assert.assertEquals(actual_error,expected_error);
			System.out.println("Actual error " + actual_error);
			System.out.println("Expected error " + expected_error);
	}
	
//	@Test (priority=4)
//	public void loginTestWithInvalidPassword() {
//		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("wrongPassword"));
//	    
//	}
//	@Test (priority=5)
//	public void loginTestWithEmptyUsernamePassword() {
//		dashboardPage = loginPage.login(prop.getProperty("emptyUsername"), prop.getProperty("emptyPassword"));
//	    
//	}
//	@Test (priority=6)
//	public void loginTestWithEmptyUsername() {
//		dashboardPage = loginPage.login(prop.getProperty("emptyUsername"), prop.getProperty("password"));
//	    
//	}
//	@Test (priority=7)
//	public void loginTestWithEmptyPassword() {
//		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("emptyPassword"));
//	    
//	}
//	@Test (priority=7)
//	public void loginTestWithWrongUsernameEmptyPassword() {
//		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("emptyPassword"));
//	    
//	}
//	@Test (priority=7)
//	public void loginTestWithEmptyUsernameWrongPassword() {
//		dashboardPage = loginPage.login(prop.getProperty("emptyUsername"), prop.getProperty("wrongPassword"));
//	    
//	}

	
	@AfterMethod()
	public void tearDown() {
	driver.quit();
	}
	
	}

