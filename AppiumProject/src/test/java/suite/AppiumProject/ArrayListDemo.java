package suite.AppiumProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> expectedOptions=new ArrayList<>();
		expectedOptions.add("Command one");
		expectedOptions.add("Command two");
		expectedOptions.add("Command three");
		expectedOptions.add("Command four");
		
		System.out.println(expectedOptions);
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Nagarjun");
		list2.add("Sahil");
		list2.add("Vartika");
		
		expectedOptions.addAll(list2);
		
		System.out.println(expectedOptions);
		
		
		boolean isRemoved=expectedOptions.remove("Nagarjun");
		System.out.println(isRemoved);
		
		System.out.println(expectedOptions);
		
		
		//1st approach to retrieve data from ArrayList
		System.out.println("***** Using for each loop ******");
		for(String str:expectedOptions){
			System.out.println(str);
		}
		
		//2nd approach to retrieve data from ArrayList
		System.out.println("******** Using for loop***********");
		for(int i=0;i<expectedOptions.size();i++){
			System.out.println(expectedOptions.get(i));
		}
		
		//3rd approach to retrieve data from ArrayList
		System.out.println("******Using Iterator");
		Iterator<String> itr=expectedOptions.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//4th approach
		System.out.println("****** Using ListIterator *******");
		ListIterator<String> litr=expectedOptions.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}