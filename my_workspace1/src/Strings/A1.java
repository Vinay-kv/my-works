package Strings;

public class A1 {

	public static void main(String[] args) 
	{
		String a="vinay at the best";
		
		String[] b=a.split("a");
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println(a.indexOf("best"));
		System.out.println(a.indexOf(1));
		
		System.out.println(a.substring(8));
		
		System.out.println(a.replaceAll("best", "very best"));
		
		System.out.println(a.replaceFirst("vinay", "kumar"));
		
		System.out.println(a.replace('a', 'q'));

	}

}
