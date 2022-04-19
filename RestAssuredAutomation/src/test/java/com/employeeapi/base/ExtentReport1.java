package com.employeeapi.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport1 {
	
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		 //WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		

		// Start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		// create ExtentReports and attach report(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// Create toggle for the given test.adds all log events under
		ExtentTest test1 = extent.createTest("Launch Web APP");



		test1.log(Status.INFO, "Starting the test case");
		driver.get("https://www.saucedemo.com/");
		test1.pass("Navigated to the saucedemo web app");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		test1.pass("sent the username");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		test1.pass("sent the password");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		test1.pass("clicked the login button");

		driver.close();
		test1.pass("closed the browser");

		test1.info("Test completed");

		extent.flush();

	}

}
