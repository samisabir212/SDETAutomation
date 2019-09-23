package JavaSessions;

public class ConcatenationConcept {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 34.33;
		
		System.out.println(a+b);
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(x+y);
		
		System.out.println(x+a);
		System.out.println(b+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(c+x+y+d);
		
		System.out.println(x+y+c+d+a+b);
		
		System.out.println("the value of a is: "+a);
		
		System.out.println("the sum of a and b is: " + (a+b));
		
		int total = 100;
		System.out.println("total marks are : "+ total);
		
		String title = "Google";
		System.out.println("google page title is: "+ title);
		
		int tax = 50;
		int totalAmount = 1000;
		System.out.println("the gross amount is: "+ (totalAmount+tax));
		
	}

}
