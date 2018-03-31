package static_nonstatic_variables;

public class A4 {

	static int a;
	int b;
	static A4 c;
	/*we can make use of class level variables without initializing, as they will be defultly initialized by 
	 * JVM, but this is not the case with local variables, these have to be initialized for compulsory before we 
	 * make any operations on these*/
	public static void main(String[] args) 
	{
		System.out.print(a()+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
		System.out.println();
		
		System.out.print(a()+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
		System.out.println();
		
		System.out.print(a()+",");
		System.out.print(c.b);
		System.out.println("---"+c.hashCode());
		
	}
	
	
	 static int a()
	{
         c=new A4();
		 
		 ++a;
		 c.b++;
		 

		 
		return a;
	}

}
