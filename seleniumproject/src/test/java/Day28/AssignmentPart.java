package Day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blazedemo.com/purchase.php");
		driver.findElement(By.cssSelector("#inputName")).sendKeys("Jayshree Moundekar");
		driver.findElement(By.cssSelector("#address")).sendKeys("458, New Nandanvan, Nagpur");
		driver.findElement(By.cssSelector("#city")).sendKeys("Nagpur");
		driver.findElement(By.cssSelector("#state")).sendKeys("Maharashtra");
		
		driver.findElement(By.cssSelector("#zipCode")).sendKeys("440009");
		driver.findElement(By.cssSelector("#cardType")).sendKeys("American Express");
		
		driver.findElement(By.cssSelector("#creditCardNumber")).sendKeys("1234556566");
		driver.findElement(By.cssSelector("#creditCardMonth")).clear();
		driver.findElement(By.cssSelector("#creditCardMonth")).sendKeys("12");
		driver.findElement(By.cssSelector("#creditCardYear")).clear();
		driver.findElement(By.cssSelector("#creditCardYear")).sendKeys("08");
		
		driver.findElement(By.cssSelector("#nameOnCard")).sendKeys("JayshreeM");
		driver.findElement(By.cssSelector("#rememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
		String response=driver.findElement(By.xpath("//div[@class='container hero-unit']/h1")).getText();
		if(response.contains("Thank you for your purchase today!"))
			{
				System.out.println("Test Passed");
			}
	
		else
			{System.out.println("Test Failed");
			}
			
	}

}
