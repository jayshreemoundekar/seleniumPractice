package Day18;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open app

		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		List<WebElement> sliders = driver.findElements(By.className("bx-next"));
		System.out.println(("Numbers of sliders:" + sliders.size()));
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:" + images.size());
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println("Total number of links:"+links.size());
	}

}
