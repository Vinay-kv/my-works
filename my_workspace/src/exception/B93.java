package exception;

public class B93 {

	public static void main(String[] args) 
	{
			
	}
	
	static int m()
	{
		try 
		{
			throw new ArithmeticException();
			return 1;//Unreachable code
 
		} 
		catch (Exception e) 
		{
 
          
		}
		return 1;
        
	}
	
	}


