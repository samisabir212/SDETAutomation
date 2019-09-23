package JavaSessions;

public class DataTypes {
	
	//hey this is my java code and im so happy
	//May Batch - Data Types: Naveen
	public static void main(String[] args) {

		//data types sessions
		//1. integer family:
		//a. int: size in Bytes: 4 bytes
		//1 byte = 8 bits
		//Range: -2147483648 to 2147483647
		int i = 10;
		i = 20;		
		int j = -10;
		int k = 0;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println(i*j);
		
		//b. short: 2 bytes
		//Range: -32768 to 32767
		short p = 10;
		short p1 = 3000;
		
		//c. byte: 1 byte
		//Range: -128 to 127
		byte b1 = 50;
		byte age = 7;

		//d. long: 8 bytes = 64 bits
		long population = 1250000000;
		long distance = 1222222222;
		
		System.out.println(population);
		
		//2. double:
		//a. float : 4 bytes (6-7 decimal digits)
		float f1 = 12.33f;
		float f2 = (float)34.55;
		//b. double: 8 bytes (15 digits of decimal)
		double d1 = 12.33;
		
		//3. Character:
		char c1 = 'a';
		char c11 = 'b';

		char c2 = '1';
		char c3 = '$';
		
		System.out.println(c1+c11); //97+98 = 195
		//a-z : 97-122
		//A-Z : 65-90
		//0-9: 48-57
		
		//4. boolean: T/F
		boolean flag1 = true;
		boolean flag2 = false;
		
		
		//5. String: is not a data type: its a default class in Java
		String s1 = "hello world";
		String s2 = "hey this is my java code";
		String s3 = "1000";
		String s4 = "12.33";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(1000);
		System.out.println(12.33);
		System.out.println(100+200);
		System.out.println(s1+s2);
		
		System.out.print("Naveen");
		System.out.println("Selenium");
		
		System.out.println(s1 + "\t" + s2);
		System.out.println(s1 + "\n" + s2);

	}

}
