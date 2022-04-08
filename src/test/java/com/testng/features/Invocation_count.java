package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_count {
	
	
	@Test(priority = -2)
	private void browser_launch() {
	System.out.println("Browser Launch");
	}

	@Test(priority = -1)
	private void url_launch() {
		System.out.println("URL Launch");
	}
	
	@Test(priority = 2)
	private void logincredentials() {
		System.out.println("credentials");

	}
	
	@Test(invocationCount = 3)
	private void refresh() {
		System.out.println("Refresh");

	}
}
