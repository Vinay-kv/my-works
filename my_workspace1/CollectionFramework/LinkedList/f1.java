package LinkedList;

import java.util.LinkedList;

import ArrayList.b;

public class f1 {

	public static void main(String[] args) 
	{
		LinkedList<b> a=new LinkedList<b>();
		
		b g=new b();
		b d=new b();
		b u=new b();
		
		System.out.println(a.add(g));
		System.out.println(g);
		System.out.println(a.add(d));
		System.out.println(d);
		System.out.println(a.add(u));
		System.out.println(u);
		System.out.println(a.add(u));
		System.out.println(u);
		
	    System.out.println(a.size());
	    
	    System.out.println(a.remove(u));
	    
	    System.out.println(a.size());
	    
	   //a.add(3, d);
	   //System.out.println(a.size());
	    
	    System.out.println(a.set(1, g));//here size is not increased,
	    System.out.println(a.get(1));
	    System.out.println(a.size());
	    System.out.println("_______________________________________________________________");
		
	    a.add(0, u);//here size has got increased,and  elements present in index 0 to last index
	    //in the previous list got shifted to one position to the front whereas this is not the situation in
	    //case of set() method
	    System.out.println(a.size());
	    System.out.println(a.get(0));
	    System.out.println(a.get(1));
	    
	    /*
	     --set method will add the specified element to the index specified, provided that index is having 
	     --previously added element(it can't add element to the (new or empty)index,this distinguishes itself
	     from add() method )  
	     */
	}

}
