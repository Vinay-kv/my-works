package exception;

import java.sql.SQLException;

public class B3 {

	public static void main(String[] args) 
	{
		System.out.println("starts");
		
		try 
		{
			System.out.println(10/0);
		} 
		catch (Exception e)
		{
		
			System.err.println("RUNTIME exception occured");
		}
			
			
		
			
			
		
		
		System.out.println("excecuting lines after exception occured");
	}

}
