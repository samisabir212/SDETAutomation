package JavaSessions;

public class StaticAndNonStaticConcept {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String a[]) {

		//how to call static methods/variables:
		// no need to create the object to access/call static methods and variables:
		//1. directly:
		System.out.println(age);
		getUserName();
		
		//2. call by class name:
		StaticAndNonStaticConcept.getUserName();
		
		//how to call non static methods/variable:
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		
		obj.login();
		
		System.out.println(obj.age);
		obj.getUserName();
		
	}
	
	
	public void login(){
		System.out.println("Login Method");
	}
	
	public static void getUserName(){
		System.out.println("get user name method");
	}
	
	
	
	
	
	

}
