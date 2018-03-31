package exception;

import java.sql.SQLException;

public class B22 {

	public static void main(String[] args) 
	{
		
			try 
			{
				throw new ArithmeticException();
			} 
			catch (Exception e)
			{
			
				System.err.println("RUNTIME exception occured");
			}
		
			
		
		
		
		System.out.println("excecuting lines after exception occured");
	}

}
