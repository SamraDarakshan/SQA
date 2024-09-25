package com.junit.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTesting {

	public JunitTesting() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setup() {
		//open browser
		//hit url
	}
	
	@Test
	public void loginTest(){
		//Login with valid credentials
	}
	@Test
	public void loginTestInvalid(){
		//Login with valid credentials
	}
	@Test
	public void emptyTest(){
		//Login with empty
	}
	
	@After
	public void tearDown() {
		//close browser
	}
	

}
