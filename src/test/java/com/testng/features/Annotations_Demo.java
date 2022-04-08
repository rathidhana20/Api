package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {

	
	@BeforeSuite
	private void systemset_property() {
		System.out.println("Systemset_property");

	}
	
	@BeforeTest
	private void browser_launch() {
		System.out.println("Browser_Launch");

	}
	
	@BeforeClass
	private void geturl() {
		System.out.println("url");

	}
	
	@BeforeMethod
	private void signin() {
		System.out.println("signin");
		
	}
	@Test
	private void women() {
		System.out.println("women");

	}
	
	
	@AfterMethod
	private void logout() {
	   System.out.println("logout");

	}
	
	
	@Test
	private void children() {
		System.out.println("children");

	}
	@AfterClass
	private void verify_homepage() {
		System.out.println("Assert");

	}
	
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete all cookies");

	}
	
	}

