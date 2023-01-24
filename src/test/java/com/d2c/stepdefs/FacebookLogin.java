package com.d2c.stepdefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FacebookLogin {
	WebDriver driver;
	
	@Given("setup browser and provide the url {string}")
	public void setup_browser_and_provide_the_url(String url) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	    driver.quit();
	}

}
