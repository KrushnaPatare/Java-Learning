package india;

public class _07_IfElseIfCondition {

	public static void main(String[] args) {
		
		int apple=101;
		int peru=20;
		
		if (apple<=100)
		{	System.out.println("Lets buy 10 apples"); 
		}
		else if (peru<=50)
		{  System.out.println("Lets buy 2 kg peru");
		}
		else 
		{   System.out.println("Dont buy fruits & go to another shop");
		}
			
		System.out.println ();
		
		 //                       *HOMEWORK*
		
		/*marks>=90 A+
	    90>marks>80 A
		80>marks>70 B+
		70>marks>60 B
		60>marks>50 C
		50>marks>=40 D
		marks < 40 fail*/
		
		int marks = 35;
		
	
		  if(marks>90 && marks<=100)
		{
			  System.out.println("Your grade is A+");
		}
		  else if (marks>80 && marks<=90)
			  
		{
			  System.out.println("Your grade is A");
		}
		  else if (marks>70 && marks<=80)
			  
			{
				  System.out.println("Your grade is B+");
			}
		  
		  else if (marks>60 && marks<=70)
			  
			{
				  System.out.println("Your grade is B");
			}
		  
		  else if (marks>50 && marks<=60)
			  
			{
				  System.out.println("Your grade is C");
			}
		  
		  else if (marks>40 && marks<=50)
			  
			{
				  System.out.println("Your grade is D");
			}
		  
		  else if (marks<40 && marks>=0)
			  
			{
				  System.out.println("You are fail");
			}
		
		else 
		{
	      System.out.println("You have entered wrong number");	
		}
		
		
		
	}

}
