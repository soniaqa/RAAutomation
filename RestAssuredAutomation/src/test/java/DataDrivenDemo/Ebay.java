package DataDrivenDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {
	
public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String message=driver.getTitle();
		System.out.println("The title is: " +message);
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		WebElement apple=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[4]/a"));
		
		action.click(apple).perform();
		
		String title=driver.getTitle();
		System.out.println("Title is: " + title);
		
		driver.close();
}
}
