package DataStructures;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPlay {
	
	
	
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> employees = new HashMap<Integer,String>();
		
		employees.put(4234, "Rick Flair");
		employees.put(4323, "tom hardy");
		employees.put(6434, "juice box joe");
		employees.put(2342, "Logic");
		employees.put(6342, "rumba tom jones");

		
		for(Entry<Integer,String> e : employees.entrySet()) {
			
			System.out.println("employee id : "+ e.getKey());
			System.out.println("Employee name : "+e.getValue());
			
		}
	}

}
