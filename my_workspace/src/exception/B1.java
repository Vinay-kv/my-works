package exception;

import java.sql.SQLException;

public class B1 {

	public static void main(String[] args) 
	{
		try 
		{
			throw new SQLException();
		} 
		catch (SQLException e) 
		{
			
			System.err.println("exception occured");
		}
		
		System.out.println("excecuting lines after exception occured");
	}

}
