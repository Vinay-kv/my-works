package Nonstatic.Inner.Classes;

public class OuterClassWithInnerClass 
{
	int a=10;
	
	public void aa()
	{
		System.out.println("aa() of outer class");
	}
	
					public class InnerClass
					{
						int b=5;
						/*
						static int c=10;//The field c cannot be declared static in a non-static inner type,
						unless initialized with a constant expression
						static public void bbb()
						{
							System.out.println("bb() of inner class");
						}
						//The method bbb cannot be declared static; static methods can only be declared in a
						//static or top level type
                        */						
						public void bb()
						{
							System.out.println("bb() of inner class");
						}
						
						
					}
					public static class InnerClass2
					{
						int b=5;
						static int h=5;
						static public void bbb()
						{
							System.out.println("bb() of inner class2");
						}
						
						public void bb()
						{
							System.out.println("bb() of inner class2");
						}
						
					}
/*in static inner class we can declare both static and nonstatic variables and methods
 * but in nonstatic inner classes we can declare only nonstatic variables and methods*/

}
