package Day28;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();

		// dropdown )
		driver.findElement(By.cssSelector("select[name='fromPort']")).sendKeys("Portland");

		driver.findElement(By.cssSelector("select[name='toPort']")).sendKeys("London");

		driver.findElement(By.xpath("//div[@class='container']/input")).click();

		int rows = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th")).size();
		System.out.println("Number of rows are" + rows);

		// capture prices then store in array

		String pricesArr[] = new String[rows];

		for (int r = 1; r <= rows; r++) {
			String prices = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[" + r + "]/td[6]")).getText();
			pricesArr[r - 1] = prices;

		}

		// Sort price then find lower price

		for (String arrayvalue : pricesArr) {
			System.out.println(arrayvalue);
		}

		Arrays.sort(pricesArr);
		String lowestPrice = pricesArr[0];
		System.out.println("Lowervalue:" + lowestPrice);

		// find record in the table having lower price

		for (int r = 1; r <= rows; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[\"+r+\"]/td[6]")).getText();

			if (price.equals(lowestPrice)) {
				driver.findElement(By.xpath("//table[@class='table']/tbody/tr[" + r + "]/td[1]/input")).click();
				break;
			}
		}

		driver.findElement(By.cssSelector("#inputName")).sendKeys("Jayshree Moundekar");
		driver.findElement(By.cssSelector("#address")).sendKeys("458, New Nandanvan, Nagpur");
		driver.findElement(By.cssSelector("#city")).sendKeys("Nagpur");
		driver.findElement(By.cssSelector("#state")).sendKeys("Maharashtra");

		driver.findElement(By.cssSelector("#zipCode")).sendKeys("440009");
		driver.findElement(By.cssSelector("#cardType")).sendKeys("American Express");

		driver.findElement(By.cssSelector("#creditCardNumber")).sendKeys("1234556566");
		driver.findElement(By.cssSelector("#creditCardMonth")).clear();
		driver.findElement(By.cssSelector("#creditCardMonth")).sendKeys("12");
		driver.findElement(By.cssSelector("#creditCardYear")).clear();
		driver.findElement(By.cssSelector("#creditCardYear")).sendKeys("08");

		driver.findElement(By.cssSelector("#nameOnCard")).sendKeys("JayshreeM");
		driver.findElement(By.cssSelector("#rememberMe")).click();
		driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
		String response = driver.findElement(By.xpath("//div[@class='container hero-unit']/h1")).getText();
		if (response.contains("Thank you for your purchase today!")) {
			System.out.println("Test Passed");
		}

		System.out.println("Test Failed");

	}

}
