package Inheritance;

public class BMW extends Car{
	
	//Poly+morphism: method overloading (Compile Time) + method overriding(Run time)
	
	//Method Overriding: 
	@Override
	public void start(){
		System.out.println("BMW -- start");
	}
	
	public void theftSafety(){
		System.out.println("BMW -- theftSafety");
	}
	
	
	

}
