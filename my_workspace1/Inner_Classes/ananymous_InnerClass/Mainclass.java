package ananymous_InnerClass;

public class Mainclass {

	public static void main(String[] args) 
	{
		
		Interface a=new Interface() 
		{
			int a=10;
			//static int aa=10;//The field aa cannot be declared static in a non-static inner type,
			//unless initialized with a constant expression
			@Override
			public void aa() 
			{
				System.out.println("inside aa() of interface");
				
			}
			public void aaa() 
			{
				System.out.println("inside aaa() of interface");
				
			}
		};
		
		
		AbstractClass b=new AbstractClass() 
		{
			int b=10;
			//static int aa=10;
			@Override
			public void bb() 
			{
				System.out.println("inside bb() of AbstractClass");
				
			}
			public void bbb() 
			{
				System.out.println("inside bbb() of AbstractClass");
				
			}
		};
		
		
		ConcreteClass c=new ConcreteClass()
		{
			int d=10;
			//static int aa=10;
			public void dd()
			{
				System.out.println("inside dd() of ConcreteClass ");
			}
			public void ddd()
			{
				System.out.println("inside ddd() of ConcreteClass ");
			}
		};
		
		a.aa();//void ananymous_InnerClass.Interface.aa()
		a.aaa();
		a.a=10;
		
		b.bb();//void ananymous_InnerClass.AbstractClass.bb()
		b.bbb();
		b.b=52;
		
		c.cc();//void ananymous_InnerClass.ConcreteClass.cc()
		
		
		

	}

}
