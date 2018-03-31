package interview;

import java.util.Scanner;

public class Exalca 
{
	public static void main(String[] args) 
	{
		System.out.println("starts");
		Scanner sc =new Scanner(System.in);
		String st=sc.nextLine();
		char[] ch=st.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
			int a=i;
			char b=ch[i];
			StringBuffer c=new StringBuffer("");
			
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
				int count=0;
				
				while(i<ch.length&&ch[i]==b&&ch[i]!=' ')
				{
					count++;
					i++;
				}
				
				if(count>0)
				{
					for (int k = 0; k <= count; k++) 
					{
						c.append(b);
					}
					c.append(",");
				}
				else if(i<ch.length)
				{
					b=ch[i];
				}
				
			}//end of while loop
			if(c.length()>0)
			{
				for (int j = a; j <i; j++) 
				{
					System.out.print(ch[j]);
				}
				System.out.print("["+c+"]::");
				
				
			}
		}//end of for loop
		
	}

}
