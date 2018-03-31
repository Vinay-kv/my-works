package exception;

import java.sql.SQLException;

public class B2 {

	public static void main(String[] args) 
	{
		
			throw new ArithmeticException();
		
			
			System.err.println("exception occured");//Unreachable code
		
		
		System.out.println("excecuting lines after exception occured");
	}

}
