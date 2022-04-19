package DataDrivenDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class LoginSauceDemo {
	
	public static void main (String[]args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		driver.findElement(By.name("login-button")).click();
		System.out.println("Login is successful");

	    List<WebElement> element = driver.findElements(By.xpath("//*[@class=\"inventory_list\"]/div"));
	    System.out.println("\n Total no of elements are " + " \n " + element);
	   
	    driver.close();
	

		
		
	}

}
