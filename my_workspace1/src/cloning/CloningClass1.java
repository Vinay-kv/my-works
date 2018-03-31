package cloning;

public class CloningClass1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student_cloneble a1=new Student_cloneble(1, "sudeep", 100);
		
		System.out.println(a1.name);
		System.out.println(a1.id);
		System.out.println(a1.Marks);
		
		Student_cloneble a2=new Student_cloneble(1, "sudeep", 100);
		System.out.println(a1);
		System.out.println(a2);
		
		Student_cloneble c1=(Student_cloneble) a1.clone();
		System.out.println(c1);
		
		System.out.println(c1.name);
		System.out.println(c1.id);
		System.out.println(c1.Marks);
		
	
		
		
		
		
		
		}

}
