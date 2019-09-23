package JavaSessions;

public class TestCompany {

	public static void main(String[] args) {

		Company comp = new Company();
		comp.setSalary(100.33);
		System.out.println(comp.getSalary());
		
		int finalCTCQA1 = comp.getEmployeeSalary(1000, "QA1");
		System.out.println(finalCTCQA1);
		
		int finalCTCManager = comp.getEmployeeSalary(5000, "manager");
		System.out.println(finalCTCManager);
		
	}

}
