package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_concept {
	
	@Test(timeOut = 6000)
	private void browse_execution() throws Throwable {
	     Thread.sleep(1000);
	     System.out.println("Browser Launch");

	     Thread.sleep(1000);
	     System.out.println("url launch");
	     
	     Thread.sleep(2000);
	     System.out.println("login details");
	     
	     Thread.sleep(1000);
	     
	}
	
	

}
