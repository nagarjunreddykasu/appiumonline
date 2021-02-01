package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ListDialogDemo extends Base{
	
	@Test
	public void TC_ListDialog() throws Exception{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("App")).click();
		driver.findElement(MobileBy.AccessibilityId("Alert Dialogs")).click();
		driver.findElement(MobileBy.id("io.appium.android.apis:id/select_button")).click();
		
		List<AndroidElement> list=driver.findElements(MobileBy.id("android:id/text1"));
		ArrayList<String> actualOptions=new ArrayList<>();
		for(AndroidElement item:list){
			actualOptions.add(item.getText());
		}
		System.out.println("Actual Options: "+actualOptions);
		
		ArrayList<String> expectedOptions=new ArrayList<>();
		expectedOptions.add("Command one-1");
		expectedOptions.add("Command two");
		expectedOptions.add("Command three");
		expectedOptions.add("Command four");
		
		Iterator<String> itr=actualOptions.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(expectedOptions.remove(str)){
				itr.remove();
				continue;
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(actualOptions);
		unmatched.addAll(expectedOptions);
		System.out.println("Unmatched Options: "+unmatched);
		
		//unmatched=Reusable.compareArrayLists(expectedOptions, actualOptions);
		
		if(unmatched.size()>0){
			throw new Exception("Actual and Expected Options are NOT equal. Unmatched Options are "+unmatched);
		}
		else{
			System.out.println("Actual and Expected Options are Equal.");
		}
	}

}


//Assignment:
//Write a program to compare the actual and expected list options displayed in 'SINGLE CHOICE LIST'
//(Navigation: App-->Alert Dialogs-->SINGLE CHOICE LIST) and display the unmatched options.











