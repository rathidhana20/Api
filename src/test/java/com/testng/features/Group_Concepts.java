package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Group_Concepts {
	
	@Test(priority = 1)
	private void Books() {
	  System.out.println("Books");

	}
	
	
	@Test(priority = -1,   groups = "Icecream")
	private void Venilla() {
	System.out.println("Venilla");
	}
	
	
	@Test(priority = 1,   groups = "Icecream")
	private void butterScotch() {
		System.out.println("ButterScotch");

	}
	
	@Test(priority = 2, groups= "Chocolates")
	private void dairymilk() {
		System.out.println("dairymilk");
	}
	
	@Test(groups = "Chocolates")
	private void eclairs() {
		System.out.println("Eclairs");

	}


	@Test(priority = 2,     groups = "Chocolates")
	
	private void bournville() {
	    System.out.println("Bournville");
	}
}
