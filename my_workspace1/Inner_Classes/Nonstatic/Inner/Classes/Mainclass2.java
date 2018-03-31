package Nonstatic.Inner.Classes;



public class Mainclass2 
{

	public static void main(String[] args) 
	{
		OuterClassWithInnerClass a=new OuterClassWithInnerClass();
		
		a.a=10;
		a.aa();
		
		/*a.InnerClass b=new a.iInnerClass();*/
		Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass b =a.new InnerClass();//this line will show InnerClass cannot be resolved to a type compile 
		//time error if you don't import InnerClass
		
		a.new InnerClass();
		System.out.println(b.b);
		b.b=98;
		b.bb();
		
	}
}
