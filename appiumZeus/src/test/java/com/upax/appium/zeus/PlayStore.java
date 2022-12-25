package com.upax.appium.zeus;

import java.awt.List;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;

public class PlayStore {

public static void main(String[] args) throws InterruptedException {

	//Set the Desired Capabilities

	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability("deviceName", "Galaxy A52");

	caps.setCapability("udid", "R58T607HX2R"); //Give Device ID  caps.setCapability("platformName", "Android");

	caps.setCapability("platformVersion", "12.0");

	caps.setCapability("appPackage", "com.android.vending");

	caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

	caps.setCapability("noReset", "true");

	//Instantiate Appium Driver
	
	try {

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		Thread.sleep(2000);
		
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView").sendKeys("zeus tareas");
		

    	//MobileElement homeTab = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView"));
        //homeTab.sendKeys("zeus tareas");
		
		
		java.util.List<MobileElement> element = driver.findElementsByClassName("android.widget.TextView");
		
		for(int i = 0; i < element.size(); i++)
        {
            System.out.println("Value of element is: " + element.get(i));
            if (element.get(i).getText().equals("Buscar apps y juegos")); {
            	element.get(i).click();
            Thread.sleep(6000);
            
            break;
            }
        
        }
		
		driver.quit();
		
		} catch (MalformedURLException e) {

		System.out.println(e.getMessage());

		}

		}

		}
	
	
	
	
	
	