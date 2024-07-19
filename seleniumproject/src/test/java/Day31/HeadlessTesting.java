package Day31;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		// 1) launch browser

		//////////Chrome options//////
		//headless mode
		/*ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);*/
		
		//Approach 2 WDM
		/*ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();*/
		
		
		//////// Edge browser ///////
		//Approach-1
		/*EdgeOptions options = new EdgeOptions();
		options.setHeadless(true);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(options);*/
		
		//Approach-2
		
		EdgeOptions options = new EdgeOptions();
		options.setHeadless(true);
		WebDriver driver=WebDriverManager.edgedriver().capabilities(options).create();

		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

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
