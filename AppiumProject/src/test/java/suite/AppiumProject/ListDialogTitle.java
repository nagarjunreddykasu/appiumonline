package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ListDialogTitle extends Base {
	@Test
	public void TC_ListDialogTitle() throws Exception{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("App")).click();
		driver.findElement(MobileBy.AccessibilityId("Alert Dialogs")).click();
		driver.findElement(MobileBy.id("io.appium.android.apis:id/select_button")).click();
		
		String actualMessage=driver.findElement(MobileBy.id("android:id/alertTitle")).getText();
		String expectedMessage="Header titles";
		if(actualMessage.contentEquals(expectedMessage)){
			System.out.println("Actual and Expected Messages are Equal");
		}
		else
			throw new Exception("Actual and Expected Messages are NOT equal. Actual Message: "+actualMessage);
		
		
		//Assert.assertEquals(actualMessage, expectedMessage);
	}

}
