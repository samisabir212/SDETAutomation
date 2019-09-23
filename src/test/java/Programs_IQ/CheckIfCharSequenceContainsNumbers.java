package Programs_IQ;

public class CheckIfCharSequenceContainsNumbers {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(isNumeric("8712389"));
		System.out.println(isNumeric("jkad89102jkdha"));

		
	}
	
	
	public static boolean isNumeric(CharSequence charSequence) {
		
		
		int len = charSequence.length();
		
		boolean bool = true;
		for(int i = 0; i<len;i++) {
			
			if(Character.isDigit(charSequence.charAt(i))) {
				
				bool= true;
				
			}else {
				bool = false;
			}
			
		}
	
		
		return bool;
	}

}
