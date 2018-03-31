package exception;

import java.sql.SQLException;

public class B9530 
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
			throw new ArithmeticException();//this is the other posibality of handling exception without 
			//using catch block rather by again throwing runtime exception(this should be handle by main method)
			//or  by again throwing checked exception, but this should be handled in finally block only, rather we 
			//should through it to calling method using thowS keyword(then only control will be transferred)
			
			// so the ultimate trick is tranfer the control to calling method by returnig or by throwing exception
		}
		
        
	}

}
