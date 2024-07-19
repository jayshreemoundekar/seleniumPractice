package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public static LandingPage landingPage;
	
	public static  OffersPage offersPage;
	
	public static WebDriver driver;
	public static CheckoutPage checkOutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public LandingPage getLandingPage()
	{
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage OffersPage()
	{
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	public static CheckoutPage getCheckoutPage()
	{
		checkOutPage = new CheckoutPage(driver);
		return checkOutPage;
	}

	

}
