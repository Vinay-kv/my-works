package programing_apti_Strings;

import java.util.Scanner;

public class To_count_how_many_times_substring_is_present_in_the_mainstring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the main string");
		
		String main=sc.nextLine();
		System.out.println(main);
		
		System.out.println("enter the sub string");
		
		String sub=sc.nextLine();
		System.out.println(sub);
		
		char[] ch1=main.toCharArray();
		char[] ch2=sub.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < ch1.length; i++) 
		{
			
			int a=0;
			
			while(a<ch2.length&&(i+a)<ch1.length&&ch1[i+a]==ch2[a])
			{
				a++;
				
			}
			if(a==(ch2.length))
			{
				
				count++;
			}
		}
		
		System.out.println("the number of times sub string present in the main string is: "+count);
		
		
	}

}

/*
 * output 1
enter the main string
fhdhfjhahajhcjhdjhahahhdjvhdhahahjshjhsfhahahhjhhaha
fhdhfjhahajhcjhdjhahahhdjvhdhahahjshjhsfhahahhjhhaha
enter the sub string
haha
haha
the number of times sub string present in the main string is: 5

output2

enter the main string
fhdhfjhahajhcjhdjhahahhdjvhdhahahjshjhsfhahahhjhhahahaha
fhdhfjhahajhcjhdjhahahhdjvhdhahahjshjhsfhahahhjhhahahaha
enter the sub string
haha
haha
the number of times sub string present in the main string is: 7


*/
