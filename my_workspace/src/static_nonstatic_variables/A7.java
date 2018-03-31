package static_nonstatic_variables;

public class A7 {

	static int a;
	int b;
	static A7 c;
	/*we can make use of class level variables without initializing, as they will be defultly initialized by 
	 * JVM, but this is not the case with local variables, these have to be initialized for compulsory before we 
	 * make any operations on these*/
	public static void main(String[] args) 
	{
		c=new A7();
		
		A7.a();
		System.out.print(A7.a+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
		System.out.println();
		
		A7.a();
		System.out.print(A7.a+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
		System.out.println();
		
		A7.a();
		System.out.print(A7.a+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
	}
	
	
	  static void a()
	{
         //c=new A5();
		 
		 ++a;
		 c.b++;
		 

	}

}
