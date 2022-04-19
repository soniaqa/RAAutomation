package com.employeeapi.base;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setup() 
	{
		//start Reports
	    htmlReporter=new ExtentHtmlReporter("extent.html");
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);	
	}
	
	@Test
	public void test1() throws IOException
	{
	
	ExtentTest test=extent.createTest("MyFirstTest","sample description");
	
	test.log(Status.INFO,"This test shows usage of logs(status,details)");
	
	test.info("It shows usage of info(details");
	
	test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	
	test.addScreenCaptureFromPath("screenshot.png");	

    }
	
	@Test
	public void test2() throws IOException
	{
	
	ExtentTest test=extent.createTest("MyFirstTest","sample description");
	
	test.log(Status.INFO,"This test shows usage of logs(status,details)");
	
	test.info("It shows usage of info(details");
	
	test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	
	test.addScreenCaptureFromPath("screenshot.png");
	}

   
	@AfterSuite
	public void tearDown() 
	{
		extent.flush();
	}
}
