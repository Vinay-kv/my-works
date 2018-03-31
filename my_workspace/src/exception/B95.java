package exception;

import java.sql.SQLException;

public class B95 
{

	public static void main(String[] args) 
	{
		System.out.println(m());
			
	}
	
	static int m()
	{
		try 
		{
			
		  throw new SQLException();
 
		} 
		
		
		finally
		{
			//return 100;
		}
		
        
	}

}
