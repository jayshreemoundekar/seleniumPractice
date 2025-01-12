import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeBuyProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("jayashree.moundekar@gmail.com");
		driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("@Ja9503503657");
		driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
		
		driver.findElement(By.cssSelector("a[href='/products']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//i[@class='fa fa-plus'])[1]")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Tops']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/product_details/5']")).click();
		driver.findElement(By.cssSelector("#quantity")).click();
		
		driver.findElement(By.cssSelector("button[class='btn btn-default cart']")).click();
		Thread.sleep(2000);
		
		WebElement cartMessage=driver.findElement(By.xpath("//p[normalize-space()='Your product has been added to cart.']"));
		String cartSuccessMessage= cartMessage.getText();
		System.out.println(cartSuccessMessage);
		
		driver.findElement(By.xpath("//p[@class='text-center']/a")).click();
		
		driver.findElement(By.cssSelector(".btn.btn-default.check_out")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[href='/payment']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("name_on_card")).sendKeys("Jayshree Moundekar");
		driver.findElement(By.name("card_number")).sendKeys("424242424242");
		driver.findElement(By.name("cvc")).sendKeys("123");
		driver.findElement(By.name("expiry_month")).sendKeys("06");
		driver.findElement(By.name("expiry_year")).sendKeys("2026");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
		WebElement placeOrder=driver.findElement(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/p"));
		String placeOrderMessage=placeOrder.getText();
		System.out.println(placeOrderMessage);
		
		
		
		
		driver.close();

	}

}
