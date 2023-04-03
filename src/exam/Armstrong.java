package exam;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int sum=0;
		int lastno;
		while(num>0){
		 lastno=num%10;    //3,5,1
		sum= sum+(lastno*lastno*lastno );
	     num=num/10;   //15,1,0
		}
		if (temp==sum){
		System.out.println("The Armstrong number is "+temp);
		}
		else{
		System.out.println("It is not an Armstrong number.");
		}

	}

}
