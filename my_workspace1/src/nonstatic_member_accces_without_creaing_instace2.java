
public class nonstatic_member_accces_without_creaing_instace2 
{

	int a=10;
	static int b=20;
	
	
	public static void main(String[] args) 
	{
		b=25;
		a=52;//Cannot make a static reference to the non-static field a
		
	}
}
