package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class e {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		
       ArrayList<String> al1=new ArrayList<>();
		
		al1.add("ravi");
		al1.add("hanumat");
		
		al.retainAll(al1);
		
		Iterator<String> i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
			}

}
