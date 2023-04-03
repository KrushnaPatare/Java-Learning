package pattern;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		int a=1;
		
		while(a<=10)
		{  
			if (a%2==0)
			{ System.out.println("The number is even: " +a);}
			else 
			{System.out.println("The number is odd: " +a);}
			a++;
		}

	}

}
