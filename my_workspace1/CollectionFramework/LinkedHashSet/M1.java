package LinkedHashSet;

import java.util.LinkedList;

public class M1 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> a=new LinkedList<>();
		
		System.out.println(a.size());
		
		a.add(1);
		
		//a.add(5, 2);//Exception in thread "main" java.lang.IndexOutOfBoundsException
		
		a.add(0, 2);
		
		a.add(2, 3);
		
		System.out.println(a);
		
		a.add(3, 4);
		
		System.out.println(a);
		
		a.add(2, 1000);
		System.out.println(a);
		
		a.g

	}

}
