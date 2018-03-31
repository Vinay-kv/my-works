package protectedKeyword;

public class inheriting2 extends a2
{

	public static void main(String[] args) throws Throwable 
	{
		a2 a=new a2();
		
		a.a=10;//protected members
		a.a();//protected members
		a.b=56;
		
		
		inheriting2 b=new inheriting2();
		
		b.a=56;
		b.a();
		b.b=56;
		b.clone();//Throws CloneNotSupportedException
		b.finalize();//throws Throwable
		
		

	}

}
