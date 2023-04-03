package india;

public class _08_NestedIf {

	public static void main(String[] args) {
		
		int shirt=1000;
		int variety=10;
		boolean UPI=false;
		
		if (shirt<=1500)
		{
			System.out.println("Price of the shirt is affordable.");
			
		    if (variety>=5)
		    {
			    System.out.println("Shop has more varieties.");
			    
		        if (UPI==true)
		        {
			          System.out.println("Online payment method is available.");
		        
		       }
		else 
			{
			System.out.println("Online payment is not accepted.");
			}
		        }
		else 
		    {
			System.out.println("Shop has less varieties.");
			}
		        }
		else  
		    {
			System.out.println("Shirt is expensive.");
			}
		
		
		
		}

	}




