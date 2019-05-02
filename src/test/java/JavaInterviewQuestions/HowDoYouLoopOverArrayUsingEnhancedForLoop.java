package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class HowDoYouLoopOverArrayUsingEnhancedForLoop {
	
	
	public static void main(String[] args) {
		
		int marks[] = {10,20,321,323};
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(31);
		nums.add(20);
		nums.add(12);
		nums.add(23123);


		
		for (int num: nums) {
			System.out.println(num);
			}
		
		for (int mark: marks) {
			System.out.println(mark);
			}
		
	}

}
