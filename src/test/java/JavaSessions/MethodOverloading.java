package JavaSessions;

public class MethodOverloading {

	public static void main(String[] args) {

		
				
	}
	
	public void search(){ //0 param
		System.out.println("search on the basis of product name");
	}
	
	public void search(String productName){//1 param
		System.out.println("search on the basis of product name");
	}
	
	public void search(String productName, String filter){//2 params
		System.out.println("search on the basis of product name");
	}
	
	public void search(String productName, double price){//2 params
		System.out.println("search on the basis of product name");
	}
	
	public void search(String productName, String sellerName, String location){//3 params
		System.out.println("search on the basis of product name");
	}
	
	

}
