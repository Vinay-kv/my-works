package LinkedHashSet;


import java.util.LinkedHashSet;

import ArrayList.b;

public class j1 {

	public static void main(String[] args) 
	{
		LinkedHashSet<b> g=new LinkedHashSet<b>();
		
		
		
		b o=new b();
		b d=new b();
		b u=new b();
		
		System.out.println(g.add(o));
		System.out.println(g);
		
		
		System.out.println(g.add(null));
		System.out.println(g.add(null));//only one null value can be stored
		System.out.println(g.add(null));//only one null value can be stored
		System.out.println(g.add(null));//only one null value can be stored
		
		//i think, only the difference between LinkedHashSet and HashSet is 
		//that LinkedHashSet maintains insertain order(this is the only 
		//extra facility in addition to the all the features of HashSet
		//that the LinkedHashSet contains,as the LinkedHashSet inherits HashSet class)
		
		
	}

}
