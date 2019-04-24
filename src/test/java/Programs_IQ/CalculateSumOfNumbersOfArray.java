package Programs_IQ;

import org.testng.annotations.Test;

public class CalculateSumOfNumbersOfArray {
	
	public static int calculateSumOfNumbers(){


		int[] a = {10,20,30,40};

		int sum = 0;

		for(int arr:a){
			sum += arr;
		}

		return sum;
	}
	

	
	
	@Test()
	public void testCalcSumOfArray() {
		
		int sum = calculateSumOfNumbers();
		System.out.println("sum of numbers in array is : "+ sum);
		
	}

}
