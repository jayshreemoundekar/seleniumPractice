package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@Netbaking")
	public void netBanking() {
		System.out.println("setup the enreies in the Netbaking database");
	}

	@After
	public void tearDown() {
		System.out.println("Clear the enteries");
	}

	@Before("Mortguage")
	public void mortguageSetup() {
		System.out.println("setup the enreies in the Mortguage database");
	}
}

// Before->Background -> Scenario -> After
