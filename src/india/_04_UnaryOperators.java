package india;

public class _04_UnaryOperators {
	public static void main (String [] args) { 
		
		/* Unary operators: a++, ++a, a--, --a,-a,+a.
		
		a++, ++a <----->     according to position of '++',
		                     first print 'a' then +1 or +1 then print 'a',
		                     any other command than print can also be used.
		a--, --a <----->     same as above.
		-a <------>    changes the sign of operand.
		+a <------>    does not changes the sign of operand.(It is not that used.) */
		
		int a=1;
		
		System.out.println(a++);   //1   
		System.out.println(++a);   //3   
		System.out.println(++a);   //4   
		System.out.println(a=-a);  //-4 
		System.out.println(a--);   //-4  
		System.out.println(--a);   //-6  
		System.out.println(--a);   //-7
		System.out.println(a--);   //-7 
		System.out.println(a=-a);  //8  
		System.out.println(a);     //8  
		System.out.println(); 
		System.out.println(); 
		
		//                          * HOMEWORK *
		
		int b=10;
		
		System.out.println(b++);   // 10 
		System.out.println(b++);   // 11
		System.out.println(++b);   // 13
		System.out.println(b--);   // 13
		System.out.println(--b);   // 11
		System.out.println(b=-b);  //-11
		System.out.println(b++);   //-11
		System.out.println(b++);   //-10
		System.out.println(++b);   // -8
		System.out.println(b);     // -8
		
		
		
		
		
		
		
		
		
		
		
}
}