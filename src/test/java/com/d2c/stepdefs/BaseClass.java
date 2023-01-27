package com.d2c.stepdefs;

import org.apache.logging.log4j.Logger;

//import java.time.Duration;

//import org.junit.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.d2c.poc.AddCategory;
import com.d2c.poc.Epagelogin;

import Utilities.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public Epagelogin pg;
	public AddCategory ac;
	public static Logger log;
	public ReadConfig readconfig;

}
