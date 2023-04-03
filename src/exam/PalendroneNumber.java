package exam;

public class PalendroneNumber {

	public static void main(String[] args) {
		
		int num=2002;
		int temp=num;
		int sum=0;
		int ln;
		
		while(num>0)
		{
			 ln=num%10;
			 sum=(sum*10)+ln;
			 num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Number "+temp+" is palendrone.");
		}

		if(temp!=sum)
		{
			System.out.println("Number "+temp+" is not palendrone.");
		}

	}

}
