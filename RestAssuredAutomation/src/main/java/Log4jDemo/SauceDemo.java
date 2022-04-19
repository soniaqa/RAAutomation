package Log4jDemo;




import org.apache.logging.log4j.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	
	private static Logger logger=  LogManager.getLogger(SauceDemo.class.getName());
	
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		 
		logger.info("Browser Opened");
		driver.get("https://www.saucedemo.com/");
		
		
		logger.info("Entered Username");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		logger.info("Entered Password");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		logger.info("Clicked on Login Button");
		driver.findElement(By.name("login-button")).click();
		
		logger.info("Got The Title Of The Page");
		String title=driver.getTitle();
		System.out.println("Tilte is: " + title);
		
		logger.info("Browser is closed");
		driver.quit();		
		
	}
	

}
