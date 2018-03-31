package exception;

import java.sql.SQLException;

public class B9991 
{

	public static void main(String[] args) 
	{
		System.out.println(m());

	}
	
	static int m()
	{
		try
		{  
			//System.out.println(10/0);
			return 1;
			 
	    }  
		catch(Exception e)//Unreachable catch block for SQLException. 
		//This exception is never thrown from the try statement body
		{
			System.out.println("<><><>");
		}
		
		finally
		{
				
			System.out.println("...........");
			return 10;
		}
	    
	
		
	}

}
