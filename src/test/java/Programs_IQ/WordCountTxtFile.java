package Programs_IQ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordCountTxtFile {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "src/resources/java/Files/wordcount.txt";
		countWordsInTxtFile(path);
		
	}
	
	
	
	public static void countWordsInTxtFile(String FilePath) throws FileNotFoundException {
		
		//use hashmap to store words
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//Use scanner class to read a text file
		Scanner txtFile = new Scanner(new File(FilePath));
		
		while(txtFile.hasNext()) {
			
			String word = txtFile.next();
			
			if(map.containsKey(word)) {
				//increase the count to 1 if this word has already existed in the map
				int count = map.get(word) + 1;
				map.put(word, count);
			}else {
				//else if its not already in the map then put the word in the map and give it an occurrence count of 1
				map.put(word,1);
				
			}
		}
		
		txtFile.close();
		
		for(Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry);
			
		}
		
	}
	
	
}
