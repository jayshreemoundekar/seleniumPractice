package Day17;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement txtemailbox = driver.findElement(By.id("Email"));

		txtemailbox.clear();
		txtemailbox.sendKeys("admin@yourstore.com");
		WebElement passbox = driver.findElement(By.id("Password"));
		passbox.clear();
		passbox.sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(7000);
		// Verify the title
		/*
		 * String act_title = driver.getTitle(); String exp_title =
		 * "Dashboard / nopCommerce administration"; if(act_title.equals(exp_title)) {
		 * System.out.println("Test pass"); } else { System.out.println("Test fail"); }
		 */

		// verify dashboard
		String act_label = null;
		try

		{
			act_label = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		}

		catch (NoSuchElementException e) {

		}
		String exp_label = "Dashboard";
		if (act_label.equals(exp_label)) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
	}

}
