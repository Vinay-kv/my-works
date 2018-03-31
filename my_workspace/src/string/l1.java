package string;

public class l1 
{
	//String static s1="vinay";//string should be always nonstatic
	// sorry above declaration is wrong
	//it should be 
	//static String s="vinay";
	
	String  s1="vinay";
	 s1="kumar";
	 static l1 a=new l1();
	
	public  void fg() 
	{
		
		System.out.println(a.s1.hashCode());
		System.out.println(a.s1.toString());
		

	}

}
