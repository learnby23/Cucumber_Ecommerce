package com.d2c.poc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Epagelogin {
	WebDriver ldriver;

	public Epagelogin(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(css = "#Email")
	WebElement email;

	@FindBy(css = "#Password")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement login;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logout;

	public void enterEmail(String mail) {
		email.clear();
		email.sendKeys(mail);
	}

	public void enterPassword(String passw) {
		pass.clear();
		pass.sendKeys(passw);
	}

	public void clickonLogin() {
		login.click();
	}

	public void clickOnLogout() {
		logout.click();
	}

}
