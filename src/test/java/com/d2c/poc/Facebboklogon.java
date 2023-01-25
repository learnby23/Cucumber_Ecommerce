package com.d2c.poc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebboklogon{
	
	WebDriver ldriver;
	public Facebboklogon(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(css="input#email")
	WebElement email;
	
	@FindBy(css="input#pass")
	WebElement pass;
	
	public void enterEmailorphonenumber(String emailornumber)
	{
		email.sendKeys(emailornumber);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void closerBrowser()
	{
		ldriver.quit();
	}
	
}
