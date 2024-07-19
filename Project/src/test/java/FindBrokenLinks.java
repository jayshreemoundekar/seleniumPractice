import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total Links are" + links.size());

		int brokenlinks = 0;

		for (WebElement linkEle : links) {
			String hrefAtt = linkEle.getAttribute("href");

			
			if (hrefAtt == null || hrefAtt.isEmpty()) 
			{
				System.out.println("href value is empty");
				continue;
			}
			
			

			URL url = new URL(hrefAtt); // convert string into url

			// send request to server
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();

			conn.connect();
			// conn.getResponseCode();
			if (conn.getResponseCode() >= 400) 
			{
				System.out.println(linkEle.getText() + "========> Broken Link");
				brokenlinks++;
			} else {
				System.out.println(linkEle.getText() + "========> not broken link");
			}
		}
		System.out.println("Total numbers of broken links" + brokenlinks);

	}

}
