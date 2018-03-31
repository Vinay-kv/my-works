package $interface;

public class S2 implements S11
{
a[] a;//simply
	public void bb()
	{
		System.out.println("bb()");
	}
	@Override
	public void aa() 
	{
		System.out.println("aa()");
		
	}	
	public static void main(String[] args) 
	{
     
		S2 a=new S2();
		S11 b=a;
		
		a.aa();
		a.bb();
		System.out.println(a.equals(b));
		System.out.println(a.equals(a));
		Class<S2> ab=S2.class;
		Class sd=a.getClass();
		
		
		b.aa();
		b.aaa();
		
	}
	@Override
	public void aaa() {
		System.out.println("aaa()");
		
	}
	

}
