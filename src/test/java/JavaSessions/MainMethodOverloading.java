package JavaSessions;

public class MainMethodOverloading {
	
	
	public static void main(String[] args) {
		System.out.println("A");
		
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main();
		obj.main(10);
		
	}

	public static void main() {
		System.out.println("B");

	}
	
	
	public static void main(int a) {
		System.out.println("C");
		System.out.println(a);

	}
	
	
	

}
