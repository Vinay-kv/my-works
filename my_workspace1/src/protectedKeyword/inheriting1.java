package protectedKeyword;

public class inheriting1 extends a2
{

	public static void main(String[] args) 
	{
		a2 a=new a2();
		
		a.a=10;//protected members
		a.a();//protected members
		a.b=56;
		a.clone();
		a.finalize();
		
		inheriting1 b=new inheriting1();
		
		b.a=56;
		b.a();
		b.b=56;
		b.clone();
		b.finalize();
		
		

	}

}
