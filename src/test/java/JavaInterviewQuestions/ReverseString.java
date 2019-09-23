package JavaInterviewQuestions;

public class ReverseString {

	
	
	public static void main(String[] args) {
		
		
		String reveresedString = reverseString("sami");
		
		System.out.println(reveresedString);
		

		
	}

	
	public static String reverseString(String str) {
		
		int len = str.length(); //1
		
		String rev = ""; //1
		
		for (int i = len - 1; i >= 0; i--) {
			
			rev = rev + str.charAt(i); // rev=m+u+i+n+e+l+e+S
		
		}//n -- 2+n == > n
		
		return rev;
	
	}
	
}
