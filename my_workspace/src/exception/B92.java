package exception;

public class B92 
{

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
	
		finally
		{  
	    System.out.println("finally block is run before method returns.");
	}
	
	}
}
