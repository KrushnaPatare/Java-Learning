 package Simple;

public class ClassD extends ClassC implements X,Y,Z{
	
	public void test() {
		System.out.println ("Test Completed");
	}
	public void demo() {
		System.out.println ("Demo Completed");
	}
		
		public void small() {
			System.out.println ("Small Completed");
			
	}
     int a=20;
	public static void main(String[] args) {
		
      ClassD o = new ClassD();
     o.test();
     o.demo();
      
	}

}
