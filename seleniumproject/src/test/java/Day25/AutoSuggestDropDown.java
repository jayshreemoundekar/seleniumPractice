package Day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		List <WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]/span"));
		System.out.println("Number of Suggestions"+list.size());
		for(int i=0;i<list.size();i++)
			
		{
			System.out.println(list.get(i).getText());
			
		}
		
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			if(text.equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}
		}
		
		


	}

}
