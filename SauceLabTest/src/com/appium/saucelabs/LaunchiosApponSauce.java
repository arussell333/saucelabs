package com.appium.saucelabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class LaunchiosApponSauce {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	//	curl -u arussell333:a5a8a714-4ab8-40e5-93b0-462a6912b78e -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/arussell333/uc.zip?overwrite=true --data-binary @/Users/adamrussell/Desktop/uc.zip
		
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("browserName", "");
		caps.setCapability("appiumVersion", "1.5.1");
		caps.setCapability("deviceName","iPhone 6 Plus");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","9.0");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("app", "sauce-storage:uc.zip");
		caps.setCapability("fullReset", true);
		IOSDriver driver= new IOSDriver(new URL("http://arussell333:a5a8a714-4ab8-40e5-93b0-462a6912b78e@ondemand.saucelabs.com:80/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	Thread.sleep(6000);
	driver.quit();
	
	}

}
