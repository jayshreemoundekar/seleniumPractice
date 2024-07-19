package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
public WebDriver driver;
	
	
	public OffersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By search=By.cssSelector("input[placeholder='Search for Vegetables and Fruits']");
	private By productName=By.xpath("//tbody/tr/td[1]");
	By topDeals=By.linkText("Top Deals");
	
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);

	}
	
	
	public void getSearchText(String name)
	{
		driver.findElement(search).sendKeys(name);

	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();

	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	}

}
