package Simple;

public class ClassB {
	
	public void Test() {
		System.out.println("classB");
	}
	
	
	public static void sample() {
		System.out.println("I am static.");
	}

	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		obj.Test();
		
       ClassB.sample();
	}

}
