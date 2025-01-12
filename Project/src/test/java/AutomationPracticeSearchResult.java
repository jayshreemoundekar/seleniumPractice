import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSearchResult {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.automationexercise.com/");

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='/products']")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
		driver.findElement(By.cssSelector("a[href='/category_products/1']")).click();
		driver.findElement(By.cssSelector("a[href='/product_details/3']")).click();

		Thread.sleep(3000);

		WebElement product = driver.findElement(By.xpath("//div[@class='product-information']/h2"));
		String productNameText = product.getText().trim();

		System.out.println(productNameText);

		driver.findElement(By.cssSelector("a[href='/products']")).click();
		driver.findElement(By.id("search_product")).sendKeys("Sleeveless Dress");
		driver.findElement(By.cssSelector(".fa.fa-search")).click();

		Thread.sleep(3000);

		WebElement searchResultProductName = driver
				.findElement(By.xpath("//div[@class='productinfo text-center']//p[1]"));
		String searchResultText = searchResultProductName.getText().trim();

		System.out.println(searchResultText);

		if (product.equals(searchResultText)) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}

		driver.quit();

	}

}
