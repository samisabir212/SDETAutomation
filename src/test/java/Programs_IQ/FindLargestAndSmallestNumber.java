package Programs_IQ;

import org.testng.annotations.Test;

public class FindLargestAndSmallestNumber {
	
	
	@Test(enabled = true)
	public void testFindLargestAndSmallestNumber() {
		
		FindLargestAndSmallestNumber();
		
	}

	
	public static void FindLargestAndSmallestNumber() {
		
		int a[] = { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };

		//min and max will start at index 0 in the array
		int min = a[0]; //  assume first elements as smallest number
		int max = a[0]; //  assume first elements as largest number
		int counter = 0;
		for (int i = 1; i < a.length; i++) {  // start checking at index 1 of the array
			
			if (a[i] > max) { //34 > 23?
				max = a[i]; //true make max variable 34
			}else {
				System.out.println(a[i]+" isnt greater than "+ max);
			}
			
			if (a[i] < min) { //34 < 23?
				min = a[i];
			}else {
				
				System.out.println(a[i]+" isnt less than "+min);
			}
			
			counter++;
			System.out.println("iteration : "+counter);
			System.out.println("min is currently : "+ min);
			System.out.println("max is currently : "+max);
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}
	
}
