package cloning;

public class CloningClass {

	public static void main(String[] args) {
		
		Student_cloneble a=new Student_cloneble(1, "sudeep", 100);
		
		System.out.println(a.name);
		System.out.println(a.id);
		System.out.println(a.Marks);
		
		Student_cloneble b=new Student_cloneble(1, "sudeep", 100);
		
		System.out.println(a);
		
		a g=new a();
		a.clone();//The method clone() from the type Object is not visible
		a.finalize();//The method finalize() from the type Object is not visible
		
		
		/* protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;*/
		
		
		
		
		

	}

}
