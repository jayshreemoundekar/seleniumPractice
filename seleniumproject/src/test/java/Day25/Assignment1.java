package Day25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.bing.com/");
				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("#sb_form_q")).sendKeys("java");
				List <WebElement> suggestions=driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]"));
				System.out.println(suggestions.size());
				
				for(int i=0;i<suggestions.size();i++)
				{
					if(suggestions.get(i).getText().equals("JavaScript"))
					{
						suggestions.get(i).click();
						break;
					}
					
					
				}
				
				
				

	}

}
