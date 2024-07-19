import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement textbox=driver.findElement(By.id("APjFqb"));
		textbox.sendKeys("Automation step by step");
		List 	<WebElement> listOfInputElements = driver.findElements(By.xpath(null));
		int count =listOfInputElements.size();
		System.out.println("count of input element"+count);
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		
	}

}
