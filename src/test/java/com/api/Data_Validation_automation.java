package com.api;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class Data_Validation_automation extends Base_class_api
{
	
	@Test
	public void firsttvalidation() throws IOException {
		RestAssured.baseURI= Adactin_test_data(4, 1);
		RequestSpecification given = RestAssured.given();
		Response response = given.get("SearchHotel.php");
		String string = response.asString();
		//System.out.println(string);
        int actualcode = response.statusCode();
        System.out.println(actualcode);
        Assert.assertEquals(200,actualcode);
        //assertNotEquals(Adactin_test_data(4, 2),actualcode); 
        System.out.println("first validation successfully");
		
		}
	
	@Test
	public void secondvalidation() throws IOException {
		RestAssured.baseURI= Adactin_test_data(4, 1);
		RequestSpecification given = RestAssured.given();
		Response response = given.get("SelectHotel.php");
		String string = response.asString();
		//System.out.println(string);
        int actualcode = response.statusCode();
        System.out.println(actualcode);
        Assert.assertEquals(200,actualcode);
        //assertNotEquals(Adactin_test_data(4, 2),actualcode); 
        System.out.println("second validation successfully");

	}
	
	@Test
	public void thirdvalidation() throws IOException {
		RestAssured.baseURI= Adactin_test_data(4, 1);
		RequestSpecification given = RestAssured.given();
		Response response = given.get("BookHotel.php");
		String string = response.asString();
		//System.out.println(string);
        int actualcode = response.statusCode();
        System.out.println(actualcode);
        Assert.assertEquals(200,actualcode);
        //assertNotEquals(Adactin_test_data(4, 2),actualcode); 
        System.out.println("Third validation successfully");
	
}
	@Test
	public void fourthvalidation() throws IOException {
		RestAssured.baseURI= Adactin_test_data(4, 1);
		RequestSpecification given = RestAssured.given();
		Response response = given.get("BookingConfirm.php");
		String string = response.asString();
		//System.out.println(string);
        int actualcode = response.statusCode();
        System.out.println(actualcode);
        Assert.assertEquals(200,actualcode);
        //assertNotEquals(Adactin_test_data(4, 2),actualcode); 
        System.out.println("Fourth validation successfully");
		

	}


	@Test
	public void fifthvalidation() throws IOException {
		RestAssured.baseURI= Adactin_test_data(4, 1);
		RequestSpecification given = RestAssured.given();
		Response response = given.get("BookedItinerary.php");
		String string = response.asString();
		//System.out.println(string);
        int actualcode = response.statusCode();
        System.out.println(actualcode);
        Assert.assertEquals(200,actualcode);
        //assertNotEquals(Adactin_test_data(4, 2),actualcode); 
        System.out.println("Fifth validation successfully");
		

	}
	@Test
	public void sixthvalidation() throws IOException {
		RestAssured.baseURI= Adactin_test_data(4, 1);
		RequestSpecification given = RestAssured.given();
		Response response = given.get("Logout.php");
		String string = response.asString();
		//System.out.println(string);
        int actualcode = response.statusCode();
        System.out.println(actualcode);
        Assert.assertEquals(200,actualcode);
        //assertNotEquals(Adactin_test_data(4, 2),actualcode); 
        System.out.println("Sixth validation successfully");
        }
}


