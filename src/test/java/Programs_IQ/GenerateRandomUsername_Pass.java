package Programs_IQ;

import java.util.Random;

import org.testng.annotations.Test;

public class GenerateRandomUsername_Pass {

	public static String generateRandomString(String text) {
		String mychars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuildr = new StringBuilder();
		Random rnd = new Random();
		while (stringBuildr.length() < 8) { // length of the random string.
			int index = (int) (rnd.nextFloat() * mychars.length());
			stringBuildr.append(mychars.charAt(index));
		}

		String characters = stringBuildr.toString();
		
		StringBuilder stringBuilder = new StringBuilder(text);

		String randomString = stringBuilder.append(characters).toString();

		return randomString;

	}
	
	
	
	
	
	@Test(enabled = true)
	public void testGenerator() {
		
		String randomUserName = generateRandomString("USER");
		String randomPassword = generateRandomString("password");

		System.out.println("randomUser : "+randomUserName);
		System.out.println("randomPass : "+ randomPassword);
	}
	
	
}
