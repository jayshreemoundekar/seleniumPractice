package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithHiddenOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		

		
		//dropdown
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();   //open the dropdown
		
		List <WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']/span"));
		
		for(WebElement option:options)
		{
			 System.out.println(option.getText());
			 
			if(option.getText().equals("HR Manager"))	
			{
				option.click();
				break;
			}
		}
		
	}

}
