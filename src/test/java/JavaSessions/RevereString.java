package JavaSessions;

public class RevereString {

	public static void main(String[] args) {

		String str = "Selenium"; // muineleS

		System.out.println(reverseString(str));
		System.out.println(reverseString("level"));
		System.out.println(reverseString("A"));

		int i = 10112;
		String i1 = String.valueOf(i); //"100"
		System.out.println(reverseString(i1));
		
	}

	//Single String: O(1)
	//more than Single String: O(n)
	public static String reverseString(String str) {
		
		int len = str.length(); //1
		
		if(len==1){//1
			return str;
		}
		
		String rev = ""; //1
		for (int i = len - 1; i >= 0; i--) { //start at the end of the string
			rev = rev + str.charAt(i); // rev=m+u+i+n+e+l+e+S
		}//n -- 2+n == > n
		return rev;
	}

}
