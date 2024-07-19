import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.google.com/");
        
        driver.findElement(By.name("q")).sendKeys("selenium tutorial techlistic");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));

        WebElement suggestionsList = driver.findElement(By.xpath("//ul[@role='listbox']"));
        List<WebElement> suggestions = suggestionsList.findElements(By.tagName("li"));

        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }

        driver.quit();
		}
	
		

	}


