package exception;

public class B99 
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
			//throw new SQLException();// if this is used,then we should again handle exception
        	return 1;  
	    }  
	    
		finally 
		{  
	    System.out.println("finally block is run before method returns.");
	}
		
	}

}
