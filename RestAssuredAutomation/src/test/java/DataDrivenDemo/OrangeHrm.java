package DataDrivenDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class OrangeHrm {
	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	WebElement element=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	
	AShot ashot=new AShot();
	
	Screenshot logoelement=ashot.takeScreenshot(driver, element);
	
	ImageIO.write(logoelement.getImage(),"png",new File("C:\\Users\\praka\\OneDrive\\Documents\\SoftwareTesting\\OrangeHRMlogo.png"));

	File f =new File("C:\\Users\\praka\\OneDrive\\Documents\\SoftwareTesting\\OrangeHRMlogo.png");
	
	if(f.exists())
	{
		System.out.println("Image is captured");
	}
	else
	{
		System.out.println("Image is not captured");	
	}
}
}
