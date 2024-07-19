package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By search=By.cssSelector("input[placeholder='Search for Vegetables and Fruits']");
	By productName=By.cssSelector("h4[class='product-name']");
	By increament = By.cssSelector(".increment");
	By addToCart = By.cssSelector(".product-action button");
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);

	}
	
	public void getSearchText(String name)
	{
		driver.findElement(search).sendKeys(name);

	}
	
	public void increamentQuantity(int quantity)
	{
		int i= quantity-1;
		while(i>0)
		{
			driver.findElement(increament);
			i--;
		}
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();

	}

	public void selectTopDealsPage() {
		// TODO Auto-generated method stub
		
	}
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}

	
	

}
