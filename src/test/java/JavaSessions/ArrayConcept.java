package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//two major limitations:
		//1. static array: size is fixed: to overcome this issue, we use dynamic arrays (ArrayList)
		//2. stores only similar types of values: to overcome this issue, we use Object Array or ArrayList
		
		//1. int array:
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		int LI = 0;
		int HI = i.length-1;
		System.out.println(LI);
		System.out.println(HI);
		
		//how to print all the value from an array:
		for(int k=0; k<i.length; k++){
			System.out.println(i[k]);
		}
		
		//2. double array:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=100;
		
		//3. String array:
		String s[] = new String[4];
		s[0]="Naveen";
		s[1]="Rohini";
		s[2]="Gulnaz";
		s[3]="Chetna";
		
		for(int counter=0; counter<s.length; counter++){
			System.out.println(s[counter]);
		}
		
		int marks[] = new int[10];
		
		int marks1[] ={10,20,30,40,50};
		System.out.println(marks1.length);
		System.out.println(marks1[3]);
		
		String employee[] = {"Raman", "Rupali", "Savita", "Arpit"};
		
		//Object Array:
		Object employeeData[] = new Object[5];
		
		employeeData[0] = "Tom";
		employeeData[1] = 25;
		employeeData[2] = 'm';
		employeeData[3] = 345.55;
		employeeData[4] = true;
		
		System.out.println(employeeData.length);
		
		for(int emp=0; emp < employeeData.length; emp++){
			System.out.println(employeeData[emp]);
		}
		
		
		String registrationData[] = {"Gulnaz", "Musa", "20", "10000", "gulnaz@gmail.com"};
		
		for(int rowNum = 0; rowNum<registrationData.length; rowNum++){
			System.out.println(registrationData[rowNum]);
		}
		
	}

}
