package DataDrivenDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculationDemo {
	
	public static void main(String[]args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\praka\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
	
		FileInputStream file=new FileInputStream("C:\\Users\\praka\\Downloads\\CalculationDemo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell principlecell=row.getCell(0);
			int princ=(int)principlecell.getNumericCellValue();
			
			XSSFCell roi=row.getCell(1);
			int rateofinterest=(int)roi.getNumericCellValue();
			
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			
			XSSFCell frequency=row.getCell(3);
			int freq=(int)frequency.getNumericCellValue();
			
			XSSFCell matvalue=row.getCell(4);
			int Exp_maturityvalue=(int)matvalue.getNumericCellValue();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
