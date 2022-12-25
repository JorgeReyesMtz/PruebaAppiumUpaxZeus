package com.upax.appium.zeus;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Login {

	   WebDriver driver;
	     
	    @BeforeClass
	    public void setUp() {
	    	try {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Galaxy A52");
	        caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
	        caps.setCapability("platformVersion", "12");
	        caps.setCapability("appPackage", "com.upax.zeusgeneric");
	        //caps.setCapability("appActivity","com.upax.zeusgeneric.view.ZActivityAuxiliarNotification"); 
	        caps.setCapability("appActivity","com.upax.loginokta.ui.login.main.ZLOMainActivity");
	         
	        URL url = new URL ("http://0.0.0.0:4723/wd/hub");
	        driver = new RemoteWebDriver(url, caps);
	    
	    	}catch(Exception e) {
	    		System.out.println("Error en before class: " +e);
	    	}
	    	}
	    
	    @Test
	    public void TestMethod() {
	    	
	    	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[2]\r\n" + 
	    			//"")).click();
	    	
	    	//MobileElement homeTab = (MobileElement) driver.findElement(By.id("tab-t0-0"));
	        //homeTab.click();
	         
	    }
	    
	    
	    
	    
	    
	    @AfterClass
	    public void testend() {
	        driver.quit();
	    }
	    

}
