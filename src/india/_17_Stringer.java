package india;

public class _17_Stringer {

	public static void main(String[] args) {
		
		String s = "Velocity";
		String i = "velocity";
		
		System.out.println("1");
		
		char c = s.charAt(5);
		System.out.println(c);          // to get particular  character from string
		System.out.println(s.charAt(3));// to get char from string
		System.out.println();
		
		
		
		System.out.println("2");
		int g = s.length();
		System.out.println(g);
		System.out.println(s.length()); // to get string length
		System.out.println();
		
		
		
		System.out.println("3");
		
		boolean l = s.contains("city");
		System.out.println(l);
		System.out.println(s.contains("city"));//to check if particular character sequence is present
		System.out.println(s.contains("velocity"));
		System.out.println();
		
		
		
		System.out.println("4");
		
		System.out.println(s.equals(i));//to compare to strings
		System.out.println(s.equals("velocity"));
		System.out.println();
		
		
		
		System.out.println("5");
		
		System.out.println(s.substring(3));//34567
		System.out.println(s.substring(5));//567
		System.out.println();
		
		
		
		System.out.println("6");
		
		System.out.println(s.substring(3,5));
		System.out.println(s.substring(2,6));
		System.out.println();
		
		
		
		System.out.println("7");
		String S1 =s.concat(" Katraj");
		String S2 = (S1.concat("Pune"));
		System.out.println(s.concat(" Katraj"));//adds string in first string
		System.out.println(s.concat("Pune"));
		System.out.println(S2);
		System.out.println();
		
		
		
		System.out.println("8");
		
		System.out.println(s.toLowerCase());//all characters are small
		System.out.println(s.toUpperCase());//all characters are capital
		System.out.println();
		
		
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = new String("Hello World");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println();
		
		boolean k = s1.equalsIgnoreCase(i);
		System.out.println(k);
		
		
		s.valueOf(g);
		s.trim();
	}

}
