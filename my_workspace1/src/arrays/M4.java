package arrays;

public class M4 
{

	public static void main(String[] args) 
	{
		int[] a=new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+",");
		}
		
		a[3]=10;
		a[1]=20;
		System.out.println();
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+",");
		}

	}

}
