package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class Hooks {
    TestContextSetUp testContextSetu;
    WebDriver driver;

    // Constructor to initialize TestContextSetUp and WebDriver
    public Hooks(TestContextSetUp testContextSetUp) throws IOException {
        this.testContextSetu = testContextSetUp;
        this.driver = testContextSetu.testBase.WebDriverManager();
    }

    // Method to be executed after each scenario
    @After
    public void afterScenario() throws IOException {
        // Quit the WebDriver instance
    	testContextSetu.testBase.WebDriverManager().quit();
    }

    // Method to be executed after each step
    @AfterStep
    public void addScreenshot(Scenario scenario) {
        // Check if the scenario has failed
        if (scenario.isFailed()) {
            // Take a screenshot and attach it to the scenario
            File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
                scenario.attach(fileContent, "image/png", "image");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}