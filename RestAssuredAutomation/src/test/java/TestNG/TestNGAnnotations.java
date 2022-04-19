package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeTest
	public void started()
	{
		System.out.println("Run this before test");
	}

	@Test
	public void test1() 
	{
		System.out.println("This is test1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("This is test 2");
	}
	
	@AfterTest
	public void completed()
	{
		System.out.println("Run this after test");
	}
}
