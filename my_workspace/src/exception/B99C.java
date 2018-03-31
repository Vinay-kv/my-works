package exception;

import java.sql.SQLException;

public class B99C 
{

	public static void main(String[] args) 
	{
		System.out.println(m());

	}
	
	static int m()
	{
		try
		{  
			throw new SQLException();//we can't manage checked exception with just try and finally block
			//rather we should make use of either throws or catch block
        	//return 1;//Unreachable code  
	    }  
		catch(SQLException e)
		{
		return 1;	
		}
	    
		finally 
		{  
	    System.out.println("finally block is run before method returns.");
	}
		
	}

}
