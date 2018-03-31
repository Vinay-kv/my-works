package exception;

import java.sql.SQLException;

public class B953 
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
			return 100;//here returnig in finally block itself is like handling exception in catch block
			// so catch block is not neccessary if final block is provided
			
			// now the question is, if method is of void type how will u handle exception in finally block
			//by returning
		}
		
        
	}

}
