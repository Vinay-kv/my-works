package string;

public class mutable3 {

	public static void main(String[] args) 
	{
		mutable2 f=new mutable2();
		
		StringBuffer d=f.s1;/*Here we are copying the object referrence address
		of StringBuffer object pointed by s1 variable in mutable2 class.
		
		This is nothing but "WE ARE SHARING STRINGBUFFER OBJECT BETWEEN MUTABLE2 
		CLASS USING REFERENCE VARIABLE S1 AND MUTABLE3 CLASS  USING StringBuffer
		REFERENCE VARIABLE D".
		
		And this type object sharing  is nessesery for
		1. */	
		System.out.println("before changing object");
		f.nn();
		
		d.append("kumar");
		
		System.out.println("after changing object");
		f.nn();
		/*
		 so we can't use mutable object like StringBuffer for sharing between 
		 multiple classes, because  we can edit object fields in other class(MUTABLE3 CLASS)
		 and it will reflect in the origin object
		 
		  if we change fields of object in other class it should not reflect in other class,
		  this stops mutable objects from being sharing
		  
		 */
		System.out.println(d);
		
		}

}
