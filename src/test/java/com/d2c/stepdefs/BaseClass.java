package com.d2c.stepdefs;

//import java.time.Duration;

//import org.junit.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.d2c.poc.AddCategory;
import com.d2c.poc.Epagelogin;

import Utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	public Epagelogin pg;
	public AddCategory ac;
	// public static Logger log;
	public ReadConfig readconfig;

}
