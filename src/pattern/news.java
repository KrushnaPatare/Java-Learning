package pattern;

public class news {

	public static void main(String[] args) {
		
		for (int a=1;a<=5;a++)//1
		{
			for (int b=1;b<=5-a;b++)//4321
			{
				System.out.print(" ");
			}
			
			for (int c=1;c<=a;c++)	//12345
			{ 
				System.out.print("* ");
			}
			System.out.println();
			
		}	
	}

}
