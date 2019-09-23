package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

		
		String str = "Hey I am automation king";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(4));
		
		System.out.println(str.charAt(23));
		//System.out.println(str.charAt(24));

		System.out.println(str.indexOf('I'));
		System.out.println(str.indexOf('a'));

		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		
		System.out.println(str.indexOf("king"));
		
		System.out.println(str.indexOf("hello"));//-1

		String user = "Welcome Naveen";
		if(user.indexOf("Naveen")>=0){
			System.out.println("Naveen is available");
		}else{
			System.out.println("TC is failed");
		}
		
		//trim:
		String s1 = "     hello world     ";
		System.out.println(s1.trim());
		
		String fullName = "Tom Peter ";
		
		//replace:
		String s2 = "Hello World";
		System.out.println(s2.replace(" ", ""));
		
		String dob = "12-12-1990"; //12/12/1990
		System.out.println(dob.replace("-", "/"));
		
		//subString:
		String str1 = "you user id is naveenautomationlabs";
		System.out.println(str1.substring(15, str1.length()));
		System.out.println(str1.substring(0, str1.length()));
		System.out.println(str1.substring(15));
		String messg = "welcome admin user";
		//System.out.println(messg.substring(8, endIndex));
		
		//comparison:
		String st1 = "The rain has started here";
		String st2 = "The rain Has started here";

		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		System.out.println(st1==st2);
		
		//upper and lower cases:
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		
		//split:
		String lang = "Java-python-dotnet-ruby";
		String language[] = lang.split("-");
		System.out.println(language[0]);
		for(int i=0; i<language.length; i++){
			System.out.println(language[i]);
		}
		
		String userDetails = "Tom;peter;25;9878;IBM;QA Eng;1000";
		String userValues[] = userDetails.split(";");
		for(int i=0; i<userValues.length; i++){
			System.out.println(userValues[i]);
		}

		String t1 = "xXHelloXxWorldXX";
		String t2[] = t1.split("X");
		System.out.println(t2[0]);
		System.out.println(t2[1]);
		System.out.println(t2[2]);

		
		
	}

}
