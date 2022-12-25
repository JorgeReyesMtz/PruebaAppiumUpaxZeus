package com.upax.appium.zeus;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

public class Login3 {

public static void main(String[] args) {

	//Set the Desired Capabilities

	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability("deviceName", "Galaxy A52");

	caps.setCapability("udid", "R58T607HX2R"); //Give Device ID  caps.setCapability("platformName", "Android");

	caps.setCapability("platformVersion", "12.0");

	caps.setCapability("appPackage", "com.upax.zeusgeneric");

	caps.setCapability("appActivity", "com.upax.loginokta.ui.login.main.ZLOMainActivity");

	//caps.setCapability("appActivity","com.upax.zeusgeneric.view.ZActivityAuxiliarNotification");
		
	caps.setCapability("noReset", "true");

	//Instantiate Appium Driver
	
	try {

		AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		} catch (MalformedURLException e) {

		System.out.println(e.getMessage());

		}

		}

		}
	
	
	
	
	
	