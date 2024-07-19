package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//Approach-1
		//driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("06/04/1996");
		
		
		//Approach-2
		
		
		String year = "2025";
		String month= "June";
		String date="4";
		driver.findElement(By.cssSelector("input[id='datepicker']")).click();
		
		//select month and year
		while(true)
		{
			String mon=driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			else
			{
				driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
			}
		}
		//Select Dates
		List <WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		/*for(int i=0;i<allDates.size();i++)
		{
			if(allDates.get(i).equals(date))
			{
				allDates.get(i).click();
				break;
			}
		}*/
	}

}
