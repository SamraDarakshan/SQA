package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AboutPage;
import com.crm.qa.pages.AdminPage;
import com.crm.qa.pages.DashoboardPage;
import com.crm.qa.pages.LeavePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DashboardPageTest extends TestBase {
	LoginPage loginPage;
	DashoboardPage dashboardPage;
	AboutPage aboutPage;
	AdminPage adminPage;
	LeavePage leavePage;
	TestUtil testUtil;
	
	
	public DashboardPageTest () {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		 testUtil = new TestUtil();
		 loginPage = new LoginPage();
		 dashboardPage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyDashboardPageTitleTest() {
		String dashboardPageTitle=dashboardPage.verifyDashboardPageTitle();
		Assert.assertEquals(dashboardPageTitle, "OrangeHRM", "Dashboard title is not matched");
	}
	
	@Test(priority=2)
	public void varifyeUserLabelTest() {
		Assert.assertTrue(dashboardPage.varifyeUserLabel());
		
	}
	
	@Test(priority=3)
	
	public void clickAboutTest() {
		//aboutPage = dashboardPage.clickAbout();
		dashboardPage.clickAbout();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals(title1, "About", "About not found");
	
	}
	@Test(priority=4)
	public void clickAdminTest() {
		adminPage = dashboardPage.clickAdmin();
	}
	@Test(priority=5)
	public void  clickLeaveListTest() {
		testUtil.switchToFrame();
		leavePage = dashboardPage.clickLeaveList();		
	}
	
	@AfterMethod()
	public void tearDown() {
	driver.quit();
	}
	
	

}
