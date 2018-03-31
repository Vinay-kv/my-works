package string;

public class l3 
{
	//String static s1="vinay";//string should be always nonstatic
	String  s1="vinay";
	int b=10;
	//b=12;
	
	
	 //s1="kumar";
	 static l3 a=null;
	
	public  static void fg() 
	{
		
		a=new l3();
		System.out.println(a.s1.hashCode());
		System.out.println(a.s1.toString());
		
		a.b=12;
		a.s1="kumar";
		
		System.out.println(a.s1.hashCode());
		System.out.println(a.s1.toString());
		
		
		System.out.println(a.b);
		System.out.println(a.a);
		
		

	}

}
