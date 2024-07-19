package Day29;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement rome=driver.findElement(By.cssSelector("#box6"));
		WebElement italy=driver.findElement(By.cssSelector("#box106"));
		act.dragAndDrop(rome, italy).perform();
		WebElement washington=driver.findElement(By.cssSelector("#box3"));
		WebElement usa=driver	.findElement(By.cssSelector("#box103"));
		act.dragAndDrop(washington, usa).perform();
	}

}
