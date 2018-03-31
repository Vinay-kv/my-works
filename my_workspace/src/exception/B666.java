package exception;

public class B666 
{

	public static void main(String[] args) 
	{
	
		System.out.println("starts");
	try 
	{
		System.out.println(10/0);
	} 
	catch (Exception e)
	{
		System.out.println("exception occured");
	}
	finally
	{
	
		System.err.println("RUNTIME exception occured");
	}
	
	System.out.println("excecuting lines after exception occured");
	
}
}
