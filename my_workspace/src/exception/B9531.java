package exception;

import java.sql.SQLException;

public class B9531 
{

	public static void main(String[] args) 
	{
		m();
			
	}
	
	static void m()
	{
		try 
		{
			
		  throw new SQLException();
 
		} 
		
		
		finally
		{
			
			return;
		}
		
        
	}

}
