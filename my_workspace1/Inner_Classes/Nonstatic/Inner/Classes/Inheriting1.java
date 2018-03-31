package Nonstatic.Inner.Classes;

import Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass;

public class Inheriting1 extends Nonstatic.Inner.Classes.OuterClassWithInnerClass.InnerClass
{

	public Inheriting1()
	{
		new OuterClassWithInnerClass().super();
		
	}
	
	public static void main(String[] args) 
	{
		Inheriting1 a = new Inheriting1();
		
		a.b=89;
		a.bb();
    
	}

}
