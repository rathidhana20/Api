package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_concepts {

	@Test
	private void earings() {
	 System.out.println("Earings");	

	}
	

	
	

	@Test(dependsOnMethods = "bangles")
	private void offer() {
		System.out.println("Offer");

	}

	@Test
	private void bangles() {
		System.out.println("Bangles");
}}
