package com.d2c.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features/Epage.feature", glue = "com.d2c.stepdefs", monochrome = true, dryRun = false,
		//tags = "@Sanity",
		plugin = { "pretty", "html:Reports/basicreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class testRunner {

}
