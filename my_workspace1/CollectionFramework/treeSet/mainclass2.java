package treeSet;

import java.util.TreeSet;

public class mainclass2 {

	public static void main(String[] args) 
	{
	
	
	student s1=new student(1236, "vijay", 82.2);
	student s2=new student(7852, "aijay", 85.2);
	student s3=new student(8145, "karanth", 42.2);
	student s4=new student(4861, "umesh", 36.2);
	
	TreeSet ts=new TreeSet();
	
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	
	ts.add(s4);
	System.out.println("----------------------------------");
	System.out.println(ts.first());
	System.out.println(ts.last());
	System.out.println("----------------------------------");
	
	for(Object obj : ts)
	{
		System.out.println(obj);
		/*student st1=(student) obj;
		System.out.println(st1.marks);*/
	}
		}
		
	
	

	

}

