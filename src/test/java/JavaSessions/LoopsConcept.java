package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//1. while loop:
		//1 to 10:
		int i = 1; //initialization
		while(i<=10){//conditional
			System.out.println(i);
			i++;//incremental/decremental
		}
		
		System.out.println("-----");
		//10 to 1:
		
		//2. for loop:
		//1 to 10:
		for(int k=1; k<=10; k++){
			System.out.println(k);
		}
		
		System.out.println("-----");

		
		//0 2 4 6 8 10 -- even numbers:
		for(int e=0; e<=10; e=e+2){
			System.out.println(e);//0 2 4 6 8 10 
		}
		
		System.out.println("-----");

		//1 3 5 7 9 -- odd numbers:
		for(int o=1; o<=10; o=o+2){
			System.out.println(o);//1 3 5 7 9
		}
		
		//0 5 10 15 20
		System.out.println("-----");

		//break:
		for(int marks=1; marks<=10; marks++){
			System.out.println(marks);
				if(marks==5){
					System.out.println("Average Score");
					break;
				}
		}
		System.out.println("-----");

		
		//nested loops:
		for(int p=1; p<=9; p++){
			for(int d=1; d<=9; d++){
				System.out.print(p+""+d+" "); //11 12 13 14 15  21 22 23 24 25
			}
			System.out.println();
		}
		
		
		
		
	}

}
