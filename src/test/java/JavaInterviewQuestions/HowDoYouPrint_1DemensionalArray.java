package JavaInterviewQuestions;

import java.util.Arrays;

public class HowDoYouPrint_1DemensionalArray {
	
	
	public static void main(String[] args) {
		
		int marks5[] = { 25, 30, 50, 10, 5 };
		System.out.println(marks5); //[I@6db3f829
		System.out.println(marks5.toString()); //[I@6db3f829

		System.out.println(
		Arrays.toString(marks5));//[25, 30, 50, 10, 5]
		
	}

}
