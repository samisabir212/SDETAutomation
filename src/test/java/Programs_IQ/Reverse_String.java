package Programs_IQ;

import org.testng.annotations.Test;

public class Reverse_String {

	
	@Test(enabled = false)
	public void testReverseString1() {

		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1 = input1.reverse();

		// print reversed String
		System.out.println(input1);

	}
	
	
	
	@Test(enabled = false)
	public void testReverseString2() {

		  String word = "GeeksForGeeks"; 
		  
	        // convert String to character array 
	        // by using toCharArray 
	        char[] charArray = word.toCharArray(); 
	  
	        for (int i = charArray.length-1; i>=0; i--) 
	            System.out.print(charArray[i]);

	}
	
	
	
	
	@Test(enabled = true)
	public void testReverseString3() {

		String word = "caterpiller";
		String y = "";

		for(int i = word.length()-1; i >= 0; i--){ //start at the letter r and work your way down to index of zero 
		y=y + word.charAt(i);//<-- concat y which is empty string to the letter your at in the word string index.
		}
		System.out.println(word);
		System.out.println(y);
	}

}
