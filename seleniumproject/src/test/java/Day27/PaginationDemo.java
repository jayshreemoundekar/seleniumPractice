package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");

		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		Thread.sleep(3000);

		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}

		// Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='#collapse-5']")).click();
		driver.findElement(By.linkText("Customers")).click();

		String text = driver.findElement(By.cssSelector(".col-sm-6.text-end")).getText();
		text.substring(27, 30); // 552
		text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1);

		int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));

		System.out.println("Total number of pages" + total_pages);
		
		for(int p=1;p<=total_pages;p++)
			
		{
			if(total_pages > 1)
			{
				
				WebElement active_page =driver.findElement(By.xpath("(//ul[@class='pagination'])//li//*[text()=\"+p+\"]"));
				
				System.out.println("Active page is "+ active_page.getText());
				active_page.click();
				
				Thread.sleep(2000);
				
			}
		
			int no0frows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
		
			System.out.println("No of rows in active page:" + no0frows);
			for(int r=1;r<=no0frows;r++)
			{
				String customerName =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[2]")).getText();
				String customerEmail =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[\"+r+\"]/td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[\\\"+r+\\\"]/td[5]")).getText();
				System.out.println(customerName+"      "+customerEmail+"    "+status);
			
			
		}
		driver.quit();
		
	}
	

	}
}
