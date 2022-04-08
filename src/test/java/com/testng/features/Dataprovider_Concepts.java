package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concepts {

	
	
	@Test(dataProvider = "test_data")
	private void automation_runner(String username, String password) {
		System.out.println("username:" +username);

		System.out.println("password:" +password);
		
	}
	
	
	@DataProvider
	private Object[][] test_data() {
		
		
		
		 return new Object[][]
				 {
			 
			 {"radhi","12345"},
			 {"dhanam","123"},
			 {"moni", "456"}
				 
			 
				 	 };
				 
	}}
	

