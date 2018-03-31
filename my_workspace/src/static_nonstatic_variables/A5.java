package static_nonstatic_variables;

public class A5 {

	static int a;
	int b;
	static A5 c;
	/*we can make use of class level variables without initializing, as they will be defultly initialized by 
	 * JVM, but this is not the case with local variables, these have to be initialized for compulsory before we 
	 * make any operations on these*/
	public static void main(String[] args) 
	{
		c=new A5();
		
		c.a();
		System.out.print(A5.a+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
		System.out.println();
		
		c.a();
		System.out.print(A5.a+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
		System.out.println();
		
		c.a();
		System.out.print(A5.a+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
	}
	
	
	  void a()
	{
         //c=new A5();
		 
		 ++a;
		 c.b++;
		 

	}

}
