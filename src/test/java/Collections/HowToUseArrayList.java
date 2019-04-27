package Collections;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HowToUseArrayList {
	
	@Test(enabled = false)
	public void arraylist1() {
		
		ArrayList myArrayStuff = new ArrayList();
		
		myArrayStuff.add("Bose HeadPhones");
		myArrayStuff.add(5000);
		myArrayStuff.add(1.3231);
		myArrayStuff.add(true);
		
		int totalAmountInArray = myArrayStuff.size();
		System.out.println("total stuff in array : "+ totalAmountInArray);
		for(int i = 0; i<myArrayStuff.size(); i++) {
			System.out.println(myArrayStuff.get(i));
		}
		
		
		myArrayStuff.remove(0);
		myArrayStuff.add(0, "wiz khalifa paper planes");
		
		System.out.println("****after removing index 0 and then adding something to index 0 for something else");
		
		for(int i = 0; i<myArrayStuff.size(); i++) {
			System.out.println(myArrayStuff.get(i));
		}
		
		
	}
	
	
	@Test(enabled = true)
	public void ArrayListUsing_GENERICS() {
		
		ArrayList<String> groceryList = new ArrayList<String>();
		ArrayList<Integer> numbersArray = new ArrayList<Integer>();
		ArrayList<Float> numbersArrayOfTypeFloat = new ArrayList<Float>();


		groceryList.add("banana");
		groceryList.add("steak");
		groceryList.add("apple");
		groceryList.add("cheese");
		
		numbersArray.add(10);
		numbersArray.add(20);
		numbersArray.add(40);
		numbersArray.add(1000);
		
		numbersArrayOfTypeFloat.add(1.980f);
		numbersArrayOfTypeFloat.add(2.0021320f);
		numbersArrayOfTypeFloat.add(89.23443f);


		
		int totalAmountInArray = numbersArrayOfTypeFloat.size();
		System.out.println("total stuff in array : "+ totalAmountInArray);
		for(int i = 0; i<numbersArrayOfTypeFloat.size(); i++) {
			System.out.println(numbersArrayOfTypeFloat.get(i));
		}
		
		
		Iterator itr = groceryList.iterator();
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }
		
		
	}
	

}
