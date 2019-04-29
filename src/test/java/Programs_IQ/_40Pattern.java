package Programs_IQ;

public class _40Pattern {

	public static void main(String[] args) {

		
		String n = "*";

		for (int i = 0; i <= 6; i = i + 2) {

			for (int j = 0; j <= i; j++) {

				System.out.print(n);

			}
			
			System.out.println(" ");
		}
		

	}
}