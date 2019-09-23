package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//create the object of ArrayList: new keyword
		//ArrayList is default class
		//it stores the values on the basis of indexing/ordering -- order based collection
		//dynamic in nature
		
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//physical size of the arraylist
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("test");//5
		ar.add(12.33);//6
		
		System.out.println(ar.size());

		System.out.println(ar.get(2));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(7));//IndexOutOfBoundsException

		//remove:
		ar.remove(4);
		System.out.println(ar.get(4));
		System.out.println(ar.size());
		
		//how to print all the values from ArrayList:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//Generics in ArrayList:
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("test");
		
		ArrayList<String> studentsList = new ArrayList<String>();
		studentsList.add("Sam");
		studentsList.add("Mayur");
		
		
		ArrayList<Object> EmployeeList = new ArrayList<Object>();
		EmployeeList.add("Atif");
		EmployeeList.add(25);
		EmployeeList.add('m');
		EmployeeList.add(true);
		EmployeeList.add(34.55);
		
		
		ArrayList<Object> MedicalReportList = new ArrayList<Object>();

		MedicalReportList.add("Tom");
		MedicalReportList.add("O+");
		MedicalReportList.add('m');
		MedicalReportList.add(12.3);
		
		
		
		
	}

}
