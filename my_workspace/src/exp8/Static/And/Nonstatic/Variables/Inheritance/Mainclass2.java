package exp8.Static.And.Nonstatic.Variables.Inheritance;

public class Mainclass2 extends Mainclass1  
{
	//Mainclass1.aaa=100;-----i think other class varibles can be accessed only inside method body
int c=56;
	
    static int aaa=86;
	
	public static void main(String[] args)   
	{
	
	System.out.println(args);
	}
	
	public void a2() 
	{
		System.out.println("dfd");
		
	}
	/*
	 for(int i=0;i<10;i++)
	{
		
	}
	*/
}

