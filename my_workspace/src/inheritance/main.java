package inheritance;

public class main {

	public static void main(String[] args)
	{
		bbb g =new bbb();
		
		System.out.println(g.a);//we can inherit nonstatic variable
		System.out.println(g.b);//we can inherit static variable
		
		g.m1();//we can inherit nonstatic variable method
		g.m2();//we can inherit static variable
		g.m3();
		
		//conclusion is we can inherit both static and nonstatic  members
		//from superclass(aaa) to subclass(bbb).

	}

}
