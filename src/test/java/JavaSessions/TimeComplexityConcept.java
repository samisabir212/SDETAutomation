package JavaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		int i = 1; // O(1)
		System.out.println(i);
		
		int q = i+20; //O(1) -- Big O(1)
		
		int n=1000000;
		for(int k = 1; k<=n; k++){
			System.out.println(k);
		}
		//10 100 1000
		//n -- O(n)
		
		//1+n+n = 1+2n = 2n = n==> O(n)
		
		for(int p=1; p<=5; p++){
			for(int d=1; d<=5; d++){
				System.out.print(p+""+d+" "); //11 12 13 14 15  21 22 23 24 25
			}
			System.out.println();
		}
		
		//5 x 5 = 25 => m x n = mn if m = n ==> nxn = n^2 ==> O(n^2)
		//(1+n+n) x (1+n+n) ==> 1+2n x 1+2n ==> 2n x 2n ==> 4n^2 ==> n^2 ==> O(n^2)
		
		
		
	}

}
