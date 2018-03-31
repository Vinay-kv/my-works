package exception;

import java.sql.SQLException;

public class B999 
{

	public static void main(String[] args) 
	{
		System.out.println(m());

	}
	
	static int m()
	{
		try
		{  return 1;
			//throw new SQLException();  
	    }  
		catch(SQLException e)//Unreachable catch block for SQLException. 
		//This exception is never thrown from the try statement body
		{
			
		}
	    
	
		
	}

}
