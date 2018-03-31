package Nonstatic.Inner.Classes;

import Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass;

public class Inheriting2 extends Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass
{

	public Inheriting2()
	{
		OuterClassWithInnerClass a=new OuterClassWithInnerClass();
		a.super();//Constructor call must be the first statement in a constructor
		
	}
	
	public static void main(String[] args) 
	{
		Inheriting2 a = new Inheriting2();
		
		a.b=89;
		a.bb();
    
	}

}
