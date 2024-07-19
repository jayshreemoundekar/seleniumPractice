package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame1);
		
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Welcome to Automation");
		
		driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"A");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("button[title='Bold']")).click();
	}

}
