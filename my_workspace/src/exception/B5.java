package exception;

public class B5 {

	public static void main(String[] args) 
	{
		a();

	}
	
	static int a()
	{
		System.out.println("starts");
		
		
		return 1;
		
		System.out.println("ends");//Unreachable code
	}

}
