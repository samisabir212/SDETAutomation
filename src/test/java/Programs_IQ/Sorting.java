package Programs_IQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting {

	
	
	public static void main(String[] args) {
		
//		doBubbleSort();
//		String[] array = {"4","2","3","1"};
//		sortArrayMethod(array);
		sortingHashMap();
		
	}
	
	
	public static void sortArrayMethod(String[] randomArray) {
		
		
		System.out.println("before sorting");
		for (int i = 0; i < randomArray.length;i++) {
			String s = randomArray[i];
			System.out.print(s);
		}
		
		
		Arrays.sort(randomArray);
		
		System.out.println("\nafter sorting");
		
		for (int i = 0; i < randomArray.length;i++) {
			String s = randomArray[i];
			System.out.print(s);
		}
		
	}
	
	
	 public static void doBubbleSort() {
	        
	    	int array[] = {10, 8, 12, 9, 6, 7, 1}; 
	    	
	        
	    	int temp; //temp storage object in order to swap values
	      
	    	for (int i = 0 ; i < array.length ; i++) { //get the size of the array and start at index 0.. i checks index 0

	            
	    			for (int j = i+1; j< array.length; j++) { //j has to be one step above i at all times....  i + 1 this check the next index after i
	    				//this inner loop will check the whole array with j and compare it with the outter loop i
	               
	            	if (array[i] > array[j]) { // if index of i of the array is greater than j which is the second index next to i
	                    
	            		temp = array[i]; //put 10 in temp object because 10 is greater than
	                    array[i] = array[j]; //this is a swap
	                    array[j] = array[i]; //this is a swap again
	                    array[j] = temp;

	                }
	           
	    		}
	           
//	            System.out.println("after: --- " + i + "---iteration");
//	           
	            for (int n = 0; n<array.length;n++) {
	                System.out.println(array[n] + ",");

	            }

	            System.out.println("\n");
	        }

	    }

	
	 
	 public static void sortingHashMap() {
		 
		 Map<String,Integer> map = new HashMap<String,Integer>();
		 
		 map.put("one", 1);
		 map.put("eight", 8);
		 map.put("nine", 9);
		 map.put("two", 2);
		 map.put("three", 3);
		 map.put("five", 5);
		 map.put("seven", 7);
		 map.put("ten", 10);
		 map.put("six", 6);
		 map.put("four", 4);

		 //
		 List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(map.entrySet());
		 
		 //sort by value
		 Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue()); 
			}
			
		});

		 System.out.println("Sorting by value");
		 for(Entry<String,Integer> item : list) {
			 System.out.println(item);
		 }
		 
		 
		//sort by key
		 Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey()); 
			}
			
		});
		 
		 System.out.println("\n");
		 
		 System.out.println("Sorting by key");

		 for(Entry<String,Integer> item : list) {
			 System.out.println(item);
		 }

		 
	 }
	 
	 
	 
}
