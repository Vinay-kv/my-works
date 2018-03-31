package interview;

import java.util.Scanner;

public class PEOL2 
{
	static String st=" ";

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the sentence");
		
		String a=sc.nextLine();
		char c[]=a.toCharArray();
		
		int k=4;
		
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' '&&k==4)
			{
				i++;
				int m=i;
				while(i<c.length&&c[i]!=' ')
				{
					i++;
				}
				int n=i-1;
				System.out.println(m+","+n);
				while(n>=m)
				{
					st=st+c[n];
					n--;
				}
				if(k%2==0)
				{
					k=3;
				}
				else if(k%2==1)
				{
					k=4;
				}
			}
			
		}
		System.out.println(st);
		
		
	}

}





