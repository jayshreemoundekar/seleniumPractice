package Day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles(); //store 2 window ids		
		List <String> windowidsList= new ArrayList(windowIDs); //converted set to list
		String parentwindowID=windowidsList.get(0);		
		String childwindowID=windowidsList.get(1);
		
		//switch to child window
		
		driver.switchTo().window(childwindowID);
		driver.findElement(By.linkText("Contact Sales")).click();
		
		//switch to parent window
		driver.switchTo().window(parentwindowID);
		
		driver.findElement(By.cssSelector(".oxd-input.oxd-input--active")).sendKeys("Admin");
		
		//Approach 2
		
		/*for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				driver.findElement(By.linkText("Contact Sales")).click();			}
			
		}*/
		
		//Aproach 3
		
		/*for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("x") || title.equals("y") || title.equals("z"))
			{
				driver.close();			}
			
		}*/
		
		
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				driver.close();			}
			
		}
		
		

	}

}
