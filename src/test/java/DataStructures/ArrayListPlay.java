package DataStructures;

import java.util.ArrayList;

public class ArrayListPlay {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Double> numbers=new ArrayList<Double>(); 
		numbers.add(0.1);
		numbers.add(0.2);
		numbers.add(0.3);
		numbers.add(0.4);
		numbers.add(0.5);
		
		
		for(int i = 0; i<numbers.size(); i++) {
			
			System.out.println("number : "+ numbers.get(i));
			
			String Status = null;
			if(numbers.get(i)==0.3) {
				
				Status = "Passed";
				System.out.println("Yes i found 0.3 in numbers array list : "+ Status);
			}else {
				
				Status = "Failed";
				System.out.println("No i did not find 0.3 in numbers array list : "+ Status);

				
			}
		}
		
		
		
		ArrayList<String> grocerieList = new ArrayList<String>();
		
		grocerieList.add("cheese");
		grocerieList.add("milk");
		grocerieList.add("beer");
		grocerieList.add("steak");
		
		grocerieList.remove(2);
		grocerieList.add(2, "tomatoes");
		
		System.out.println(grocerieList);

	
	}

}
