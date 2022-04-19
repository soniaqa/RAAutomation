package DataDrivenDemo;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;



public class ReadingDataFromExcelFile {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\praka\\Downloads\\EmployeeData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();
		//System.out.println(rowcount);
		int colcount = sheet.getRow(0).getLastCellNum();
		//System.out.println(colcount);
		for (int i = 0; i < rowcount; i++) {
			XSSFRow currentrow = sheet.getRow(i);

			for (int j = 0; j < colcount; j++) {
				String value = currentrow.getCell(j).toString();
				System.out.print("  " + value);
			}
			System.out.println();
		}

	}

}
