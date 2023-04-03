package pattern;

public class Diva {

	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++)
		{ 
			for (int b=1;b<=5-a;b++)
			{
				System.out.print(" ");
			}
			
			for (int c=1;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		for (int a=1;a<=4;a++)
		{  
			for (int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			
			for (int c=4;c>=a;c--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
