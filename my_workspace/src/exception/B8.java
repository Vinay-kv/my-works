package exception;

public class B8 
{

	public static void main(String[] args) 
	{
	
	System.out.println(m());	
	
    }
	static int m()
	{
		
		System.out.println("starts");
		try 
		{
			System.out.println(10/0);
		} 
		finally
		{
		
			System.err.println("RUNTIME exception occured");
			return 1;
		}
		
		//System.out.println("excecuting lines after exception occured");//Unreachable code
		
		
		
		
		
		
		
		
		
	}
}
