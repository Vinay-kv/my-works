package arrays;

import java.util.Arrays;

public class B1 {

	public static void main(String[] args) 
	{
		int[]a={2,8,6,8,3,5,2,4};
		int[] g={2,3};
		char[] v={'2','5'};
		
		String b=Arrays.toString(a);

		System.out.println(b);
		
		Arrays.sort(a);
		
		String c=Arrays.toString(a);
		
		System.out.println(c);
		
		System.out.println(Arrays.equals(a, a));
		System.out.println(Arrays.equals(a, g));
		
		
		
		
	}

}
