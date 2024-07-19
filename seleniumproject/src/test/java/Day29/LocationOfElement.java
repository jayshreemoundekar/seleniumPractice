package Day29;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.className("orangehrm-login-branding"));
		
		System.out.println(logo.getLocation());
		driver.manage().window().minimize();
		
		System.out.println(logo.getLocation());
		driver.manage().window().fullscreen();
		System.out.println(logo.getLocation());
		
		Point p = new Point(100,100);
		System.out.println(p.getLocation());
		
	}

}
