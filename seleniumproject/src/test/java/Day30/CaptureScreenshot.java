package Day30;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://demo.nopcommerce.com/");
				driver.manage().window().maximize();
				
				//capture full page screenshot-selenium 3& 4
				TakesScreenshot ts=(TakesScreenshot)driver;
				/*File src=ts.getScreenshotAs(OutputType.FILE);
				File trg= new File("C:\\Users\\JAYSHREE\\eclipse-workspace\\seleniumproject\\src\\test\\java\\Screenshot.png");
				FileUtils.copyFile(src, trg);*/
				
				//capture screenshot of specific area from webpage--selenium4+
				WebElement featuredproduct=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
				File src=featuredproduct.getScreenshotAs(OutputType.FILE);
				File trg=new File("C:\\Users\\JAYSHREE\\eclipse-workspace\\seleniumproject\\src\\test\\java\\Screenshot.png");
				FileUtils.copyFile(src, trg);
	}

}
