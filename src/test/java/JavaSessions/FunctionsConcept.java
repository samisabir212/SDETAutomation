package JavaSessions;

import java.util.ArrayList;

public class FunctionsConcept {
	
	//hidden constructor

	public static void main(String[] args) {

		FunctionsConcept obj1 = new FunctionsConcept();

		FunctionsConcept obj2 = new FunctionsConcept();
		FunctionsConcept obj3 = new FunctionsConcept();
		FunctionsConcept obj4 = new FunctionsConcept();

		FunctionsConcept obj = new FunctionsConcept();
		obj.test();
		String n1 = obj.getTrainerName();
		System.out.println(n1);

		int n2 = obj.getStudentAge();
		System.out.println(n2);

		int total = obj.getFinalBillAmount();
		System.out.println(total);

		System.out.println(obj.isUSCitizen());

		int sum1 = obj.sum(10, 20);
		System.out.println(sum1);

		int sum2 = obj.sum(40, 50);
		System.out.println(sum2);

		String capitalCity = obj.getCapitalCity("China");
		System.out.println(capitalCity);

		int marks = obj.studentMarks("Nazneen");
		System.out.println(marks);

		ArrayList ar = obj.getScoreCard("Afridi");
		System.out.println(ar);
		
		ArrayList ar1 = obj.getScoreCard("Kohli");
		System.out.println(ar1);

		String places[] = obj.getCountryTopFourVisitingPlaces("India");
		for(int i=0; i<places.length; i++){
			System.out.println(places[i]);
		}
		
		String places1[] = obj.getCountryTopFourVisitingPlaces("USA");
		for(int i=0; i<places1.length; i++){
			System.out.println(places1[i]);
		}
	}

	// 1. No input and no return:
	// void -- can not return any value
	public void test() { // 0 input param
		System.out.println("test method");
	}

	// 2. no input but some return:
	public String getTrainerName() {
		String name = "Naveen";

		return name;
	}

	public int getStudentAge() {
		int age = 25;
		return age;
	}

	public int getFinalBillAmount() {
		int foodbill = 200;
		int cocktails = 500;
		int finalAmount = foodbill + cocktails;

		return finalAmount;
	}

	public boolean isUSCitizen() {
		boolean flag = false;
		String name = "Naveen";
		if (name.equals("Naveen")) {
			System.out.println("Naveen is US citizen");
			flag = true;
		}
		return flag;
	}

	// 3. some input and some return:
	public int sum(int a, int b) {// 2 params
		System.out.println("Sum method");
		int c = a + b;
		return c;
	}

	public String getCapitalCity(String countryName) {

		if (countryName.equals("India")) {
			return "New Delhi";
		} else if (countryName.equals("USA")) {
			return "Washington DC";
		} else if (countryName.equals("Turkey")) {
			return "Ankara";
		} else if (countryName.equals("Italy")) {
			return "Rome";
		} else {
			System.out.println(countryName + " : no country is defined");
		}

		return null;
	}

	public int studentMarks(String studentName) {
		System.out.println("student name is: " + studentName);

		if (studentName.equals("Naveen")) {
			return 50;
		}

		else if (studentName.equals("Gulnaz")) {
			return 90;
		}

		else if (studentName.equals("Nazneen")) {
			return 100;
		} else {
			System.out.println(studentName + " is not found");
		}

		return 0;

	}

	public ArrayList getScoreCard(String playerName) {
		System.out.println("player name is: " + playerName);
		ArrayList ar = new ArrayList();
		if (playerName.equals("Kohli")) {
			ar.add(100);
			ar.add(50);
			ar.add(200);
			ar.add(10);
			ar.add(6);
		} else if (playerName.equals("Afridi")) {
			ar.add(150);
			ar.add(100);
			ar.add(150);
			ar.add(8);
			ar.add(9);
		} else if (playerName.equals("Dhoni")) {
			ar.add(50);
			ar.add(50);
			ar.add(100);
			ar.add(3);
			ar.add(2);
		}
		return ar;
	}

	public String[] getCountryTopFourVisitingPlaces(String countryName) {
		
		System.out.println("Top four places in country: "+ countryName);
		
		if (countryName.equals("USA")) {
			String places[] = { "LA-Hollywood", "Vegas-Casino", "San Diego - DisneyLand", "NY - Niagara Falls" };
			return places;
		} 
		else if (countryName.equals("India")) {
			String places[] = { "Agra-Taj Mahal", "New Delhi-Kutub Minar", "Jaipur - Palace",
					"Mumbai - Gateway of India" };
			return places;
		}
		return null;
	}
	


}
