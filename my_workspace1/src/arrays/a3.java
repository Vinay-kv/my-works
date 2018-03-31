package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class a3 
{
	int a[]=new int[5];
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of aray");
		int g=sc.nextInt();
		
		
		int[] a=new int[g];
		
		System.out.println("enter the elements of array");
		
		for (int i = 0; i < a.length; i++) 
		{
		   a[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < a.length; i++)
		{
		System.out.print(a[i]);	
		System.out.print(" ,");
		}
		
	
	

	}

}
