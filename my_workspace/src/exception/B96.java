package exception;

import java.sql.SQLException;

public class B96 
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
			
		  throw new  ArithmeticException();//for handling this riskey code two, we have given to solutions
		  //1.used throws keyword
		  //2.used catch block
		  //3.but it is first using catch block solution FIRSTLY
 
		} 
		
		catch(Exception e)
		{
		
			System.out.println("exception caught");	
		}
		
		
        
	}

}
