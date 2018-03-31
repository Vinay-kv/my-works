package programing_apti_Strings;

import java.util.Scanner;

public class To_interchange_first_and_last_character_of_every_word_in_the_sentnce 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sentence");
		
		String st=sc.nextLine();
		System.out.println(st);
		
		char[] ch=st.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int a=i;
			
			while(i < ch.length&&ch[i]!=' ')
			{
				i++;
				
			}
			char c=ch[i-1];
			ch[i-1]=ch[a];
			ch[a]=c;
			
		}
		String st1=new String(ch);
		System.out.println(st1);

	}

}
