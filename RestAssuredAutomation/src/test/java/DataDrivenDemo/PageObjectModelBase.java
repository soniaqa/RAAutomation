package DataDrivenDemo;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObjectModelBase {
	
		@Test
		public void Firstpom()
		
		{
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		RegistrationPOM pom=new RegistrationPOM(driver);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		 
		
		pom.Register();
		pom.setFirstName("Sony");
		pom.setLastName("Niakash");
		pom.Phone("987645");
		pom.Email("rev@gmail.com");
		pom.Address("wikjfn");
		pom.City("NY");
		pom.State("Albany");
		pom.PostalCode("8764");
		pom.UserName("anbm");
		pom.Password("lakf");
		pom.ConfirmPassword("lakf");
		pom.Submit();
		
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Your Resgistration Is Successful-TEST PASSED");
		}
		else
		{
			System.out.println("Your Resgistration Is Not Successful-TEST FAILED");	
				
		}
		
		driver.close();
		
		
	}

}
