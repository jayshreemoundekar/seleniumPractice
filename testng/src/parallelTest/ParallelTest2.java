package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelTest2 {
	 WebDriver driver;
	    @Test
	    void LoginTest()
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32.exe");
	        driver=new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.findElement(by.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(by.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(by.id("btnLogin")).click();
	        Assert.assertEquals(driver.getTitle(),"OrangeHRM");


	    }

	    @AfterMethod
	    void tearDown()
	    {

	    }

}
