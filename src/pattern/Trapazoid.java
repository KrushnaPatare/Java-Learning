package pattern;

public class Trapazoid {

	public static void main(String[] args) {
		
		
		for (int a=1;a<=8;a++)
		{
		   
			for (int b=2;b<=a;b++)
		   {
			   System.out.print(" ");
		   }
		
			
		   for (int c=16;c>=a;c--)
		   {
			   System.out.print("* ");
		   }
		   
		   
		   System.out.println();
		   
		}
		
	}

}
