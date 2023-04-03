package Simple;

public class RefernceComparision {
	
	
	
	public static void main(String[] args) {
		
		
		String S =new String("Hello");
		String s = new String("Hello");
		String ss = "Hello";
		
		String D ="Java";
		String d ="Java";

		System.out.println(S==s);
		
		System.out.println(D==d);
		
		System.out.println(S==ss);
}
}