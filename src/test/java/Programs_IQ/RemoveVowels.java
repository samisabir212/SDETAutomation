package Programs_IQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveVowels {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1, str2 = "";
		char ch, ch1;
		int i, len;
		System.out.println("Enter the Sentence:");
		str1 = br.readLine();
		len = str1.length();
		for (i = 0; i < len; i++) {
			ch = str1.charAt(i);
			ch1 = Character.toLowerCase(ch);
			switch (ch1) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			default:
				str2 = str2 + ch;
			} 
		}
		
		System.out.println("Modified string without vowels:" + str2);

	}

}
