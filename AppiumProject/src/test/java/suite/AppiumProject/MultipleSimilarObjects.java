package suite.AppiumProject;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MultipleSimilarObjects extends Base{
	@Test
	public void TC_MultipleTest() throws MalformedURLException{
		AndroidDriver<AndroidElement> driver=appLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<AndroidElement> list=driver.findElements(MobileBy.id("android:id/text1"));
		
		for(int i=0;i<list.size();i++){
			String name=list.get(i).getText();
			if(name.equals("Views")){
				list.get(i).click();
			}
			
		}
	}

}
