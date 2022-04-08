package com.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_ValidationAPI {
	@Test
	public void data_validation() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/users/2");
		String string = response.asString();
		System.out.println(string);

		int actualresult = response.statusCode();
		Assert.assertEquals(200, actualresult);
		System.out.println("Data Validation");
		

	}

}
