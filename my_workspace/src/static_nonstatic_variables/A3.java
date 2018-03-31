package static_nonstatic_variables;

public class A3 {

	public static void main(String[] args) 
	{
		System.out.println(a());
		System.out.println(a());
		System.out.println(a());
	}
	
	
	 static int a()
	{

		 int a=10;
		 
		 ++a;

		 
		return a;
	}

}
