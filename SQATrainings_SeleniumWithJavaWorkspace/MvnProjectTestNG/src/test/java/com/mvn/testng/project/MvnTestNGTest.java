package com.mvn.testng.project;

import org.junit.runners.Parameterized.BeforeParam;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MvnTestNGTest {


		// TODO Auto-generated constructor stub
	
	//if user register hojae tou chale agr wo na chale tou ye b na chalen it is dependent on that method
	@Test(priority=2 ,dependsOnMethods="userRegistration")
	// prority agr na lage tou alphabatical mein chlta h 
	public void login() {
		System.out.println("Login to the application");
	}
	
	@Test (priority=1)
	public void userRegistration() {
		//forecefully fail
		//Assert.fail("User not Registered succesfully!!");
		System.out.println("user registration");
	}
	@BeforeTest(alwaysRun = true)
	public void createDbConnec() {
		System.out.println("create db connection");
	}
	
	@AfterTest
	public void closeDb() {
		System.out.println("close db connection");
	}
	
	@BeforeMethod(enabled=false)
	public void launchBrowser() {
		System.out.println("launch browser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@BeforeSuite
	public void beforeSuite() {
	    // Code to run before the suite starts
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
	    // Code to run after the suite ends
		System.out.println("After Suite");
	}
	@BeforeGroups("login")
	public void beforegroups() {
	    // Code to run after the suite ends
		System.out.println("before groups");
	}
	@AfterGroups("login")
	public void aftergroups() {
	    // Code to run after the suite ends
		System.out.println("after groups");
	}
	@BeforeParam
	public void beforeparam() {
	    // Code to run after the suite ends
		System.out.println("before param");
	}
	@BeforeClass
	public void setUp() {
	    // Setup code before class tests
		System.out.println("before class setup");
	}

	@AfterClass
	public void tearDown() {
	    // Cleanup code after class tests
		System.out.println("after class teardown");
	}
	
	//TestNG allows grouping of test methods, so you can selectively run tests by specifying groups in the @Test annotation and testng.xml.
	@Test(groups = {"login", "userRegistration"})
	public void loginTest() {
	    // Test code
		System.out.println("login test of grouping");
	}

	 @Test(invocationCount = 3)
	    public void repeatTest() {
	        System.out.println("This test will run 3 times");
	    }

	    @Test(timeOut = 2000) // 2 seconds
	    public void timeSensitiveTest() throws InterruptedException {
	        Thread.sleep(1000); // Simulating test delay of 1 second
	        System.out.println("Time-sensitive test passed");
	    }
	    @Test(enabled = true)
	    public void activeTest() {
	        System.out.println("Active Test");
	    }

	    @Test(enabled = false)
	    public void skippedTest() {
	        System.out.println("This test will be skipped");
	    }
	    
	    
	    /*
	     * Defines the order in which test methods are executed. Test methods with lower priority values are executed first.
Default priority is 0 if not specified, and tests without priority might run in a random order.
	     */

	
}
