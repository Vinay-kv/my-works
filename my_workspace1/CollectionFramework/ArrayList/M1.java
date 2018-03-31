package ArrayList;

import java.util.ArrayList;

public class M1 {

	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>(10);
		
		System.out.println(a.size());
		
		a.add("v");
		a.add("i");
		a.add("n");
		a.add("a");
		a.add("y");

		System.out.println(a.size());
		
		System.out.println("elements are "+a);
		
		a.add("k");
		
		System.out.println("after adding k "+a);
		
		a.remove(2);
		
		System.out.println("after removing n "+a);
		
        a.add(2,"n");
		
		System.out.println("after adding n "+a);
	}

}
