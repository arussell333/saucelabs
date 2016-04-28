package com.appium.saucelabs;


import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


public class BasicSafaritest {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		
		
		
//		DesiredCapabilities caps = DesiredCapabilities.iphone();
//		caps.setCapability("appiumVersion", "1.4.16");
//		caps.setCapability("deviceName","iPhone 5");
//		caps.setCapability("deviceOrientation", "portrait");
//		caps.setCapability("platformVersion","9.2");
//		caps.setCapability("platformName", "iOS");
//		caps.setCapability("browserName", "safari");
//		IOSDriver driver= new IOSDriver(new URL("http://arussell333:a5a8a714-4ab8-40e5-93b0-462a6912b78e@ondemand.saucelabs.com:80/wd/hub"),caps);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.get("https://www.irishtimes.com");
//		Thread.sleep(4000);
//		driver.quit();
		
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","iOS");
		capabilities.setCapability("platformVersion","7.1");
		capabilities.setCapability("browserName","safari");
		capabilities.setCapability("deviceName","iPhone Simulator");
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://google.com");
		Thread.sleep(4000);
		
		
		
		
	}

}
