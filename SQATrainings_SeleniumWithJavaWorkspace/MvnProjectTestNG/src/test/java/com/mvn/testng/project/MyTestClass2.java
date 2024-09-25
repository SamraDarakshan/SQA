package com.mvn.testng.project;


	import org.testng.annotations.Test;

	public class MyTestClass2 {

	    @Test
	    public void testMethod3() throws InterruptedException {
	        System.out.println("Test Method 3 - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(2000); // Simulate a delay of 2 seconds
	    }

	    @Test
	    public void testMethod4() throws InterruptedException {
	        System.out.println("Test Method 4 - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(2000); // Simulate a delay of 2 seconds
	    }
	}


