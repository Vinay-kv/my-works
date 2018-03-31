package exp7;

import exp1.A;/* to use the properties of class present in 
other packages either by instance creation or by using it's 
class name, we must need to import that class*/

class Mainclass1 {

	public static void main(String[] args) 
	{
		A h=new A();
		A.x();
		A.y();
		h.x();
		h.y();
		
		

	}

}
