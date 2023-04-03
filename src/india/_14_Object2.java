package india;

public class _14_Object2 {
	
	 int g=50;
	String l = "Happy Java Day :-)";
	static int m=100;
	
	public static void main(String[] args) {
		
		_14_Object2 h = new _14_Object2();
		
		System.out.println(h.l);
		
		System.out.println(m);
		System.out.println(_14_Object2.m);
		
		System.out.println(h.g);
		
		System.out.println();
		System.out.println();
		
		System.out.println(_13_Object.c);//static members can be called with 
		                                 //classname in another class.
/*		_13_Object d = new _13_Object ();
		
		System.out.println(d.s);
		System.out.println(d.c);
*/		
//		int x = _13_Object.c;
//		int a = h.g;

	}

}
