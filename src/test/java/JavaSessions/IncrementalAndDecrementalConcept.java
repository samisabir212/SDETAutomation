package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;//post increment
		
		System.out.println(i);//2
		System.out.println(j); //1
		
		int m = 1;
		int n = ++m;//pre increment
		
		System.out.println(m);//2
		System.out.println(n);//2
		
		int total = 100;
		int grossAmount = ++total;
		
		System.out.println(total);//101
		System.out.println(grossAmount);//101
		
		int p = 2;
		int q = p--; //post decrement
		System.out.println(p);//1
		System.out.println(q);//2
		
		int h = 2;
		int g = --h;//pre decrement
		System.out.println(h);//1
		System.out.println(g);//1
		
	}

}
