package overloading_overridding;

public class Mainclass extends M2
{

	public  void hh()//Cannot override the final method from M2
	{
		System.out.println("inside hh() of M2");
	}
	public static void main(String[] args) 
	{
		Mainclass a=new Mainclass();
		
		a.hh();
		a.gg();
		
		a.diff1();
		a.diff2();
		
		
		
		

	}

}
