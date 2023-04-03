package Simple;

public class ClassA {

	public void Test() {
		System.out.println("classA");
	}
	
	public void demo(int a) {
		System.out.println("Hello Int");
	}
	
	public void demo(char B) {
		System.out.println("Hello Char");
	}
	
	public void demo(String S) {
		System.out.println("Hello String");
	}
	
	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.demo("S");

	}

}
