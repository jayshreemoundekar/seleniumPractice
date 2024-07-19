package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionExample {
	WebDriver driver;
    @BeforeClass
    void setUp()
    {
          System.setProperty("WebDriver.chrome.driver", "C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32.exe");
            driver=new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Test(Priority=1)
    void logoTest()
    {
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displaying");

    }

    @Test(Priority=2)
    void homePageTitle()
    {
         String title=driver.getTitle();
         Assert.assertEquals("OrangeHRM",title,"Title is not matched");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }


}
