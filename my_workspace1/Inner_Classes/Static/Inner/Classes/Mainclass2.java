package Static.Inner.Classes;
import Static.Inner.Classes.OuterClassWithInnerClass.InnerClass;

public class Mainclass2 {

	public static void main(String[] args) 
	{
		OuterClassWithInnerClass a=new OuterClassWithInnerClass();
		
		a.a=10;
		
		a.gg();
		
		
		
		InnerClass b=new InnerClass();//InnerClass cannot be resolved to a type
		b.b=20;
		b.gg();
		
		

	}

}
