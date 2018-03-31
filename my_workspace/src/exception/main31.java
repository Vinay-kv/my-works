package exception;

public class main31 {

	public static void main(String[] args) 
	{
		//Exception u=new Exception();	
		
			//System.out.println(10\0);------find out compilation error(CE) here
		int a =10/0;
		System.out.println(a);
		
		System.out.println("after exception");//this line of code wont be executed
		//as the exception will occur  at line 10 and 11
		
		//this line(13 line) would have been executed if that exception code 
		//is surrounded by try catch block
		

	}

}
