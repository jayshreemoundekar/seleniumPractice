package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
	public String landingpageproductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetUp() throws IOException
	{
		testBase= new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		 genericUtils = new GenericUtils(testBase.WebDriverManager());
		
		}
}
