package com.mvn.testng.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MVNTestNGTest1 {

	public MVNTestNGTest1() {
		// TODO Auto-generated constructor stub
	}
	
@Test
	public void validateTitle() {
		
		String expected_title = "facebook";
		String actual_title = "facebook";
		
		Assert.assertEquals(actual_title, expected_title);
	}

}
