package programing_apti_Strings;

import java.util.Scanner;

public class Which_Word_Containg_more_Vowels_in_a_Sentence {

	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sentence");
		
		String sen=sc.nextLine();
		System.out.println("checking");
		char[] ch=sen.toCharArray();*/
		String sen="ao at aeiou aeiouuuu";
		System.out.println("checking");
		char[] ch=sen.toCharArray();
		int count=0;
		int word=0;
		
		for (int i = 0; i < ch.length; i++) 
		{
			int a=i;
			int d=0;
			int c=0;
			
			while(i < ch.length&&ch[i]!=' ')
			{
				i++;
				System.out.println("checking1");
			}
			int b=i;
			
			while(a<b)
			{
				
				if(ch[a]=='a'||ch[a]=='e'||ch[a]=='i'||ch[a]=='o'||ch[a]=='u')
				{
					c++;
					System.out.println("checking2");
				}
				d=c;
				a++;
			}
			if(d>count)
			{
				count=d;
				word=a;
			}
			System.out.println("checking3");
		}
		int h=word;
		System.out.println(h);
		System.out.println("the word with maximum vowels is..");
		while(ch[h]!=' ')
		{
			System.out.print(ch[h]);
			h++;
		}
		System.out.println(", with "+count+" number of vowels");

	}

}
