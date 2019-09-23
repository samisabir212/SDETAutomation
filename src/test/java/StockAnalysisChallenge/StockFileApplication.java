package StockAnalysisChallenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StockFileApplication {

	public static void main(String args[]) throws IOException {
		
		StockFileReader fr = new StockFileReader("/Users/sami/Desktop/table.csv");

		System.out.println(fr.getHeaders());
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());

		System.out.println("DataResult list that is of type hashmap :" + dataResult);
	
		int counter = 0;
		
		for(HashMap<String, Double> d : dataResult) {
			
			System.out.println(counter+" : "+ d);
			counter++;
		}
		System.out.println(dataResult.size());
	}

	/**
	 * Complete the method body so that it returns the given structure needed to
	 * populate the data field in the StockFileData class.
	 * 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines) {
		List<HashMap<String, Double>> dataResult = new ArrayList<>();

		for (String line : lines) {

			String values[] = line.split(",");
			int counter = 0;
			HashMap<String, Double> headerValuesMap = new HashMap<>();

			for (String value : values) {

				double doubleValue = Double.parseDouble(value); // converts the value from string to double

				// then populate map with key will be each one of the headers
				headerValuesMap.put(headers.get(counter), doubleValue);
				counter++;

			}

			dataResult.add(headerValuesMap);
		}

		return dataResult;
	}

}
