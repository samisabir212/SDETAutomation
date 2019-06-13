package Programs_IQ;

public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {

		removeDupChars("aaDDff  sssssss y");
	}

	static void removeDupChars(String s) {
		int l = s.length();
		int c;
		String org = s, s1 = "";

		for (int i = 0; i < (l - 1); i++) {

			s1 = s.substring(0, i + 1);
			c = 0;

			for (int j = i + 1; j < l; j++) {

				if (s.charAt(i) == s.charAt(j)) {
					c++;
					continue;

				} else {

					s1 = s1 + s.charAt(j);
				}

			}

			s = s1;
			s1 = "";

			if (c > 0)
				l -= c;

		}
		System.out.println("Original String:" + org);

		System.out.println("String after removing duplicates: " + s);

	}

}
