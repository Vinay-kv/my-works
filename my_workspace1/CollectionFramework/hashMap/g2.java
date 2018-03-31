package hashMap;

import java.util.HashMap;
import java.util.Map;



public class g2 {

	public static void main(String[] args) 
	{
		HashMap<b, c> b=new HashMap<>();
		
		b h=new b();
		b i=new b();
		
		c j=new c();
		c k=new c();
		
		//b.put(null, null);
		//b.put(null, null);
		
		
		System.out.println(b.put(h, j));
		System.out.println(b.put(i, k));
		b.entrySet();//Set<Entry<b, c>> java.util.HashMap.entrySet()
		
		
		//Map<K, V>.Entry<K, V>
		System.out.println(Map.class);
		//Map.Entry<K, V>
		
		//just for searching-Collection-Iterator-Iterable-HashSet-AbstractMap-AbstractList-HashMap-Map
		//Entry
		
		h.equals(1);
		h.equals("vinay");
		h.equals('v');
		h.equals(k);
		System.out.println(b.hashCode());//int java.util.AbstractMap.hashCode()
		System.out.println(h.hashCode());//int java.lang.Object.hashCode()
Map<>.Entry<>;


	}

}
