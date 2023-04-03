package Simple;

public class ClassC extends ClassB{
	
	public static void sample() {
		System.out.println("I am static but next.");
	}

	
	public static void main(String[] args) {
		
		ClassC.sample();
		
		ClassB.sample();
		
	}

}
