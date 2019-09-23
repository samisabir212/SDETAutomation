package JavaSessions;

public class Company {
	
	private double salary;
	private String FinancialTerm;
	private String HRPolicies;
	
	public double stockPrice;
	
	public Company(){
		
	}
	
	public Company(double salary, String FinancialTerm, String HRPolicies){
		this.salary = salary;
	}

	//getter and setter:
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getFinancialTerm() {
		return FinancialTerm;
	}

	public void setFinancialTerm(String FinancialTerm) {
		this.FinancialTerm = FinancialTerm;
	}

	public String getHRPolicies() {
		return HRPolicies;
	}

	public void setHRPolicies(String hRPolicies) {
		this.HRPolicies = hRPolicies;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	
	private int calculateEmployeeSalary(int baseSalary, String designation){
		int bonus = 0;
		int freeFood = 0;
		int perks = 0;
		if(designation.equals("manager")){
			 bonus = 500;
			 freeFood = 300;
			 perks = 800;
		}
		else if(designation.equals("QA1")){
			 bonus = 100;
			 freeFood = 200;
			 perks = 500;
		} 
		
		else if(designation.equals("QA2")){
			 bonus = 300;
			 freeFood = 250;
			 perks = 700;
		} 
		
		int finalSalary = baseSalary+bonus+freeFood+perks;
		
		return finalSalary;
	}
	
	public int getEmployeeSalary(int baseSalary, String designation){
		return calculateEmployeeSalary(baseSalary, designation);
	}
	

	
}
