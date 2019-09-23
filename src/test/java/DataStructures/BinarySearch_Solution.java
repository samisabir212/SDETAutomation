package DataStructures;

import java.util.Arrays;

public class BinarySearch_Solution {

	public static void main(String[] args) {
		
		int [] a= {1,4,2,8,3,5,10,7,6,9};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int y=binarySearch(a, 6);
		
		System.out.println("found a match @ index : "+ y);
		
		System.out.println("number i found is : "+ a[y]);
		
		

	}

	public static int binarySearch(int[] a, int x) {

		int p = 0;
		int r = a.length - 1; // returns last slot of the array

		while (p <= r) {

			int q = (p + r) / 2; // find mid point

			if (x < a[q]) { // if x is less than the mid point q, then r shouldnt point to the last slot..
				r = q - 1; // it should be on the left side of the array
			}

			else if (x > a[q]) {
				p = q + 1;
			}

			else {

				return q;

			}

		}
		return -1;

	}

}
