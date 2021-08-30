package com.example.demo.student;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Mytest {
	@Test
	public void getItems() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/getdata").then().statusCode(200).log().body();
		System.out.println("ok");
	}
}
