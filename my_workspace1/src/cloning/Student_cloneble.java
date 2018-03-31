package cloning;

public class Student_cloneble implements Cloneable//java.lang.Cloneable
{
	int id;
	String name;
	double Marks;
	
	public Student_cloneble(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.Marks = marks;
		}

	public void hh()
	{
	
		Student_cloneble a=new Student_cloneble(10, "raj", 101);
		a.clone();
		a.finalize();
	}
	

	@Override
	/*protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}*/
	
	
	/* protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
	 * protected void finalize() throws java.lang.Throwable;*/
	

	
}
