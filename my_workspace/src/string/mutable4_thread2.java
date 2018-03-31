package string;

public class mutable4_thread2 extends Thread
{
	/*
	void run()  [Cannot reduce the visibility of the inherited method from 
	Thread,change method visibility to public]
	{              
		
	}
	*/
	
	public void run()
	{
        mutable2 f=new mutable2();
		
		StringBuffer d=f.s1;//here mutable2 class s1 stringbuffer is shared to 
		//mutable4_thread1 using stringbuffer REFERENCE VARIABLE D
		
		//upto to this there won't be any thread conflict between this mutable4_thread1 
		//and mutable4_thread2
		
		d.append("thimble");
		System.out.println(d);
	}
	
	
	

}
