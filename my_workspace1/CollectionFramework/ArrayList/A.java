package ArrayList;

import java.util.ArrayList;

public class A {

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
		
		System.out.println(a.size());
		
		System.out.println(a.remove(1));
		System.out.println(a.size());
		
		System.out.println(a.remove(u));
		System.out.println(a.size());
		
		Object[] b=new Object[5];//it is not any primitive data type(int, float,,,) array,but it is 
		//object type array
		//think,,,,,,,,,,,,
		//answer is object is super class to all the primitive data types
		
		b[] y=new b[2];
		y[0]=new b();
		
		//now u got confused na,,,,
		//finally we can conclude that arrray can store both primitive data type and instanses 
		//of any classes
		
		
		
		

	}

}
