package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutSelectTag {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[title='HTML, CSS']")).click();
		
		//ul[@class='multiselect-container dropdown-menu']/li
		List <WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
		
		//find total number of options.
		System.out.println("Total Number of options"+options.size());
		
		//print all options from dropdown
		/*for (int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("Java"))
			{
				options.get(i).click();
				
			}*/
		
		/*for(int i=0;i<options.size();i++)
		{
			String option=options.get(i).getText();
			if(options.equals("Java")|| options.equals("Python"))
			{
				options.get(i).click();
			}
		}*/
		
		for(WebElement option:options)
		{
			String text=option.getText();
			if(text.equals("Java") || text.equals("Python"))
			{
				option.click();
			}
		}
		}
	}


