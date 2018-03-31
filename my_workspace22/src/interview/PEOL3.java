package interview;

import java.util.Scanner;

public class PEOL3 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the String to be Started");
		
		String st=sc.nextLine();
		
		System.out.println("entered String is "+st);
		
		char[] chArray=st.toCharArray();
		
		st="";
		
		for (int i = 0; i < chArray.length; i++) 
		{
			while(chArray[i]=' ')//Type mismatch: cannot convert from char to boolean
			{
				
			}
			
		}

	}

}
