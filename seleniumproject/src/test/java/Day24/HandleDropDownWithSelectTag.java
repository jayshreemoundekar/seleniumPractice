package Day24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithSelectTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();

		WebElement dropcntryele = driver.findElement(By.cssSelector("#country-list"));
		Select dropcountry = new Select(dropcntryele);

		// dropcountry.selectByVisibleText("China");
		dropcountry.selectByValue("4");

		// find total options in dropdown

		List<WebElement> options = dropcountry.getOptions();
		System.out.println("Total number of options" + options.size());

		// print options in console window

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

		// using enhanced loop

		for (WebElement op : options) {
			System.out.println(op.getText());
		}
	}

}
