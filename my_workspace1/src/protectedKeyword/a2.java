package protectedKeyword;

public class a2 
{
	protected int a=10;
	protected static int n=10;
	
	protected static int a()//note here that both field name and method name are same, and compilation error
	{
		return 10;
		
	}
	
	public int b=20;
	

}
