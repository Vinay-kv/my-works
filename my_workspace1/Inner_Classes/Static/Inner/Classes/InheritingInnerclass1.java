package Static.Inner.Classes;



public class InheritingInnerclass1 extends OuterClassWithInnerClass
{

	public static void main(String[] args) 
	{
		InheritingInnerclass1 a=new InheritingInnerclass1();
		
		a.a=10;
		a.gg();
		a.InnerClass.gg();
		
		OuterClassWithInnerClass.InnerClass.c=56;
		OuterClassWithInnerClass.InnerClass.ggh();
		
		
		
	
		

	}

}
