package Nonstatic.Inner.Classes;

import Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass;

public class Inheriting3 extends Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass
{
	OuterClassWithInnerClass a=new OuterClassWithInnerClass();
	public Inheriting3()
	{
	   a.super();//Cannot refer to an instance field a while explicitly invoking a constructor
		
	}
	
	public static void main(String[] args) 
	{
		Inheriting3 a = new Inheriting3();
		
		a.b=89;
		a.bb();
    
	}

}
