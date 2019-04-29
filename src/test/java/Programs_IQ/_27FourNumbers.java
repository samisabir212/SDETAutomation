package Programs_IQ;

public class _27FourNumbers {

	public static void main(String[] args) {

		int a=10, b=25, c=35, d=-10;
		
		int largest = Math.max(a,Math.max(b,Math.max(c,d)));
		
		
		int smallest = Math.min(a,Math.min(b, Math.min(c, d)));
		
		System.out.println("largest Number is " + largest);
		
		System.out.println("Smallest Number is " + smallest);
	}

}
