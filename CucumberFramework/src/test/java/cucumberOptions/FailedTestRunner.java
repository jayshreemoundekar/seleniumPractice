package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenario.txt", glue="stepDefinition", monochrome=true, 
plugin= {"html:target/cucumber.html", "json:/target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenario.txt"})
public class FailedTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	
	public Object [][] scenarios()
			{
				return super.scenarios();
		
			}

	

}
