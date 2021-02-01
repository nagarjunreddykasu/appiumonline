package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AlertsTest extends Base{
	
	@Test
	public void TC_AlertsTest() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("App")).click();
		driver.findElement(MobileBy.AccessibilityId("Alert Dialogs")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Alert Dialogs']")).click();
		//driver.findElement(MobileBy.id("")).click();
		/*List<AndroidElement> list=driver.findElements(MobileBy.id("android:id/text1"));
		list.get(3).click();*/
		
		driver.findElement(MobileBy.id("io.appium.android.apis:id/two_buttons")).click();
		//driver.findElement(MobileBy.AccessibilityId("OK Cancel dialog with a message")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.Button[@text='OK CANCEL DIALOG WITH A MESSAGE']")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@text,'WITH A MESSAGE')]")).click();
		
		String alertMessage=driver.findElement(MobileBy.id("android:id/alertTitle")).getText();
		System.out.println(alertMessage);
		
		driver.findElement(MobileBy.id("android:id/button1")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.Button[@text='OK']")).click();
		
		//2nd Alert
		driver.findElement(MobileBy.id("io.appium.android.apis:id/two_buttons2")).click();
		//driver.findElement(MobileBy.AccessibilityId("OK Cancel dialog with a long message")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.Button[@text='OK CANCEL DIALOG WITH A LONG MESSAGE']")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.Button[contains(@text,'WITH A LONG MESSAGE')]")).click();
		
		String longMessage=driver.findElement(MobileBy.id("android:id/message")).getText();
		
		//String longMsg=driver.findElement(MobileBy.xpath("//android.widget.TextView[starts-with(@text,'Plloaso mako')]")).getText();
		
		System.out.println(longMessage);
		
		driver.findElement(MobileBy.id("android:id/button3")).click();
		//driver.findElement(MobileBy.xpath("//android.widget.Button[@text='SOMETHING']")).click();
		
	}

}

//Assignment-1:

//1. Write a program to display the alert message when clicking on 'OK CANCEL DIALOG WITH TRADITIONAL THEME' button
//   (Navigation: App-->Alert Dialogs)

//2. Write a program to enter the data in Name & Password fields in 'TEXT ENTRY DIALOG' screen and then click on OK.
//	 (Navigation: App-->Alert Dialogs-->TEXT ENTRY DIALOG)

//driver.findElement(MobileBy.id("android:id/button3")).sendKeys("username");

//email: nagarjun.sdet@gmail.com

//GitHub Repository
//https://github.com/nagarjunreddykasu/appiumonline/tree/master/AppiumProject/src/test/java/suite/AppiumProject













