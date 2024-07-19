package Day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\Data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("sheet1");

		// workbook.getSheetAt(0);
		int totalrow = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows" + totalrow);
		System.out.println("Number of cells" + totalcells);
		
		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				//XSSFCell cell=currentRow.getCell(c);
				//String value=cell.toString();
				String value=currentRow.getCell(c).toString();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
