package suite.AppiumProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.Assert;

public class ArrayListsCompare {
	
	public static void main(String[] args) {
		
		/*ArrayList<String> expected=new ArrayList<>();
		expected.add("Command one");
		expected.add("Command two");
		expected.add("Command three");*/
		
		String expectedOptions="Command one,Command two,Command three";
		ArrayList<String> expected=new ArrayList<String>(Arrays.asList(expectedOptions.split("\\s*,\\s*")));
		
		ArrayList<String> actual=new ArrayList<>();
		actual.add("Command one");
		actual.add("Command two");
		actual.add("Command three");
		
		Iterator<String> itr=expected.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(actual.remove(str)){
				itr.remove();
				continue;
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<>();
		unmatched.addAll(expected);
		unmatched.addAll(actual);
		System.out.println("Unmatched Options: "+unmatched);
		
		String expMsg="Clicked on Earth.";
		String actualMsg="Clicked on Earth";
		Assert.assertEquals(actualMsg, expMsg);
		
		
		
	}

}
