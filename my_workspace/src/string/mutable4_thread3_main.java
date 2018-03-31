package string;

public class mutable4_thread3_main {

	public static void main(String[] args) 
	{
		mutable4_thread1 a=new mutable4_thread1();	
		mutable4_thread2 b=new mutable4_thread2();	
		mutable2 c=new mutable2();
		
		a.setPriority(9);
		b.setPriority(9);
		c.setPriority(1);
		a.start();
		b.start();
		c.start();
		
		
		
        //mutable2 f=new mutable2();
		
		//System.out.println(f.s1);
		
		

	}

}
