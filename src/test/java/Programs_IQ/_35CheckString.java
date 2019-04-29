package Programs_IQ;

public class _35CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "peoplntech";
        String str2 = "people";

        // The String to check the above two Strings to see
        // if they start with this value (Red).
        String startStr = "people";

        // Do either of the first two Strings start with startStr?
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        // Display the results of the startsWith calls.
        System.out.println( str1 + " starts with " +
             startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
             startStr + "? " + starts2);
	}

}
