package JavaSessions;

public class Employee {

	String name;
	int age;
	String jobTitle;
	String empId;
	char gender;
	boolean isPermanent;

	// create constructor of Employee class:
	public Employee() {// 0 param or default constructor
		System.out.println("0 param constructor");
	}

	public Employee(String name) { // 1 param const
		System.out.println("1 param const");
		this.name = name;	
	}

	public Employee(String name, int age) { // 2 params const
		System.out.println("2 params const");
		this.name = name;
		this.age = age;
	}
	//all the class variables
	public Employee(String name, int age, String jobTitle, String empId, char gender, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.empId = empId;
		this.gender = gender;
		this.isPermanent = isPermanent;
		//this.classvar = localvar;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee("Naveen");
		Employee e3 = new Employee("Raman", 25);

		Employee e4 = new Employee("Tom", 25, "QA Manager", "1001", 'm', false);
		Employee e5 = new Employee("Ishtpreet", 29, "QA Director", "1005", 'm', true);
		Employee e6 = new Employee("Greeshma", 31, "Sr Manager", "1010", 'f', true);

		System.out.println(e4.name +" "+ e4.age + " " + e4.empId + " "+ e4.gender + " "+ e4.isPermanent + " " +e4.jobTitle );
		System.out.println(e5.name +" "+ e5.age + " " + e5.empId + " "+ e5.gender + " "+ e5.isPermanent + " " +e5.jobTitle );
		System.out.println(e6.name +" "+ e6.age + " " + e6.empId + " "+ e6.gender + " "+ e6.isPermanent + " " +e6.jobTitle );

	}

}
