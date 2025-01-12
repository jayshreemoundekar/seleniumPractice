package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	public WebDriver driver;
	
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By cartBag = By.cssSelector("[alt='Cart']");
	By checkoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement promoButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoBtn")));
	By placeOrder= By.xpath("//button[contains(text(),'Place Order']");
	
	public void checkoutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
		
	}
	
	public Boolean VerifyPromoBtn()
	{
		return driver.findElement((By) promoButton).isDisplayed();
	}
	public Boolean VerifyplaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
		
	}
	

}
