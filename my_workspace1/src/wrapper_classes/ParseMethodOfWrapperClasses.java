package wrapper_classes;

public class ParseMethodOfWrapperClasses {

	public static void main(String[] args)
	{
		String num1="20";
		String num2="30";
		String num3="40h";
		
		int num4=50;
		
		System.out.println(num1+num2);
		
		Object x1=Integer.parseInt(num1);//String to primitive type
		//int java.lang.Integer.parseInt(String arg0) throws NumberFormatException
		
		long x2=Integer.parseInt(num1);//Implicitly upcasting happening here
		float x3=Integer.parseInt(num1);//Implicitly upcasting happening here
		int x4=Integer.parseInt(num1);
		
		long x5=num4;//Implicitly upcasting happening here
		short x6=num4;//Implicit downcasting is not allowed in java  
		short x7=(short) num4;//so we should explicitly downcast 
	}

}
