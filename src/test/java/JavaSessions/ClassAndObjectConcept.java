package JavaSessions;

public class ClassAndObjectConcept {
	
	String name;
	int age;
	
	
	//class is a template/blueprint
	//object a physical entity which will take all the properties of class
	//object can hold only non static stuff
	//every object will have some ref name
	//we can also have objects without ref name

	public static void main(String[] args) {

		ClassAndObjectConcept obj = new ClassAndObjectConcept();
		
		ClassAndObjectConcept obj1 = new ClassAndObjectConcept();
		ClassAndObjectConcept obj2 = new ClassAndObjectConcept();
		ClassAndObjectConcept obj3 = new ClassAndObjectConcept();

		new ClassAndObjectConcept().getCountryName();
		String n = new ClassAndObjectConcept().name;
		
		ClassAndObjectConcept o1;
		o1=obj1;
		
	}

	
	public void getCountryName(){
		System.out.println("get country name");
	}
	
	
	
}
