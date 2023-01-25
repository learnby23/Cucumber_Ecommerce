package com.d2c.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.d2c.poc.Facebboklogon;
import io.cucumber.java.en.*;

public class FacebookLogin{
	public WebDriver driver;
	public Facebboklogon fl;
	
	@Given("provide the url {string}")
	public void provide_the_url(String url1) {
		driver=new ChromeDriver();
		fl=new Facebboklogon(driver);
		driver.get(url1);
	}
	@When("enter the emailorphonenumber {string}")
	public void enter_the_emailorphonenumber(String em) {
		fl.enterEmailorphonenumber(em);
	    
	}
	@When("enter the password {string}")
	public void enter_the_password(String pas) {
		fl.enterPassword(pas);
	    
	}
	@Then("close the browser")
	public void close_the_browser() {
	fl.closerBrowser();
	}

}
