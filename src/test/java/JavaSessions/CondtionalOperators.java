package JavaSessions;

public class CondtionalOperators {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 10;
		
		System.out.println(b>a);
		
		if(a >= b){
			System.out.println("a is greater than or equal to b");
		}
		else{
			System.out.println("b is greater than a");
		}
		
		if(true){
			System.out.println("PASS");
		}
		else{//dead code
			System.out.println("FAIL");
		}
		
		
		//< > <= >= ==
		int total = 100;
		int amount = 101;
		
		if(total == amount){
			System.out.println("Please pay the bill");
		}else{
			System.out.println("Please check the bill again");
		}
		
		// !=
		if(total != amount){
			System.out.println("previous amount is: "+ amount);
			amount = amount-1;
			System.out.println("the final amount is: "+ amount);
		}
		
		//String comparison:
		String actualTitle = "Google";
		String expectedTitle = "Google";
		
		if(actualTitle.equals(expectedTitle)){
			System.out.println("title is correct");
		}else{
			System.out.println("title is not correct");
		}
		
		int score = 90;
		int bonus = 0;
		int totalFee = 0;
		
		if(score==100){
			bonus = 100;
			totalFee = score - bonus;
			System.out.println("total fee is: "+ totalFee);
		}
		else if(score==90){
			bonus = 20;
			totalFee = score - bonus;
			System.out.println("total fee is: "+ totalFee);
		}
		
		//browser validation:
		String browser = "ie";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("launch google chrome");
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("launch firefox");
		}
		else if(browser.equalsIgnoreCase("safari")){
			System.out.println("launch safari");

		}
		else if(browser.equalsIgnoreCase("IE")){
			System.out.println("launch IE");
		}
		else if(browser.equalsIgnoreCase("Opera")){
			System.out.println("launch Opera");
		}
		else{
			System.out.println(browser + " browser name is not properly defined");
		}
		
		//WAP to find out the max number with three numbers are given:
		int x = 600;
		int y = 400;
		int z = 700;
		
		if(x>y && x>z){//true && false
			System.out.println("x is the greatest");
		}
		else if(y>z){//false
			System.out.println("y is the greatest");
		}
		else{
			System.out.println("z is the greatest");
		}
		
		
	}

}
