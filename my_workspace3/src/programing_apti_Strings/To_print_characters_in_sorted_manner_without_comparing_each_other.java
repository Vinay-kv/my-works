package programing_apti_Strings;

import java.util.Scanner;

public class To_print_characters_in_sorted_manner_without_comparing_each_other 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		
		char[] ch=st.toCharArray();
		int[] a=new int[128];
		
		for (int i = 0; i < ch.length; i++) 
		{
		
			a[ch[i]]++;
		}
		
		
		for (int i = 0; i < a.length; i++) 
		{
			
	           while(a[i]>0)
				{
	        	/*System.out.print(a[i]+",");   
				System.out.print((char)a[i]+",");*///i think int array elemets can't be converted to char type
				System.out.print((char)i);
				/*System.out.println();*/
				a[i]--;
				}
			
			
		}
		
		

	}

}
