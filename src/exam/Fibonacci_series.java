package exam;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		for(int x=1;x<=5;x++) {
			
		int c = a+b;
		a=b;
		b=c;
		System.out.print(" ");
		System.out.print(c);
		}

	}

}
