package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SpinnerTest extends Base{
	
	@Test
	public void TC_SpinnerTest() throws Exception{
		try{
			AndroidDriver<AndroidElement> driver=appLaunch();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(MobileBy.AccessibilityId("Views")).click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");
			driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Spinner']")).click();
			
			driver.findElement(MobileBy.id("io.appium.android.apis:id/spinner1")).click();
			List<AndroidElement> list=driver.findElements(MobileBy.id("android:id/text1"));
			
			ArrayList<String> actualColors=new ArrayList<>();
			
			for(AndroidElement item:list){
				actualColors.add(item.getText());
			}
			
			System.out.println("Actual Color Options: "+actualColors);
			
			driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@text='blue']")).click();
			
			String toastMessage=driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
			System.out.println("Actual Toast Message"+toastMessage);
		} catch(Exception e){
			throw new Exception("Actual and Expected Toast messages are NOT equal.");
		}
	}
	
	@Test
	public void TC_SpinnerTest_2() throws Exception{
		try{
			
		}
		catch(Exception e){
			throw new Exception("Actual and Expected Toast messages are NOT equal.");
		}
		
	}
	
	@Test
	public void TC_SpinnerTest_3() throws Exception{
		try{
			
		}
		catch(Exception e){
			throw new Exception("Actual and Expected Toast messages are NOT equal.");
		}
	}
}


//Assignment:
/*1. Write a program to add all radio options displayed in 'Radio Group' screen in ArrayList and display on console and then select an option 'Dinner'.
(Navigation: Views-->Radio Group).*/


























