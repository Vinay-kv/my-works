package Nonstatic.Inner.Classes;

public class Mainclass1 
{

	public static void main(String[] args) 
	{
		OuterClassWithInnerClass a=new OuterClassWithInnerClass();
		
		a.a=10;
		a.aa();
		
		a.InnerClass b=new a.InnerClass();
		
	}
}
