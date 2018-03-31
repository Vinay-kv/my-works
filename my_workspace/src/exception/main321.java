package exception;

public class main321 {

	public static void main(String[] args) 
	{
		//Exception u=new Exception();	
		
			//System.out.println(10\0);------find out compilation error(CE) here
		try {
			int a =10/0;
			System.out.println(a);
		} catch (ArithmeticException e)//catching using same thrown object
		                               //reference variable
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("after catch block");
		

	}

}
