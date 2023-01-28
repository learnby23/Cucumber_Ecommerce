package com.d2c.stepdefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.*;

public class Launch extends BaseClass {

	Logger log = LogManager.getLogger("Launch");

	@Given("Provide the url {string}")
	public void provide_the_url(String url) {
		log.info("Providing the Facebook URL");
		driver.get(url);

	}

}
