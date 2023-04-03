package exam;

public class StringReverse {

	public static void main(String[] args) {

		String S="Hello";
		
		for(int a=S.length()-1;a>=0;a--)
		{
			System.out.print(S.charAt(a));
			
		}
		System.out.println();
		
		String z="Naruto";
		String rev="";
		int len=z.length();
		
		for(int b=len-1;b>=0;b--)
		{
			rev=rev+z.charAt(b);
		}
		System.out.print("The reverse of "+z+" is "+rev);
	}

}
