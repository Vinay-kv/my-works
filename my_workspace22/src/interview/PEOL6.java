package interview;

import java.util.Scanner;

public class PEOL6 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		//InputStream java.lang.System.in
		System.out.println("enter the sentence in which only even words are to be sorted");
		//PrintStream java.lang.System.out
		String st=sc.nextLine();
		
		System.out.println("entered String is--->> "+st);
		
		char[] chArray=st.toCharArray();
		
		st="";
		int k=-1;
		for (int i = 0; i < chArray.length; i++) 
		{
			int m=i;
			while(i < chArray.length&&chArray[i]!=' ')

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
				k=-1;
			}
			if(i<chArray.length)
			{
				st=st+chArray[i];
			}
			
			
		}//end of for loop
		
		System.out.println("sorted String is below...");
		System.out.println(st);

	}

}

//OUTPUT:
	
	/*
	enter the String to be Sorted
	Bill Gates Is The Ricchest Person In The World Since From Seven Years
	entered String is Bill Gates Is The Ricchest Person In The World Since From Seven Years
	sorted String is below...
	Bill setaG Is ehT Ricchest nosreP In ehT World ecniS From neveS Years
	*/

