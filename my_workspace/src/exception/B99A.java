package exception;

import java.sql.SQLException;

public class B99A 
{

	public static void main(String[] args) 
	{
		System.out.println(m());

	}
	
	static int m()
	{
		try
		{  
			System.out.println(10/0);
			return 1;
        	 
	    }  
	    
		finally 
		{  
	    try 
	    {
			throw new SQLException();
		} 
	    catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
	}

}
