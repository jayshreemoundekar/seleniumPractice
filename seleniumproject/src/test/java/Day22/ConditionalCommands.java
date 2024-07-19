package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//WebElement logo=driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
		//System.out.println("display status of logo"+ logo.isDisplayed());
		
		//boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		
		WebElement searchbox=driver.findElement(By.cssSelector("input#small-searchterms"));
	
		System.out.println("Display Status" + searchbox.isDisplayed());
		System.out.println("Enable status" + searchbox.isEnabled());
	
	//isSelected();
	
	WebElement male=driver.findElement(By.xpath("//span[@class='male']/input"));
	WebElement female=driver.findElement(By.xpath("//span[@class='male']/input"));
	
	//Before selection
	  System.out.println("Before selection.......");
	  System.out.println(male.isSelected());
	  System.out.println(female.isSelected());
	  
	  //after selection of male radio button
	   System.out.println("After selection of male radio button");
	   male.click();
	   System.out.println(male.isSelected());
	   System.out.println(female.isSelected());
	   
	   //After selection of female button
	   System.out.println("After selection of female radio button");
	   female.click();
	    System.out.println(male.isSelected());
	   System.out.println(female.isSelected());
	  
		
	}

}
