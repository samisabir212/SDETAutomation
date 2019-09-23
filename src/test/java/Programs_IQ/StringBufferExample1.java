package Programs_IQ;

public class StringBufferExample1 {
	
	
	public static void main(String[] args) {
		
		//append s2 to s3 20 times
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";
		for (int i = 0; i < 20; ++i) {
		s3.append(s2);
		System.out.println(s3.toString());
		}
	}

}
