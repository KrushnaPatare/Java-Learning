package india;

public class _22_MerhodOverloading {
	
	public  void test () {
       System.out.println("Hello");}
	
	public  void test (int a) {
	       System.out.println("Ram Ram");}
	
	public  void test (char x) {
	       System.out.println("Namstey");}
	

	public static void main(String[] args) {
		
		_22_MerhodOverloading obj = new _22_MerhodOverloading();
		
		obj.test();
		obj.test(2);
		obj.test('a');
	}

}
