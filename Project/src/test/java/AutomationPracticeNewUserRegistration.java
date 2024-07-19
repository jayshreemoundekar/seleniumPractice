import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeNewUserRegistration {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[4]")).click();

		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Jayshree Moundekar");
		driver.findElement(By.xpath("//form[@action='/signup']/input[3]")).sendKeys("akshay.dharmik6@gmail.com");
		driver.findElement(By.xpath("//form[@action='/signup']/button")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys("@Ja95035036");
		
		
		WebElement dropdownDay = driver.findElement(By.xpath("//select[@id='days']"));
		Select select = new Select(dropdownDay);
		select.selectByValue("4");

		WebElement dropdownMonth = driver.findElement(By.xpath("//div[@id='uniform-months']/select"));
		Select select1 = new Select(dropdownMonth);
		select1.selectByVisibleText("June");
		
		//dropdown for years
		WebElement dropdownYear = driver.findElement(By.id("years"));
		Select select2= new Select(dropdownYear);
		select2.selectByValue("1996");
		
		Thread.sleep(2000);
		WebElement newsletterCheckbox = driver.findElement(By.id("newsletter"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newsletterCheckbox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newsletterCheckbox);

        WebElement optinCheckbox = driver.findElement(By.id("optin"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optinCheckbox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", optinCheckbox);
		
		/*driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();*/
		
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Jayshree");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Moundekar");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("458, New Nandanvan, Nagpur");
		
		//country
		WebElement country = driver.findElement(By.id("country"));
        Select select3 = new Select(country);
        select3.selectByVisibleText("India");
        
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Maharashtra");
		driver.findElement(By.id("city")).sendKeys("Nagpur");
		driver.findElement(By.id("zipcode")).sendKeys("zipcode");
		driver.findElement(By.id("mobile_number")).sendKeys("9561371562");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		
		Thread.sleep(3000);
		
		  WebElement registrationMessage = driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
		System.out.println(registrationMessage.getText());
		
		
		
		
		

		

	}

}
