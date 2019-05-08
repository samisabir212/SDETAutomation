package Programs_IQ;

import org.testng.annotations.Test;

public class Sorting {

	
	@Test()
	public void bubbleSort() {
		
		doBubbleSort();
		
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

	                }else {
	                	
	                	System.out.println("array[j] is "+ array[j] );
	                	System.out.println("array[i] is "+ array[i] );

	                	System.out.println("array[j] is greater than array[i], keep going");
	                	
	                	System.out.println("and j is currently : "+j);
	                }
	           
	    		}
	           
//	            System.out.println("after: --- " + i + "---iteration");
//	           
//	            for (int n = 0; n<array.length;n++) {
//	                System.out.println(array[n] + ",");
//
//	            }
//
//	            System.out.println("\n");
	        }

	    }

}
