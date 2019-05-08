package Programs_IQ;

public class _36FIndPosition {

	public static void main(String[] args) {
		//print out only "how is work?" from this string"
		
		String s = "hi how r u doing, how is work? Keep in touch";
       
		//System.out.println(s.substring(18, 30));
        
		String[] stringToLookFor = s.split("hi how r u doing, ");

		int leng =stringToLookFor.length;
		System.out.println(leng);
		System.out.println(stringToLookFor[1].toString());
		
		//stringToLookFor = stringToLookFor.split(" Keep in touch")[0];
		
		//System.out.println(stringToLookFor);
		
		
		//stringToLookFor = s.split("hi how r u doing, ")[1].split(" Keep in touch")[0];
		//System.out.println(stringToLookFor);


        
	}

}
