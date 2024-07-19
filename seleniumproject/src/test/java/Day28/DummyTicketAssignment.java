package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyTicketAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("product_550")).click();
		driver.findElement(By.id("travname")).sendKeys("Jayshree");
		driver.findElement(By.id("travlastname")).sendKeys("Moundekar");
		driver.findElement(By.cssSelector("#order_comments")).sendKeys("Testing");
		
		WebElement dobDatePicker=driver.findElement(By.name("dob"));
		//selectDate(driver, dobDatePicker,"4","Jun","1996"); 
		//driver.findElement(By.className("ui-datepicker-month")).sendKeys("June");
		//driver.findElement(By.className("ui-datepicker-year")).sendKeys("1996");
		
		
		driver.findElement(By.id("sex_2")).click();
		driver.findElement(By.id("traveltype_2")).click();
		
		driver.findElement(By.id("fromcity")).sendKeys("Nagpur");
		driver.findElement(By.id("tocity")).sendKeys("New Delhi");
		
		driver.findElement(By.name("departon")).click();
		
		WebElement depDateDatePicker=driver.findElement(By.xpath("//input[@id='departon']"));
		selectDate(driver, depDateDatePicker, "30","Oct","2022");   //Departure date  DD/MM/YYYY
		
		WebElement returnDateDatePicker=driver.findElement(By.xpath("//input[@id='returndate']"));
		selectDate(driver, returnDateDatePicker, "15","Nov","2022"); //return date  DD/MM/YYYY
		
		driver.findElement(By.name("notes")).sendKeys("testing");
		
		
		
		
		//Delivery option
		
		
		driver.findElement(By.id("select2-reasondummy-container")).click();
		
		driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("Visa extension"+Keys.ENTER);
		
		driver.findElement(By.name("deliverymethod")).click();
		
		//Billing details
		
		driver.findElement(By.id("billname")).sendKeys("Jayshree");
		driver.findElement(By.name("billing_phone")).sendKeys("9561371562");
		driver.findElement(By.id("billing_email")).sendKeys("jayashree.moundekar@gmail.com");
		
		driver.findElement(By.id("select2-billing_country-container")).click();
		
		driver.findElement(By.className(".select2-search__field")).sendKeys("India"+Keys.ENTER);
		
		driver.findElement(By.name("billing_address_1")).sendKeys("458, New Nandanvan, Nagpur");
		
		driver.findElement(By.name("billing_city")).sendKeys("Nagpur");
		
		driver.findElement(By.className("select2-search__field")).sendKeys("Maharashtra"+Keys.ENTER);
		driver.findElement(By.id("billing_postcode")).sendKeys("440009");
		driver.findElement(By.name("woocommerce_checkout_place_order")).click();  //place order
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Payment Page"))
		{
			 System.out.println("Test Passed");
		}
		
		else
		{
			 System.out.println("failed");
		}
		//driver.findElement(by.)
		driver.quit();
	}

	 static void selectDate(WebDriver driver, WebElement datePicker, String date, String month, String year) {
		datePicker.click();
		Select drp= new Select(driver.findElement(By.className("ui-datepicker-month")));
		drp.selectByVisibleText(month);
		
		drp=new Select (driver.findElement(By.cssSelector(".ui-datepicker-year"))); 
		drp.selectByVisibleText(year);

		List <WebElement> dates= driver.findElements(By.xpath("//table=[@class='ui-datepicker-calendar']/tr/td"));
		
		for(WebElement dt:dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		
	}

}
