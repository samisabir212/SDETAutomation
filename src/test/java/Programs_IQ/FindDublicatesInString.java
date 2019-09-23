package Programs_IQ;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindDublicatesInString {
	
	
	
	public static void main(String[] args) {
		
		
		String str = "Corooooona908243klsl";
		
		System.out.println(str);
		
		LinkedHashMap<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
	
	
		char arr[] = str.toCharArray();
		
		
		for(int i = 0; i<arr.length; i++) {
			
			
			System.out.println(arr[i]);
		
			if(Character.isAlphabetic(arr[i])) {
				
				
				if(charMap.containsKey(arr[i])) {
					
					charMap.put(arr[i], charMap.get(arr[i])+1);
					
				}else {
				
					charMap.put(arr[i], 1);
						
				}
						
							
			}else {
				
				System.out.println("character not found....");
			}
			
		}
		
		for(Entry<Character,Integer> e:charMap.entrySet()) {
			
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		
	}
	


}
