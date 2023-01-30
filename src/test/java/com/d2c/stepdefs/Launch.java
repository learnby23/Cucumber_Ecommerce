package com.d2c.stepdefs;

import io.cucumber.java.en.*;

public class Launch extends BaseClass {

	@Given("Provide the url {string}")
	public void provide_the_url(String url) {
		log.info("Providing the Facebook URL");
		driver.get(url);
		log.info("The facebook page is launched");

	}

}
