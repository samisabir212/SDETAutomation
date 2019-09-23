package Programs_IQ;

import java.util.Arrays;

public class PushZerosToEndOfArray {

	public static void main(String[] args) {

		int[] numArray = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
		int i = 0;

		// create a new array length of existing array
		int[] newNumArray = new int[numArray.length];
		System.out.println(Arrays.toString(newNumArray));

		// use for loop and copy all elements which are Non-Zero in new array
		for (int j = 0; j < numArray.length - 1; j++) {
			
			System.out.println(numArray[j]);
			if (numArray[j] != 0) {
				newNumArray[i] = numArray[j];
				i++;
			}
		
		}

		// print new array
		System.out.println(Arrays.toString(newNumArray));
	}

}