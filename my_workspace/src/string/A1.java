package string;

public class A1 {

	public static void main(String[] args) 
	{
		String a="1234";
		
		String b="1234 ";
		
		String c=" 1234";

		String d="12 34";
		
		String e="12 34 ";
		
		char[] f1={'a','b','c'};
		
		String f=new String(f1);
		
		char g=' ';

		
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		System.out.println(d.length());
		System.out.println(e.length());
		System.out.println(f.length());
		
		System.out.println(g);
		System.out.println((int)g);

	}

}
