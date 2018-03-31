package wrapper_classes;

public class ParseMethodOfWrapperClasses1 {

	public static void main(String[] args)
	{
		String num1="20";
		String num2="30";
		String num3="40h";
		
		System.out.println(num1+num2);
		
		int x1=Integer.parseInt(num1);//Sting to primitive type
		int y1=Integer.parseInt(num2);//Sting to primitive type
		//int z1=Integer.parseInt(num3);//Sting to primitive type
		/*Double.parseDouble(num1);
		Byte.parseByte(num1);*/
		
		int a=100;
		
		String b=String.valueOf('m');//Primitive to String Object
		String c=String.valueOf(a);	//Primitive to String Object
		
		System.out.println(b+","+c);
		System.out.println(x1+y1);
		
		
	}

}
