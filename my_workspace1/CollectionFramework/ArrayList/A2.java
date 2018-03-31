package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A2 {

	public static void main(String[] args) 
	{
		ArrayList<b> a=new ArrayList<>();
		
		b g=new b();
		b d=new b();
		b u=new b();
		
		c h=new c();
		
		
		System.out.println(a.add(g));
		//System.out.println(a.add(1, g));
		System.out.println(g);
		System.out.println(a.add(d));
		System.out.println(d);
		System.out.println(a.add(u));
		System.out.println(u);
		System.out.println(a.add(u));
		System.out.println(u);
		System.out.println("_______________________________________________________________");
		
		Iterator<b> i=a.iterator();
		/*
		--Iterator is an interface in java.util package
		--iterator() is the method inside ArrayList class(ArrayList class is 
		present in java.util package)
		--iterator() method has the logic of providing implementation class of 
		Iterator interface
		*/
	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("_______________________________________________________________");
		
		for(/*Object*/ b n:a)
		{
			System.out.println(n);
		}
		
		System.out.println("_______________________________________________________________");
		System.out.println(a.getClass());
		a.
		
			}

}
