package com.studentapp.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class MyFirstTest extends TestBase {

	public void styles() {
		RestAssured.given().queryParam("", "").when().get("www.google.com").then();
		RestAssured.given().expect().when();

	}

	@Disabled
	@DisplayName("Getting all the student from the database")
	@Test
	void getAllStudent() {
//		RequestSpecification reqSpec = RestAssured.given();
//		Response response = reqSpec.get("http://localhost:8085/student/list");
//		response.prettyPrint();
//		ValidatableResponse validatableResponse = response.then();
//		validatableResponse.statusCode(200);
		
		RestAssured.given().when().get("/list").then().statusCode(200);
	}

	@DisplayName("PathParameter : Get the first student")
	@Test
	void getSingleCSStudent() {
				Response response = RestAssured.given().
							pathParam("id",2).
				            when().get("/{id}");
				response.prettyPrint();			              
	}
	
	
}
