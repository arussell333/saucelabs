package com.appium.saucelabs;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;



public class iOSUITest {
	
private IOSDriver driver;

	@Before
	
	public void Setup()throws Exception {
		
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("appiumVersion", "1.4.16");
		caps.setCapability("deviceName","iPhone 5");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion","9.2");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "");
		caps.setCapability("app", "sauce-storage:uc.zip");
	//	caps.setCapability("fullReset", true);
		IOSDriver driver= new IOSDriver(new URL("http://arussell333:a5a8a714-4ab8-40e5-93b0-462a6912b78e@ondemand.saucelabs.com:80/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[3]")).click();
		
      
        }
        

	@Test

	public void testCaseLogin() throws  Exception

	{
	
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[2]")).click();

	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
