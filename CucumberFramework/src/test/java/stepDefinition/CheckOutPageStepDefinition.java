package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.CheckoutPage;
import pageObject.PageObjectManager;
import utils.TestContextSetUp;

public class CheckOutPageStepDefinition {
	public WebDriver driver;
	public String offerPage;
	public String landingpageproductName;
	public  CheckoutPage checkOutPage;
	public PageObjectManager pageObjectManager;
	
	TestContextSetUp testContextSetu;

	public CheckOutPageStepDefinition(TestContextSetUp testContextSetu) {
		 WebDriver driver = new ChromeDriver(); // ensure WebDriver is properly initialized
	        pageObjectManager = new PageObjectManager(driver);
	        checkOutPage = PageObjectManager.getCheckoutPage();
		this.testContextSetu = testContextSetu;
		
	}

	
	@Then ("User has ability to enter promo code and place the order")
	public void User_has_ability_to_enter_promo_code_and_place_the_order()
	{
		
		
		
		Assert.assertTrue(checkOutPage.VerifyPromoBtn());		
		Assert.assertTrue(checkOutPage.VerifyplaceOrder());
		
	}
	@Then("User proceeds to checkout and validate the Tom items in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
	    // Example implementation:
	    System.out.println("Validating Tom items in the checkout page...");
	    // Add your validation logic here
	}
	
	@Then ("^User proceeds to checkout and validate the <Name> items in checkout page$")
	public void User_proceeds_to_checkout(String name) throws InterruptedException
	{
		
		checkOutPage.checkoutItems();
		
		
	}
	

}
