package Day26;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.cssSelector(".wikipedia-search-button")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> searchlinks= driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
		System.out.println(searchlinks.size());
		
		//printing and clicking links
		System.out.println("Printing and clicking the links........");
		for(WebElement links:searchlinks)
		{
			System.out.println(links.getText());
			links.click();
		}
		
		//opening all the pages capture window
		
		Set <String> windowIDs=driver.getWindowHandles();
		
		//switching each browser and getting the title
		System.out.println("switching each browser and getting the title");
		
		for(String windID:windowIDs)
		{
			System.out.println(driver.switchTo().window(windID).getTitle());
			
			
		}
		
		//driver.quit();
		

}
}
