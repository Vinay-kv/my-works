
public class nonstatic_member_accces_without_creaing_instace {
	static 
	{
		
	}
	int x=10;
	static int y=20;
	static nonstatic_member_accces_without_creaing_instace z;
	
	public static void fg() 
	{
		int a=10;
		static int b=20;//Illegal modifier for parameter b; only final is permitted
		{
			
		}
		static
		{
			
		}
		z=new nonstatic_member_accces_without_creaing_instace();
		
		fg();
		z.m();
		z.x=10;
		y=10;
		
	}
	
	void m()
	{
		int a=10;
		static int b=10;//Illegal modifier for parameter b; only final is permitted
		{
			
		}
		static 
		{
			
		}
		fg();
		z.m();
		z.x=10;
		y=10;
		
	}
	
	/* 1.  conclusion is that no static variables,static blocks can be declared inside any static
	       method or nonstatic method
	   2.  but static variables can be accessed within any static method or nonstatic method   */
	/*And any static method or nonstatic method can be accessed within any static method or nonstatic method*/
	

}
