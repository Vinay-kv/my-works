package Static.Inner.Classes;

public class Mainclass1 {

	public static void main(String[] args) 
	{
		OuterClassWithInnerClass a=new OuterClassWithInnerClass();
		
		a.a=10;
		
		a.gg();
		
		new InnerClass();//InnerClass cannot be resolved to a type
		
		

	}

}
