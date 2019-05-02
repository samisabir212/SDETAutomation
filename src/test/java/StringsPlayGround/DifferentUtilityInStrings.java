package StringsPlayGround;

public class DifferentUtilityInStrings {
	
	
	/**
	 * Getting inforommation form a string
	 */
	
	public static void main(String[] args) {
		String str = "abcdefghijk";
		System.out.println(str.charAt(2)); //prints a char - c
		System.out.println("ABCDEFGH".length());//8
		System.out.println("abcdefghij".toString()); //abcdefghij
		System.out.println("ABC".equalsIgnoreCase("abc"));//true
		System.out.println("abcdefghij".substring(3)); //cdefghij
		//All characters from index 3 to 6
		System.out.println("abcdefghij".substring(3,7)); //defg
	}
}
