package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", 
glue="stepDefination", dryRun=true,
monochrome=true, 
tags="not @RegressionTest",
plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	 

}
