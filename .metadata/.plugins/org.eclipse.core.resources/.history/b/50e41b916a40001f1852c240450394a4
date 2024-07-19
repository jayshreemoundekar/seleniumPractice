package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.OffersPage;
import pageObject.PageObjectManager;
import utils.TestContextSetUp;

public class OfferPageStepDefinition {

	public String offerPage;
	TestContextSetUp testContextSetu;
	PageObjectManager pageObjectManager;
	//Single responsibility priciple
	//loosly coupled
	//factory
	
	
	public OfferPageStepDefinition(TestContextSetUp testContextSetu)
	{
		this.testContextSetu=testContextSetu;
	}
	
	
	
	@Then("^user searched for same (.+) shortname in offerspage$")
	public void user_searched_for_same_shortname_in_offerspage(String shortname)
			throws InterruptedException {
		
		switchToOffersPage();
		
		OffersPage offersPage= new OffersPage(testContextSetu.driver);
		offersPage.searchItem(shortname);
		Thread.sleep(2000);
		
		offerPage =offersPage.getProductName();

	}
	
	public void switchToOffersPage()
	{
		
		//if switch to offer page ->skip below part
		//pageObjectManager =new PageObjectManager(testContextSetu.driver);
		LandingPage landingPage=testContextSetu.pageObjectManager.getLandingPage();
		
		
		landingPage.selectTopDealsPage();
		
		testContextSetu.genericUtils.SwitchWindowToChild();
		
		//explicit wait , parse string 
	}
	
	

	@Then("validate product name in offer page matches with landing page")
	public void validate_product_name_in_offer_page_matches_with_landing_page() {
		Assert.assertEquals(offerPage,testContextSetu.landingpageproductName);
		testContextSetu.driver.quit();
	}

}
