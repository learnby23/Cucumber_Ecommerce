package com.d2c.stepdefs;

import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import com.d2c.poc.AddCategory;
import com.d2c.poc.Epagelogin;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

import java.time.Duration;

import org.junit.Assert;

public class Epage extends BaseClass {

	Logger log = LogManager.getLogger("Epage");

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		log.info("Chrome Browser Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		log.info("The Window is Maximized");
	}

	@After
	public void tearDown() {
		// driver.close();
		driver.quit();
	}

	@AfterStep
	public void takesScreenShots(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/jpeg", "Image");
	}

	@Given("provide the url of ecommerce {string}")
	public void provide_the_url_of_ecommerce(String url) {
		pg = new Epagelogin(driver);
		ac = new AddCategory(driver);
		driver.get(url);
	}

	@When("input the email address {string} and password {string}")
	public void input_the_email_address_and_password(String email, String pwd) {
		pg.enterEmail(email);
		pg.enterPassword(pwd);
	}

	@When("click on Log in button")
	public void click_on_log_in_button() {
		pg.clickonLogin();

	}

	@Then("verfiy the title as {string}")
	public void verfiy_the_title_as(String expected) {

		Assert.assertEquals(expected, driver.getTitle());
	}

	@When("click on catalog and categories option")
	public void click_on_catalog_and_categories_option() throws Exception {
		ac.clickonCatalog();
		Thread.sleep(2000);
		ac.clickonCategories();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		ac.clickonAddnew();
	}

	@When("provide the product name {string}")
	public void provide_the_product_name(String nam) throws Exception {
		ac.provideName(nam);
		// Thread.sleep(5000);
		// ac.provideDescription(descrip);
	}

	@When("select the category as Computers")
	public void select_the_category_as_computers() throws Exception {
		// Select sc=new
		// Select(driver.findElement(By.cssSelector("Select#ParentCategoryId")));
		// sc.selectByVisibleText("Computers");
		ac.selectCategory();
	}

	@When("upload the picture of product {string}")
	public void upload_the_picture_of_product(String path) throws Exception {
		ac.uploadProductImage(path);
		Thread.sleep(3000);
	}

	@When("click on save button")
	public void click_on_save_button() {
		ac.clickonSave();
	}

	@When("click on logout button")
	public void click_on_logout_button() {
		pg.clickOnLogout();
	}

}
