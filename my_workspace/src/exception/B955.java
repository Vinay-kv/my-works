package exception;

import java.sql.SQLException;

public class B955 
{

	public static void main(String[] args) 
	{
		System.out.println(m());
			
	}
	
	static int m()//here it is requesting return statement
	{
		try 
		{
			
		  throw new  ArithmeticException();
		 
 
		} 
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		finally
		{
			try {
				throw new  SQLException();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        
	}

}
