package india;

public class _19_Parent {

	int b=20;
	
	
	public void Test () {
		
		System.out.println("Parent class property.");	
	}
	
	
	public static void last() {
		System.out.println("I am parent static method.");
	}
	
    public static _19_Parent old () {
		
    	_19_Parent p = new _20_Child();	              //upcasting
    	return p;
	}
    
 public static _19_Parent ton() {
		
    	_19_Parent f = new _19_Parent();	              
    	return f;
	}
    
	
	public static void main(String[] args) {
		
//		_19_Parent p = new _19_Parent();
		
		

	}

}
