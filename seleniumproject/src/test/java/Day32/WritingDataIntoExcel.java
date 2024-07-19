package Day32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx"); 
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		//Creating  rows, cells and update data without loop
		/*XSSFRow row1=sheet.createRow(0);
		
		sheet.createRow(0).createCell(1).setCellValue("Welcome");
		
		sheet.createRow(0).createCell(2).setCellValue("12345");
		sheet.createRow(0).createCell(3).setCellValue("abcd");
		
		XSSFRow row2=sheet.createRow(1);
		
		sheet.createRow(1).createCell(1).setCellValue("Testing");
		sheet.createRow(1).createCell(2).setCellValue("xyz");
		sheet.createRow(1).createCell(3).setCellValue("abcdfhfsf");*/
		
		//Creating rows, cells and update with using loop
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<=5;r++)
		{
			
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<3;c++)
			{
				//currentrow.createCell(c).setCellValue("Welcome");
				System.out.println("Enter a value");
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
			}
		}
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done!!!");
	}

}
