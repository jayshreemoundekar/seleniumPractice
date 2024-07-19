import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.inmotionhosting.com/");
        
        driver.findElement(By.xpath("//a[@aria-label='Login']")).click();
        
        driver.findElement(By.id("username")).sendKeys("jayashree.moundekar@gmail.com");
        driver.findElement(By.id("password")).sendKeys("@Ja9503503657");
        
        
        driver.findElement(By.xpath("//div[@class='g-recaptcha']")).click();
        driver.findElement(By.cssSelector("#login-submit")).click();
        

	}

}
