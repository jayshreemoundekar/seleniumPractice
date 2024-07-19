package Day30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollongPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		Thread.sleep(3000);

		JavascriptExecutor js = driver;

		// 1)scroll down page by pixel
		//js.executeScript("window.scrollBy(0,3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset")); // 3000
		
		//2)scroll down the page till the element is present
		//WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		//js.executeScript("argument[0].scrollIntoView();", flag);
		//System.out.println(js.executeScript("return window.pageYOffset"));
		
		//3)Scroll down till end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(3000);
		//go back to initial position
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
