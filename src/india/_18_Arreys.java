package india;

public class _18_Arreys {

	public static void main(String[] args) {
		
          int a [] = {10,20,50,80,95};            //declaration way 1
          int b [] = new int [] {30,50,20,70};    //declaration way 2 
          String s [] = {"Velocity","Katraj","Pune","Maharashtra"};
          
        int i [] = new int [20];
            i= new int [] {30,50,20,70};
            
        System.out.println(a[2]);
        System.out.println(s[1]);
        System.out.println(s.length);
        
        String value = s [0];
        System.out.println (value.length());
        
        
        String h = "Velocity Kas ver ger";
        int len = h.length();
        
        for (int d=len-1;d>=0;d--)
        {
        	System.out.print(h.charAt(d));
        }
        
        System.out.println();
        
        int count=0;
        
        for (int v=0;v<len;v++)
        	
        {   
        	if ( h.charAt (v) ==' ')
        	{
             
        		count ++;
        	}
        	
        	
        }
        System.out.println(b[2]);
        System.out.println(i[2]);
        System.out.println("The number of spaces = "+count);
        
        
	}

}
