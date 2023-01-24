package com.d2c.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources/Features/facebook.feature",
		glue="com.d2c.stepdefs",
		monochrome=true,
		dryRun = false,
		plugin = {"pretty", "html:Reports/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)

public class testRunner {

}
