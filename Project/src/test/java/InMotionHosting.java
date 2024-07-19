import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InMotionHosting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.inmotionhosting.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='nav-item btn-login-container ']/a")).click();
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		
	
		driver.findElement(By.xpath("//div[@class='g-recaptcha']")).click();
		
		WebElement loginSubmitButton= wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		//driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		
		
		
		
	}

}
