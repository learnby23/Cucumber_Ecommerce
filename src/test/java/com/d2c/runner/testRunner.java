package com.d2c.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources/Features", 	// To add the feature
		glue = {"com.d2c.stepdefs","com.d2c.hooks"}, 						// To find the step definition code
		monochrome = false, 								// Optional in the latest versions use pretty plugin
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
