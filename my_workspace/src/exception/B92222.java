package exception;

public class B92222 
{

	public static void main(String[] args) 
	{
		System.out.println(m());	
	}
	static int m()
	{
		
		try 
		{  
			System.out.println(10/0);
        	return 1;
	
		}  
	
		finally
		{ 
			return 15;
	    System.out.println("finally block is run before method returns.");//Unreachable code
	    
	    }
		//return 2;//Unreachable code
	
	}
}
