package com.d2c.poc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategory {
	WebDriver ldriver;

	public AddCategory(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath="//p[normalize-space()='Catalog']")
	WebElement catalog;

	@FindBy(xpath="//p[normalize-space()='Categories']")
	WebElement categories;

	@FindBy(css="a.btn.btn-primary")
	WebElement addnew;

	@FindBy(css="input#Name")
	WebElement name;

	@FindBy(xpath="//body//p")
	WebElement description;

	@FindBy(css="Select#ParentCategoryId")
	WebElement Ppcategory;

	@FindBy(xpath="//input[@type='file']")
	WebElement upload;

	@FindBy(xpath="//button[@name='save']")
	WebElement savebutton;
	
	public void clickonCatalog() {
		catalog.click();
	}

	public void clickonCategories() {
		categories.click();
	}

	public void clickonAddnew() {
		addnew.click();
	}

	public void provideName(String pname) {
		name.sendKeys(pname);
	}

	public void provideDescription(String desc) {
		description.sendKeys(desc);
	}

	public void selectCategory() {
		
	}

	public void uploadProductImage(String link) {
		upload.sendKeys(link);
	}
	public void clickonSave()
	{
		savebutton.click();
	}
}