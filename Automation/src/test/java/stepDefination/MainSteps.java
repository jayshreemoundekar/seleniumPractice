package stepDefination;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing Page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    System.out.println("User landed on netbanking page");
	}
	
	@Given("User is on practice landing Page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed on landing page");
	    Assert.assertTrue(false);
	    
	}
	
	@When("User signup into application")
	public void user_signup_into_application(List<String> data)
	{
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println("User signup into application");
	}
	
	
	@When("User login into application")
	public void user_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("User login into application");
	}
	
	/*@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username + "and password is" + password);
	}*/
	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username + "and password is" + password);
	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home Page id Displayed");}
	    
	    
	    @Then("Cards are displayed")
		public void Cards_are_displayed() {
		    // Write code here that turns the phrase above into concrete actions
		    
		    System.out.println("Cards are displayed");
}
	    
	    @Given("Setup the entries in database")
	    public void setupEntries()
	    {
	    	System.out.println("Setup the entries in database");
	    }
	    
	     
	    @And("launch the browser from config variable")
	    public void configVariable()
	    {
	    	 System.out.println("launch the browser from config variable");
	    }
	    
	    @And("hit the homepage url of banking site")
	    public void bankingSite()
	    {
	    	System.out.println("hit the homepage url of banking site");
	    }
}
