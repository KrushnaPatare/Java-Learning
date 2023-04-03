package pattern;

public class peti {

	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++)
		{
			for(int b=4;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		String S="Hello";
		
		for(int a=S.length()-1;a>=0;a--)
		{
			System.out.print(S.charAt(a));
			
		}
		
	}

}
