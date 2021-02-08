package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollTest extends Base{
	
	@Test
	public void TC_ScrollTest() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"))");
	}

}


// new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))

//UIAutomator

//findElementByAndroidUIAutomator("");

//findElement(MobileBy.AndroidUIAutomator(""))