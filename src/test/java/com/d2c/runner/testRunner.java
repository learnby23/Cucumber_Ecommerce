package com.d2c.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources/Features", 	// To add the feature
		glue = "com.d2c.stepdefs", 						// To find the step definition code
		monochrome = false, 								// To see the unified console 
		dryRun =false,  								    // To check the steps are mapped 
		tags = "@login and @valid", 					 			// To add the scenario tags
		plugin = {										// To add the different plugin to see the report	
		"pretty", 
		"html:Reports/HTMLreport.html", 
		"json:Reports/JSONreport.json", 
		"junit:Reports/XMLreport.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class testRunner {

}
