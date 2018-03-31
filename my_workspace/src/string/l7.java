package string;

public class l7 
{
    String d="sudeep";
    
	static int a=10;
	
	public  static void fg() 
	{
		
		System.out.println(d);//you can't make use of nonstatic variable 
		//inside static method
	}
	
	public void hh()
	{
		a=15;
		d="vinay";//but in nonstatic method you can use both static and nonstatic
		//variables
	}

}
