package Programs_IQ;

public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {

		removeDupChars("aaDDff  sssssss y");
	}

	static void removeDupChars(String s) {

		int l = s.length();
		int c;
		String org = s;
		String s1 = "";

		for (int i = 0; i < (l - 1); i++) {//loop is going backwards.

			s1 = s.substring(0, i + 1);//begginingIndex, endIndex remove everything before BegIndex and remove everything after LastIndex
			c = 0;

			for (int j = i + 1; j < l; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					System.out.println("found a match at s[i] : "+"Index is : "+c+s.charAt(i));
					c++;
					continue;

				} else {

					s1 = s1 + s.charAt(j);//assign s1 the character at index s[j]
					System.out.println("s1 is currently : "+ s1);
				}

			}

			s = s1;
			s1 = "";

			if (c > 0)
				l -= c;//decrement then assign c to l

		}
		System.out.println("Original String:" + org);

		System.out.println("String after removing duplicates: " + s);

	}

}
