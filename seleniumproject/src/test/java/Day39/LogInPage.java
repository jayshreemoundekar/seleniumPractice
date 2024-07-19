package Day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	private WebDriver driver;

	//constructor
	
	LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	By 	img_logo=By.xpath("//img[@alt='company-branding']");
	By txt_username=By.name("username");
	By txt_password=By.name("password");
	By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action Method
	
	public void setUserName(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean checkLogoPresence()
	{
		boolean status=driver.findElement(img_logo).isDisplayed();
		return status;
		
	}
	

}
