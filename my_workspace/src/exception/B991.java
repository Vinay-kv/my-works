package exception;

public class B991 
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
			
	    System.out.println("finally block is run before method returns.");
	    return 18;
	}
		
	}

}
