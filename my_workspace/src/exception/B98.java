package exception;

public class B98 
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
	    System.out.println("finally block is run before method returns.");
	}
		
	}

}
