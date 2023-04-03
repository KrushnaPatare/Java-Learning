package pattern;

public class TriangleBshape {

	public static void main(String[] args) {
		
		for (int a=1;a<=5;a++)
		{   
			
			for (int j=1;j<=a;j++)
				
				{
				System.out.print("*");
				}
			System.out.println();
		}

		for (int a=1;a<=4;a++)
		{
			for (int b=5-a;b>=1;b--)
			{
				System.out.print("*");
			}
			System.out.println();
			}
		for (int a=1;a<=5;a++)
		{   
			
			for (int j=1;j<=a;j++)
				
				{
				System.out.print("*");
				}
			System.out.println();
		}

		for (int a=1;a<=4;a++)
		{
			for (int b=4;b>=a;b--)
			{
				System.out.print("*");
			}
			System.out.println();
			}

	
	}

}
