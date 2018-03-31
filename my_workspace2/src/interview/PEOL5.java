package interview;

import java.util.Scanner;

public class PEOL5 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the String to be Sorted");
		
		String st=sc.nextLine();
		
		System.out.println("entered String is "+st);
		
		char[] chArray=st.toCharArray();
		
		st="";
		int k=-1;
		for (int i = 0; i < chArray.length; i++) 
		{
			int m=i;
			while(chArray[i]!=' '&&i < chArray.length)//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

			{
				i++;
			}
			int n=i;
			
			if(k==-1)
			{
				while(n>m)
				{
					st=st+chArray[m];
					m++;
					
				}
				k=1;
			}
			else
			{
				while(n>m)
				{
					st=st+chArray[n-1];
					n--;
				}
			}
			
			
		}//end of for loop
		
		System.out.println("sorted String is below...");
		System.out.println(st);

	}

}
