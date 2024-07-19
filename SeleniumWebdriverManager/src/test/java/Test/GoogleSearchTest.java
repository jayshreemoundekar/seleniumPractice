package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GoogleSearchPages;
public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearch();
	}
	
public static void googleSearch() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("Automation Step by step");
	
	GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
	}
	
		
		

	

}
