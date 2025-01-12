package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utils.TestContextSetUp;

public class LandingPageStepDefinitionFile {
	public WebDriver driver;
	public String offerPage;
	public String landingpageproductName;
	LandingPage landingPage;
	TestContextSetUp testContextSetu;

	public LandingPageStepDefinitionFile(TestContextSetUp testContextSetu) {
		this.testContextSetu = testContextSetu;
		this.landingPage=testContextSetu.pageObjectManager.getLandingPage();
	}

	@Given("User is on Greencart Landing Page")
	public void user_is_on_greencart_landing_page() {

		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
		
	}

	@When("^User searched with shortname (.+) and extract actual name for product$")
	public void user_searched_with_short_name_and_extract_actual_name_for_product(String shortname)
			throws InterruptedException {

		LandingPage landingPage = testContextSetu.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortname);
		Thread.sleep(2000);
		testContextSetu.landingpageproductName = landingPage.getProductName().split("-")[0].trim();

		System.out.println(landingpageproductName + " is extracted from HomePage");

	}
	
	@When ("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String quantity)
	{
		landingPage.increamentQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

}
