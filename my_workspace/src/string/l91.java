package string;

public class l91 
{

	public static void main(String[] args) 
	{
		l9 v=new l9();
		
		System.out.println("---------------------------------------");
		v.fg();
		System.out.println("---------------------------------------");
		String b=v.a;
		System.out.println(b);//String is accessed by sharing address of String 
		//reference 
		b="vinay";//trying to edit String object,but it wont be edited ,instead
		//new vinay String object is created with reference variable b, as 
		//string is immutable class
		System.out.println(b);
		v.bh();
		v.th();
		System.out.println(v.a);
		
		System.out.println(b);
		
		}
}
