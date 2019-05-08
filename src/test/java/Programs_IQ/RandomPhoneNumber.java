package Programs_IQ;

import java.text.DecimalFormat;
import java.util.Random;

import org.testng.annotations.Test;

public class RandomPhoneNumber {

	/**
	 * Write a program that creates and prints a random phone number of the form
	 * XXX-XXX-XXXX. Include the dashes in the output. Do not let the first three
	 * digits contains an 8 or 9 (but don't be more restrictive than that), and make
	 * sure that the second set of three digits is no greater than 742.
	 */

	public static void main(String[] args) {
		
		
	        DecimalFormat df1 = new DecimalFormat("000");
	        DecimalFormat df2 = new DecimalFormat("0000");
	        Random random = new Random();

	        int first = random.nextInt(8);
	        int second = random.nextInt(8);
	        int third = random.nextInt(8);
	        int middleThree = random.nextInt(743);
	        int lastFour = random.nextInt(5000);

	        System.out.println(first + "" + second + "" + third + "-"
	                + df1.format(middleThree) + "-" + df2.format(lastFour));

	        
	        
	        
	    }
		
	
		
	

}
