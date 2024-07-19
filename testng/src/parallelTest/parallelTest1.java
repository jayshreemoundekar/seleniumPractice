package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class parallelTest1 {
	WebDriver driver;
	@Test
	    void logoTest() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32.exe");
	        driver=new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       WebElement logo= driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"))
	        Assert.assertTrue(logo.isDisplayed());
	       Thread.sleep(5000);
	    }

	    @Test
	    void homePageTitle() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32.exe");
	        driver=new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	        Thread.sleep(5000);
	    }
	@Test
	    @AfterMethod
	    void tearDown()
	{
	    driver.quit();
	}


}
