package Class.forName_newInstance;

public class Mainclass1 
{
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		Class a=Class.forName(args[0]);
		
		Object b=a.newInstance();
		
		System.out.println(b.getClass().getName());
		
	}

}
