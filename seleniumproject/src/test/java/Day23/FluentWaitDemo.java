package Day23;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//fluent wait
		/* Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(10))
			       .ignoring(NoSuchElementException.class);	*/
		
		FluentWait<WebDriver> mywait =new FluentWait<WebDriver>(driver);
		mywait.withTimeout(Duration.ofSeconds(50));
		mywait.pollingEvery(Duration.ofSeconds(15));
		mywait.ignoring(NoSuchElementException.class);
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		/* WebElement username = (WebElement) mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) 
		     {
		       return driver.findElement(By.cssSelector("input[placeholder='Username']"));
		     }
		   }
		 );*/
		WebElement username =(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Username']")));
		//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		
username.sendKeys("Admin");

	}

}
