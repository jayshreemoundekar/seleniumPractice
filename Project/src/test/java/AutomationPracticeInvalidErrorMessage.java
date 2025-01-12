import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeInvalidErrorMessage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("jayshree.moundekar@gmail.com");
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("@Ja9503503657");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		WebElement errormessage=driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
		System.out.println(errormessage.getText());
		
		
		

	}

}
