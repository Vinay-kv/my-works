package string;

public class mutable4_thread1 extends Thread
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
		
		StringBuffer d=f.s1;
		/*
		here mutable2 class s1 stringbuffer is shared to 
		mutable4_thread1 using stringbuffer REFERENCE VARIABLE D
		*/
		
		/*
		Upto to this there won't be any thread conflict between this mutable4_thread1 
		and mutable4_thread2
		*/
		
		d.append("kumar");
		System.out.println(d);
		/*
		now there may be thread conflict between this mutable4_thread1 
		and mutable4_thread2, if both try to alter any properties inside instance pointed 
		by REFERENCE VARIABLE D in their respective classes(note, d is their respective classes member)  
		at a time.
		*/
		
		/*
		Because the StringBuffer is mutable, i,e. it's properties can be changed just by calling append()
		method using the REFERENCE VARIABLE pointing to StringBuffer object, without having to creating new 
		StringBuffer object by passing desired new properties values to the constructor of StringBuffer 
		object for altering existing properties values.
		
		This property of mutable StringBuffer makes property value of StringBufer object to be changed 
		concurrently to new different values if we try to execute 
		
		mutable2 f=new mutable2();
		StringBuffer d=f.s1;
		d.append("kumar"); in  mutable4_thread1 Thread
		
		mutable2 f=new mutable2();
		StringBuffer d=f.s1;
		d.append("thimble"); in mutable4_thread2 Thread
		
		concurrently,,,,,,,,,,,
		)
		this result in "Thread Conflict" to which Thread(whether mutable4_thread1 Thread or mutable4_thread2 Thread 
		should change property value of StringBuffer.
		*/
		
		/*
		 this problem won't occur for immutable classes like String, because they will be thread safety
		 (sharing of immutable objects will be thread safety , whereas sharing of immutable objects will lead
		 to thread conflicting problems) in terms of sharing.
		 
		 But both immutable classes like String, and mutable classes like StringBuffer will lead to thread 
		 conflicting problems if they are "accessed directly" and then "ALTERED "(instead of sharing to their
		 respective Thread classes and then accessing and altering) from their object creation classes
		 between two different threads concurrently.
		 
		 */
		
		}
	}
