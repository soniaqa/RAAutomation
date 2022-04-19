package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGGroups {
	@BeforeClass
	public void started()
	{
		System.out.println("Run this before class");
	}
	
	@AfterClass
	public void completed()
	{
		System.out.println("Run this after class");
		
	}
	
	
	@BeforeGroups(value={"regression","bvt"})
	public void groupstarted()
	{
		System.out.println("Run this before group");
	}
	
	
	@AfterGroups(value="regression")
	public void groupcompleted()
	{
		System.out.println("Run this after group");
	}
	
	@Test(groups="bvt")
	public void test1()
	{
		System.out.println("This is test1");
	}
	
	@Test(groups={"bvt,regression"})
	public void test2()
	{
		System.out.println("This is test1");
	}
	
	
	@Test(groups="regression")
	public void test3()
	{
		System.out.println("This is test1");
	}
	
	
	@Test(priority=1,groups=("regression"))
	public void test4()
	{
		System.out.println("This is test1");
	

}
}
