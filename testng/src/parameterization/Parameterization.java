package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {
	WebDriver driver;
    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String app)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("WebDriver.chrome.driver", "C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win32\\chromedriver-win32.exe");
            driver=new ChromeDriver();


        }
        else if (browser.equalsIgnoreCase("firefox"))
            {
                System.setProperty("WebDriver.gecko.driver", "C:\\Users\\JAYSHREE\\Downloads\\geckodriver-win32\\geckodriver-win32.exe");
                driver=new FirefoxDriver();

            }

        }

        driver.get(app);


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

}}
