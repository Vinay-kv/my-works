package protectedKeyword;

public class Mainclass {

	public static void main(String[] args) 
	{

        a2 a=new a2();
        a2.n=89;
		
		a.a=10;//protected members
		a.a();//protected members
		a.b=56;
		/*a.clone();*/
		
        inheriting2 b=new inheriting2();
		
		b.a=56;
		b.a();
		b.b=56;
		/*b.clone();
		b.finalize();*/
		System.out.println("program ends");
		
		
	

	}

}
