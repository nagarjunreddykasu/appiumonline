package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MultipleChoiceList extends Base{
	
	@Test
	public void TC_MultipleTest() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Views")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"))");
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Lists']")).click();
		
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='11. Multiple choice list']")).click();
		
		List<AndroidElement> list=driver.findElements(MobileBy.id("android:id/text1"));
		list.get(0).click();
		list.get(1).click();
		list.get(2).click();
		list.get(3).click();
		list.get(4).click();
		
		ArrayList<String> options=new ArrayList<>();
		for(AndroidElement checked:list){
			String checkedFlag=checked.getAttribute("checked");
			if(checkedFlag.equals("true")){
				options.add(checked.getText());
			}
		}
		
		System.out.println("Selected Names: "+options);
		
		
		
		
	}
	

}
