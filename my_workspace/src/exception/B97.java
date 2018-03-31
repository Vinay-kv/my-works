package exception;

import java.sql.SQLException;

public class B97 
{

	public static void main(String[] args) 
	{
		try 
		{
			m();
		} catch (Exception e) 
		{
			System.out.println("ArithmeticException caught, but handled");
			
		}
	}
	
	static void m() 
	{
		
			
		  //throw new  SQLException();
		  throw new ArithmeticException();
 
		
        
	}

}
