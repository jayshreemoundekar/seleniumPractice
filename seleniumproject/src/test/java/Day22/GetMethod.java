package Day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {
	public static void main (String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Title of Page" + driver.getTitle());
		System.out.println("Current url"+driver.getCurrentUrl());
		/*System.out.println("Page source.......");
		String ps=driver.getPageSource();
		System.out.println(ps);
		System.out.println(ps.contains("html"));*/
		
		//String ps=driver.getWindowHandle();
		
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowsids=driver.getWindowHandles();
		for(String winid:windowsids	)
		{
			  System.out.println(winid);
		}
		
		
		
		
		
	}

}
