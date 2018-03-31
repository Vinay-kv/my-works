package Static.Inner.Classes;

public class OuterClassWithInnerClass {

	int a = 10;

	public void gg() 
	{
		System.out.println("gg() of outer class");
	}
	
			public static class InnerClass
			{
				int b=10;
				static int c=56;
				
				public void gg() 
				{
					System.out.println("gg()of inner class");
				}
				public static void ggh() 
				{
					System.out.println("gg()of inner class");
				}
				
				
			}
	

}
