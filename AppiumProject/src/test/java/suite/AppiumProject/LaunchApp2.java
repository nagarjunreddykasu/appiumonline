package suite.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp2 {
	@Test
	public void TC_LaunchApp() throws MalformedURLException{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emualtor-5554");
		//capabilities.setCapability(MobileCapabilityType.UDID, "<deviceid>");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		//APP_PACKAGE
		//APP_ACTIVITY
		
		//APK Analyzer app
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		//driver.findElement(MobileBy.AccessibilityId("App")).click();
		
		//driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='App']")).click();
		
		driver.findElement(MobileBy.id("android:id/text1")).click();
		
		// id name classname linktext partiallinktext cssselector xpath tagname
		// id classname xpath 
		// AndroidUIAutomator AccessiblityId
		//id --> resource-id
		//classname -->class
		//accessibilityId -->content-desc value
		
		//classname[@attributename='value']
		
		
		
		
		
	}

}


//uiautomatorviewer