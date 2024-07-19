import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoDaddy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		String pagesource= driver.getPageSource();
		System.out.println(driver.getPageSource());
		
		pagesource.contains(title);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/section[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/button[1]/span[1]")).click();		
		driver.findElement(By.cssSelector("a[data-track-name='domains_search_for_domain_names3']")).click();
		driver.findElement(By.cssSelector("input[name='searchText']")).sendKeys("Biology");
		
		driver.findElement(By.cssSelector("button[aria-label='Search for a domain']")).click();
	}

}
