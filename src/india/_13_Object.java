package india;

public class _13_Object {
	
	int a=10;
	String s = "Happy India Day :-)";
	static int c = 20;

	public static void main(String[] args) {
		
		_13_Object d = new _13_Object ();
		
		System.out.println(d.s);
		System.out.println(d.a);
		System.out.println(_13_Object.c);// static members can be directly called 
		                        //which are in class but outside main method
		                         //without the help of object.
		
	}                      

}
