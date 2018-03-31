package exception;

public class a2 
{
	
	public static void main(String[] args) 
	{
		Exception d=new Exception();
		try {
			throw d;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a2 n=new a2();
		System.out.println(n.getClass());
		
	}

}
