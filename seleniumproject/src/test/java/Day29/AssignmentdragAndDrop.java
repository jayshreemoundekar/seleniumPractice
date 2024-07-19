package Day29;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentdragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		Actions act = new Actions(driver);
		WebElement from1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement to1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
		act.dragAndDrop(from1, to1).build().perform();
		// WebElement sales =
		// driver.findElement(By.cssSelector("//li[@id='credit1']/a"));

		WebElement from2 = driver.findElement(By.xpath("//li[@id='credit1']/a"));
		WebElement to2 = driver.findElement(By.xpath("//ol[@id='loan']/li"));
		act.dragAndDrop(from2, to2).build().perform();

		WebElement from3 = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement to3 = driver.findElement(By.cssSelector("#amt7"));
		act.dragAndDrop(from3, to3).build().perform();

		WebElement from4 = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
		WebElement to4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		act.dragAndDrop(from4, to4).build().perform();

		if (driver.findElement(By.xpath("//div[@id='equal']/a[1]")).isDisplayed()) {
			System.out.println("Perfect displayed");
		} else {
			System.out.println("Perfect not displayed");
		}
	}

}
