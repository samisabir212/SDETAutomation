package Programs_IQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class FindDuplicatesInArrayList {

	@Test(enabled = true)
	public void testFindDupsInArrayList() {

		List<String> sportsList = new ArrayList<String>();

		sportsList.add("baseball");
		sportsList.add("soccer");
		sportsList.add("basketball");
		sportsList.add("tennis");
		sportsList.add("basketball");
		sportsList.add("football");

		Iterator itr = sportsList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		countDups(sportsList);

	}

	public void countDups(List<String> list) {

		HashMap<String, Integer> sportsMap = new HashMap<String, Integer>();

		for(int i = 0;i<list.size();i++) {
			
			if(sportsMap.containsKey(list.get(i))) {
					
				sportsMap.put(list.get(i),sportsMap.get(list.get(i))+1);
				
			}else {
				
				sportsMap.put(list.get(i), 1);

			}
		}
		
		
		
		for(Entry<String, Integer> entry : sportsMap.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}
	

}