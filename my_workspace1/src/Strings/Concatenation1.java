package Strings;

public class Concatenation1 {

	public static void main(String[] args) 
	{
		String s="vinay";
		char c='v';
		int i=20;
		double d=20.23;
		
		s=s+c+i+d;
		
		System.out.println(s);
		
		//so if you add(it will concatenate) any data to string it will be converted to string and then added 
		// to the original string
		System.out.println(c);
		int a=(int)c;
		System.out.println(a);
		String g="vinbm";
		int b=s.compareTo(g);
		
		System.out.println(b);
		
		
	}

}
