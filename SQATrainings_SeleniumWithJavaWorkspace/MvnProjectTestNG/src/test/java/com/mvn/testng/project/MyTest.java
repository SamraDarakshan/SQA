package com.mvn.testng.project;

	import org.testng.annotations.Test;
	import org.testng.annotations.DataProvider;

	public class MyTest {

	    @Test(dataProvider = "dp")
	    public void testMethod(String data) {
	        System.out.println("Test method running with data: " + data + " on thread " + Thread.currentThread().getId());
	    }

	    @DataProvider(parallel = true)
	    public Object[][] dp() {
	        return new Object[][] {{"Data1"}, {"Data2"}, {"Data3"}, {"Data4"}};
	    }
	}


