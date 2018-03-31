package exception;

import java.sql.SQLException;

public class B954 
{
	public static void main(String[] args) 
	{
		System.out.println(m());
			
	}
	
	static int m()//here it is not requesting return statement
	{
		try 
		{
			
		  throw new SQLException();
 
		} 
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			throw new ArithmeticException();
		}
		
        
	}

}
