import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("@Ja9503503657");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();

	}

}
