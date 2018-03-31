package Static.Inner.Classes;

import Static.Inner.Classes.OuterClassWithInnerClass.InnerClass;

public class Mainclass3 {

	public static void main(String[] args) 
	{
		InnerClass.b=10;//1.we should import InnerClass here, or 2.provide fully qualified name as shown below
		//moreover we Cannot make a static reference to the non-static field
		
		Static.Inner.Classes.OuterClassWithInnerClass.InnerClass.b=10;//Cannot make a static reference to the
		//non-static field Static.Inner.Classes.OuterClassWithInnerClass.InnerClass.b
		
		//1.
		InnerClass.c=10;
		
		
		//2.
		Static.Inner.Classes.OuterClassWithInnerClass.InnerClass.c=10;
		
	
		
		
		

	}

}
