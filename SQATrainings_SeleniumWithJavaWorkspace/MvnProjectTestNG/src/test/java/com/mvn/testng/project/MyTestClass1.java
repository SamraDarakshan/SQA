package com.mvn.testng.project;



	import org.testng.annotations.Test;

	public class MyTestClass1 {

	    @Test
	    public void testMethod1() throws InterruptedException {
	        System.out.println("Test Method 1 - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(2000); // Simulate a delay of 2 seconds
	    }

	    @Test
	    public void testMethod2() throws InterruptedException {
	        System.out.println("Test Method 2 - Thread ID: " + Thread.currentThread().getId());
	        Thread.sleep(2000); // Simulate a delay of 2 seconds
	    }
	}



