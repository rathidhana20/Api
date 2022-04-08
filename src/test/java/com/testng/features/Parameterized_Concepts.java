package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concepts {

	@Test
	@Parameters({"Username", "password"})
	private void login_details(@Optional("dhanam")  String username, String password) {
		
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);

	}

	
	
	
	
	
}
