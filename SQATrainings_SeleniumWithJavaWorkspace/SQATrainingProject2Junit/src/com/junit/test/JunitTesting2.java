package com.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class JunitTesting2 {

	public JunitTesting2() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public static void setup() {
		//open browser
		//hit url
		System.out.println("Open the chrome browser");
	}
	
	@Test
	public void loginTest(){
		//Login with valid credentials
		System.out.println("Login with valid credentials");

	}
	@Test
	public void loginTestInvalid(){
		//Login with valid credentials
		System.out.println("Login with invalid credentials");
		Assume.assumeFalse(false);
	}
	@Ignore
	public void loginTestInvalidUsername(){
		//Login with valid credentials
		System.out.println("Login with invalid username");
		Assume.assumeFalse(false);
	}
	
	@RepeatedTest(value = 3)
	public void emptyTest(){
		//Login with empty
		System.out.println("Login with empty fields");
		Assume.assumeTrue("Please enter valid username & password", true);
	}
	
	@AfterClass
	public static void tearDown() {
		//close browser
		System.out.println("Close the browser");
	}
	

}

//@Before and @After bar bar chalegi har test k sth so we will use
//@BeforeClass @AfterClass