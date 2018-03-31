package ananymous_InnerClass;

public class Mainclass2 {

public static void main(String[] args) 
{
   //ff(null);
   ff(new Interface(){public void aa(){System.out.print("hi, aa() implemented in ananymous inner class");}});
}
	
	
	static void ff(Interface a)
	{
		a.aa();
		
	}
	
}
		
		