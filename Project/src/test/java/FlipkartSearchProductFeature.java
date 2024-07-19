import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSearchProductFeature {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		Actions action = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement fashion = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Fashion')]")));

		action.moveToElement(fashion).perform();

		WebElement women = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Women Footwear']")));

		action.moveToElement(women).click().perform();

		Thread.sleep(5000);

	
		WebElement footwear= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='_53J4C-'])[2]"))); 
		//driver.findElement(By.xpath("(//img[@class='_53J4C-'])[2]")).click();
		footwear.click();
		
		
        Thread.sleep(2000);

        // Locate and print the product details
        //WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".VU-ZEz")));
        
        //System.out.println(product.getText());

        // Close the driver
        
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[title='Search for products, brands and more']")));
        searchBox.sendKeys("Footup Women's Comfortable Stylish and Trending Colorful Printed Slippers Women Slippers  (Multicolor , 5)");
        
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
        searchButton.click();
        
        
	        
				
		
		
		
	
	}
}
