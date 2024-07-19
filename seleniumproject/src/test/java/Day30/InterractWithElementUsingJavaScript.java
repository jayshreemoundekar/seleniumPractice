package Day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterractWithElementUsingJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// JavascriptExecutor js= driver;

		// name
		WebElement inputbox = driver.findElement(By.cssSelector("#name"));
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);

		// radiobutton
		WebElement radiobutton_female = driver.findElement(By.cssSelector("#female"));
		radiobutton_female.click();
		js.executeScript("arguments[0].click();", radiobutton_female);
		
		//button
		WebElement checkbox = driver.findElement(By.id("sunday"));
		js.executeScript("arguments[0].click();", checkbox);
		
		
		

	}

}
