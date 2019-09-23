package Programs_IQ;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		// isPalindromeString("noon");
//		isPalindromeString_anotherway();
		isPalindromeNumber(151);
	}

	public static void isPalindromeNumber(int num) {

		// num is the number variable to be checked for palindrome
		//mathematical way of checking for palindromeString
		
		int r = 0;
		int sum = 0;
		int temp;
		

		temp = num;
		
		while (num > 0) {
			r = num % 10; // getting remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("is a palindrome number ");
		else
			System.out.println("is not palindrome");
	}

	public static void isPalindromeString(String string) {
		//just reverse it and check..
		String t;

		t = string;

		StringBuffer reversestring = new StringBuffer(String.valueOf(string)).reverse();

		System.out.println(reversestring);

		if (t.contentEquals(reversestring)) {
			System.out.println("It is a PALINDROME");
		} else {
			System.out.println("It is NOT a PALINDROME");
		}

	}

	public static void isPalindromeString_anotherway() {

		String original;

		String reverse = "";

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string/number to check if it is a palindrome");

		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse)) {

			System.out.println("Entered string/number is a palindrome.");

		} else {

			System.out.println("Entered string/number isn't a palindrome.");

		}

	}

}
