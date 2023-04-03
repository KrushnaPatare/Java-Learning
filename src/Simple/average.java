package Simple;

public class average {

	
	
	
	public static void main(String[] args) {
		
		int marks [] = {85,77,94,84,89};
		
		int len = marks.length;
		
		int sum = 0 ;
		
		for (int ind=len-1;ind>=0;ind--)
		{
			sum = sum + marks[ind];
		}
		
		int avg = sum / len ;
		
		System.out.println(avg);
	}

}
