package com.employeeapi.base;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class Framework1 extends TestBase{
	@BeforeClass
	public void basic() {
		logger.info("*****Framework test started*****");
		RestAssured.baseURI="https://weatherdbi.herokuapp.com/data/weather";
		 httprequest=RestAssured.given();
		 response=httprequest.request(Method.GET,"/New York");
	}
	@Test
	 void statuscode(){
		
		logger.info("****Validadte statuscode****");
		int statusCode=response.getStatusCode();
		System.out.println("statuscode is " +statusCode);
		logger.info("StatusCode==>"+statusCode);
		Assert.assertEquals(statusCode, 200);	
	}
	
	
	@Test
	void statusline(){
		
		logger.info("*****Check statusline*****");
		String statusLine=response.getStatusLine();
		logger.info("statusline==>"+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");	
	}
	@AfterClass
	void teardown() {
		
		
		logger.info("Framework test completed");
	}
	
	

}
