package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resouces\\global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAurl");
		String browser_properties=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		String browser=browser_maven!=null ? browser_maven : browser_properties;
		
		if (driver == null) 
			 {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
	            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYSHREE\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64.exe");
	            driver = new ChromeDriver();
			}
			
		      if(prop.getProperty("browser").equalsIgnoreCase("firefox"))  
		      {
		    	  io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
		    	  driver = new FirefoxDriver();
		      }
		            
		     
			 
			
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
		
		
		
	}
		return driver;

}}
