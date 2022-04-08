package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Iretry_concept {
	
	@Test(retryAnalyzer  =Retry_Class.class)
	private void username() {
		String expected_username= "Radhi";
		String actual_username= " radhi123 ";
		
		
		Assert.assertEquals(actual_username, expected_username);
		
	}

}