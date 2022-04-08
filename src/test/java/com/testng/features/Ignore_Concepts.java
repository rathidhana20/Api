package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concepts {

	@Test(enabled = true)
	private void books() {
	  System.out.println("Books");

	}
	
	@Test
	private void Whatsup() {
	System.out.println("Whatsup");
	}
	
	
	@Test(priority = 2)
	private void instagram() {
		System.out.println("Instagram");

	}
	
	@Test
	private void spotify() {
		System.out.println("Music");
	}
	
	@Test
	private void wynkmusic() {
		System.out.println("Wynkmusic");

	}
}
