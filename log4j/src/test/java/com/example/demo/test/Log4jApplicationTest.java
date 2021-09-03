package com.example.demo.test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import net.minidev.json.JSONObject;

public class Log4jApplicationTest {
	@Test
	public void contextLoads() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/sele").then().statusCode(200).log().body();
		System.out.println("ok");
	}

	@Test
	public void addTestProjectContacts() {
		RestAssured.baseURI = "http://localhost:8080";
		/* RestAssured.when().post("/value").then().statusCode(200).log().body(); */
		JSONObject r = new JSONObject();
		r.put("id", "1");
		r.put("name", "kalyan");
		r.put("age", "21");
		r.put("email", "chaitanya@gmail.com");
		System.out.println("r" + r);
		Response res = RestAssured.given().contentType(ContentType.JSON).header("Content-Type", "application/json")
				.body(r.toJSONString()).when().post("/value").then().extract().response();
		System.out.println("res==>" + res.asString());
		/*
		 * String result = ((ResponseBodyExtractionOptions)
		 * r).jsonPath().getString("sucess"); String samplepost = "Record successfully";
		 * System.out.println("result==>" + result); Assert.assertEquals(result,
		 * samplepost);
		 */
	}

	public static void getResponseTime() {
		RestAssured.baseURI = "http://localhost:8080";
		System.out.println(
				"time to finish" + RestAssured.given().get("/value").timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
	}
}
