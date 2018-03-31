package treeSet;

public class student implements Comparable 
{
	 
	int sid;
	String name;
	double marks;
	
	public student(int id, String name, double marks) {
		super();
		this.sid = id;
		this.name = name;
		this.marks = marks;
	}
		
		
		public int compareTo(Object arg0)
		{
			student st1=(student) arg0;
			int ret=this.sid-st1.sid;
					return ret;
		}
		
		
	    @Override
	    public String toString() {
		return "student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
}



	
	
