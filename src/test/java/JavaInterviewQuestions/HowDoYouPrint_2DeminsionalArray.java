package JavaInterviewQuestions;

import java.util.Arrays;

public class HowDoYouPrint_2DeminsionalArray {

	
	public static void main(String[] args) {
		
		int[][] matrix3 = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(matrix3); //[[I@1d5a0305
		System.out.println(Arrays.toString(matrix3));//[[I@6db3f829, [I@42698403]
		System.out.println(Arrays.deepToString(matrix3));//[[1, 2, 3], [4, 5, 6]]//matrix3[0] is a 1D Array
		System.out.println(matrix3[0]);//[I@86c347
		System.out.println(Arrays.toString(matrix3[0]));//[1, 2, 3]
	}
}
