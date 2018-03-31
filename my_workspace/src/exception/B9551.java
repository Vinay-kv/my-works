package exception;

import java.sql.SQLException;

public class B9551 
{

	public static void main(String[] args) 
	{
		try {
			m();
		} catch (ArithmeticException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	static void m()throws ArithmeticException,SQLException
	{
		try 
		{
			
		  throw new  ArithmeticException();
		 
 
		} 
		
		//this is example of exeption overriding from ArithmeticException to SQLException
		
		finally
		{
			throw new  SQLException();
			
		}
		
        
	}

}
