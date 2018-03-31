package exception;

public class B94 
{

	public static void main(String[] args) 
	{
		System.out.println(m());
			
	}
	
	static int m()
	{
		try 
		{
			
			return 1;
 
		} 
		finally
		{
			return 100;//overRideing return value
		}
		
        
	}

}
