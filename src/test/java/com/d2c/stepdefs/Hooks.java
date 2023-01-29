package com.d2c.stepdefs;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	public void setUp(Scenario sc) throws Exception {

		readconfig = new ReadConfig();
		String browser = readconfig.getBrowser();

		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		System.out.println("Started the execution of scenario: "+sc.getName());

	}

	@After
	public void tearDown() {
		// driver.close();
		driver.quit();
	}

	@AfterStep
	public void takesScreenShots(Scenario scenario) {

		/*
		 * final byte[] screenshot =((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot,
		 * "image/png", "Click to see fullscreen image");
		 */

		if (scenario.isFailed() == true) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Click to see fullscreen image");
		}

	}
}
