package InterfaceConcepts;

public interface USMedical extends WHOInterface{
	
	int min_fee = 10;
	
	public void cardioServices();
	
	public void ambulanceServices();
	
	public void childCareServices();
	
	public void OutPatientServices();

	//can not create the object of Interface
	//no method body -- only method declaration -- only method prototype
	//no static method in interface
	//interface vars are static and final by default
	
	//after jdk1.8:
	default void display(){
		System.out.println("display method");
	}
	
	static void sendMail(){
		System.out.println("send mail method");
	}
	//static methods can not be overriden from parent to child
	//but can be overloaded
	
	
}
