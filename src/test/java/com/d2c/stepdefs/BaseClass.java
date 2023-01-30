package com.d2c.stepdefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.d2c.poc.AddCategory;
import com.d2c.poc.Epagelogin;

import Utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	public Epagelogin pg;
	public AddCategory ac;
	// public static Logger log;
	public ReadConfig readconfig;
	public static final Logger log=LogManager.getLogger("class");
}
