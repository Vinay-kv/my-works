package two_dimensional_arry;

public class t2 {

	public static void main(String[] args) 
	{
	
		int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};//Array constants can only be used in initializers
		
		System.out.println("two dimensional array elements are:..");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
			System.out.print(a[i][j]+" ,");	
				
			}
			System.out.println("");
			
		}

	}

}
