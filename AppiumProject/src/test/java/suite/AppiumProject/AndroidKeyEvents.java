package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidKeyEvents extends Base {
	
	@Test
	public void TC_MultipleTest() throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		driver.pressKey(new KeyEvent(AndroidKey.CAPS_LOCK));
		driver.pressKey(new KeyEvent(AndroidKey.BACKSLASH));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_UP));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_LEFT));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_RIGHT));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_UP));
		driver.pressKey(new KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new KeyEvent(AndroidKey.TAB));
		driver.pressKey(new KeyEvent(AndroidKey.KEYCODE_ZOOM_IN));
		driver.pressKey(new KeyEvent(AndroidKey.KEYCODE_ZOOM_OUT));
		
	}
}

/*
Write a program to navigate to second, third and then first tab using resource-id attribute in 'Content By Id' screen. (Navigation: Views-->Tabs-->1. Content By Id).

Write a program to display all options from both the spinners using Iterator. (Navigation: Views-->Spinner).

Write a program to display the toast message upon selecting value from spinner Planet (Navigation: Views-->Spinner).*/


