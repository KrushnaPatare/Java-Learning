package india;

public class _06_IfElseCondition {

	public static void main(String[] args) {
		
		int pen=70;
		
		 if(pen<=50)
		 { 
			 System.out.println("Pen is affordable.");
		}
		 else 
		 {
			 System.out.println("Pen is  too expensive.");
		 }
		 
		 System.out.println();
	
         
		 int amount=250;
		 
		 if (amount%100==0) // use == when there is mod operator used. 
		 {
			 System.out.println("Ammount accepted");
		 }
		 else 
			 {
			 System.out.println("Enter valid amount");
	         }
	}

}
