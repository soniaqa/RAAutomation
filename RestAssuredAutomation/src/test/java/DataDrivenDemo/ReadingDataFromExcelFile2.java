package DataDrivenDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromExcelFile2 {
	
	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\Users\\praka\\Downloads\\Tourlocation.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		System.out.println("No.of records in the worksheet file " +rowcount);
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			
			String FIRSTNAME=currentrow.getCell(0).getStringCellValue();
			String LASTNAME=currentrow.getCell(1).getStringCellValue();
			int PHONE=(int)currentrow.getCell(2).getStringCellValue();
			String EMAIL=currentrow.getCell(3).getStringCellValue();
			String ADDRESS=currentrow.getCell(4).getStringCellValue();
			String CITY=currentrow.getCell(5).getStringCellValue();
			String STATE=currentrow.getCell(6).getStringCellValue();
			String POSTELCODE=currentrow.getCell(7).getStringCellValue();
			String COUNTRY=currentrow.getCell(8).getStringCellValue();
			String USERNAME=currentrow.getCell(9).getStringCellValue();
			String PASSWORD=currentrow.getCell(10).getStringCellValue();
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			driver.findElement(By.name("userName")).sendKeys("USERNAME");
			driver.findElement(By.name("password")).sendKeys("PASSWORD");
			driver.findElement(By.name("submit")).click();
			
			
			
			
			
		
			
			
			
			
		}
		
		workbook.close();
		
		
	}

}
