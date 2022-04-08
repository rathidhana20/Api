package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	@Test
	private void username() {
		String expected_username= "Radhi";
		String actual_username= " radhi123 ";
		//Assert.assertEquals(actual_username, expected_username);
		
		//Assert.assertNotEquals(actual_username, expected_username);
		//Assert.assertSame(actual_username, expected_username);
		//Assert.assertNull(actual_username);
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_username, expected_username);
		System.out.println("Assert Verification");
		
	}

	
}
