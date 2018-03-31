package overloading_overridding;

public class Mainclass1 extends M2
{

	
	public static void main(String[] args) 
	{
		Mainclass1 a=new Mainclass1();
		
		a.hh();
		a.gg();
		
		a.diff1();
		a.diff2();
		
		M1 b=new M2();
		
		M2 c=(M2) b;
		
		b.hh();
		b.gg();
		b.diff1();
		
		c.hh();
		c.gg();
		c.diff2();
		c.diff1();
		
		
		
		

	}

}
