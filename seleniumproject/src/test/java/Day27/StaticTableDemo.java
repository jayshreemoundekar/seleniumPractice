package Day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();

		// find total number of rows
		//Approach 1
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println(rows.size());
		
		//Approach 2
		
		/*List <WebElement> row =driver.findElements(By.tagName("tr"));
		System.out.println("Number of rows"+row.size());*/
		
		// total number of coloumns
		
		List <WebElement> colomn=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		System.out.println("Total number of colomns"+colomn.size());
		
		//driver.findElements(by.)
		// read specific row and colomn data
		String value =driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[3]")).getText();
		System.out.println(value);
		// read data from all rows and colomns
		
	for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=colomn;c++)
		{
			String value1=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print(value1+"\t");
			
			
		}
		System.out.println();
	}
		// print books name having author name amit
	
	for(int r=2;r<=rows;r++)
	{
		String author = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[2]")).getText();
		if( author.equals("Amit"))
		
		{
			String bookname=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[\"+r+\"]/td[1]")).getText();
			System.out.println(author+"    "+bookname);
			
		}
		
	}
		// find sum of prices for all books
		int sum=0;
		for(int r=2; r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[\"+r\"]/td[4]")).getText();
			sum=sum+ Integer.parseInt(price);
		}
		System.out.println("Total price of books "+ sum);
		
			
		

		
	}
})
