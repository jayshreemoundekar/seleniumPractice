package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".demoInputBox")).click(); //click on select dropdown
		
		//count the number of options		
		
		List <WebElement> country= driver.findElements(By.xpath("//select[@id='country-list']/option"));
		System.out.println("Total number of options are"+ country.size());
		
		for(WebElement opt:country) // Select country
		{
			if(opt.getText().equals("France"))
			{
				opt.click();
					break;
			}
		}
		Thread.sleep(3000);
		//for selection of state
		
		driver.findElement(By.id("state-list")).click();  //click on state dropdown
		//state-list
		
		List <WebElement> state = driver.findElements(By.xpath("//select[@id='state-list']/option"));
		System.out.println("Number of states are"+ state.size());
		
		for(WebElement stat:state)
		{
			if(stat.getText().equals("Picardie"))
			{
				stat.click();
				break;
			}
		}
		
		
		

		
		
	}

}
