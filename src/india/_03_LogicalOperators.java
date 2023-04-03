package india;

public class _03_LogicalOperators {

	public static void main(String[] args) {
		
//Logical AND : && <-----> executes command when all conditions are true.
//Logical OR : ||  <-----> executes command when any one or more conditions are true.

		int price=10;
		int seating=5;
		boolean result =(price <=10 && seating <= 4);
		System.out.println(result);
		
		System.out.println();
		System.out.println();
		
		result =(price <=10 || seating <= 4);
		System.out.println(result);
	
	
	}

}
