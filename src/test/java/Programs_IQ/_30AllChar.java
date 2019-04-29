package Programs_IQ;

public class _30AllChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p =  "peoplentech";
		String p1 = "p";
		String e = "e";
		String o = "o";
		String l = "l";
		String n = "n";
		String t = "t";
		String c = "c";
		String h = "h";
		
		int index = p.indexOf(p1);
		while (index >= 0) {
		    System.out.println(index);
		    index = p.indexOf(p1, index + 1);
		   System.out.println("---------");
		    index = p.indexOf(e, index + 1);
		    System.out.println("---------");
		    index = p.indexOf(l, index + 1);
		    System.out.println("---------");
		    index = p.indexOf(o, index + 1);
		    System.out.println("---------");
		    index = p.indexOf(n, index + 1);
		    System.out.println("---------");
		    index = p.indexOf(t, index + 1);
		    System.out.println("---------");
		    index = p.indexOf(c, index + 1);
		    System.out.println("---------");
		    index = p.indexOf(h, index + 1);
		    
		    
		}
	}

}
