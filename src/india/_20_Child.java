package india;

public class _20_Child  extends _19_Parent {
	
	
    
 
    public void Test() {
    	System.out.println("Child class property.");
    }
    
    
    public static void last() {
    	System.out.println("Child Hide");
    }
    
    public void hello () {  // method cannot be static for "this and super" keyword.
    	super.Test();
    	this.Test();
    }
    
	public static void main(String[] args) {
		
		
		
		_20_Child obj = new _20_Child();
		
		obj.hello();
		
//		p.test();        //we cannot import main method data 
		                 //therefore object also
		
		
		
	}

}
