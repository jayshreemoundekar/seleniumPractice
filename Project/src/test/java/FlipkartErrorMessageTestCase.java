import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartErrorMessageTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector(".H6-NpN._3N4_BX")).click();

		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		login.click();
		Actions a = new Actions(driver);
		a.moveToElement(login);
		
		driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']")).sendKeys("nfjhfufheuihssjn");
		driver.findElement(By.cssSelector(".QqFHMw.twnTnD._7Pd1Fp")).click();
		WebElement errorMessage = driver.findElement(By.xpath("//span[@class='llBOFA']/span"));
		System.out.println(errorMessage.getText());
		
		

	}

}
