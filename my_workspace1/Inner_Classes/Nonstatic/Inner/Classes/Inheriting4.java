package Nonstatic.Inner.Classes;

import Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass;

public class Inheriting4 extends Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass
{
	static OuterClassWithInnerClass aa=new OuterClassWithInnerClass();
	public Inheriting4()
	{
	   aa.super();
		
	}
	
	public static void main(String[] args) 
	{
		Inheriting4 a= new Inheriting4();
		
		a.b=89;
		a.bb();
		
		/*aa.InnerClass2.b=56;
		OuterClassWithInnerClass.InnerClass2.h=8;*/
    
	}

}
