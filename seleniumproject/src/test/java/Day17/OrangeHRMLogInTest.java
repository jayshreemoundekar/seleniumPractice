package Day17;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogInTest {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		// 1) launch browser

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(7000);

		// verify the title of
		/*
		 * String act_title = driver.getTitle(); 
		 * String exp_title = "OrangeHRM";
		 * 
		 * if (act_title.equals(exp_title)) { System.out.println("Test Passed"); } else
		 * { System.out.println("Failed"); }
		 */
		String act_label = null;

		try {
			act_label = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6"))
					.getText();

		} catch (NoSuchElementException e) {
			
			//act_label="";

		}

		String exp_label = "Dashboard";

		if (act_label.equals(exp_label)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}

		// driver.quit();

	}

}
