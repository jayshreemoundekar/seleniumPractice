package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	//Spring framework, EJB, 
	//SRP
	//
	public LandingPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
	}
		@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
			
			Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}

		@When("^user searched with Shortname (.+) and extracted actual name of product$")
		public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName ) throws InterruptedException {
			
			landingPage.searchItem(shortName);
			Thread.sleep(2000);
			testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
			System.out.println(landingPageProductName +" is extracted from Home page");
				
	}

		@When("Added {string} items of the selected product to cart")
		public void Added_items_product(String quantity)
		{
			
			landingPage.incrementQuantity(Integer.parseInt(quantity));
			landingPage.addToCart();
			
		}

}
