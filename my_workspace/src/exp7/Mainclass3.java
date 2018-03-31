package exp7;

import exp1.A;

public class Mainclass3 {

	public static void main(String[] args)
	{
		A.x();/*once we import any class from other package
		to the current working class in the current working 
		package, then it can be accessed from every other 
		class added to that current working  package without
		imported*/ 
		
		/*above stmt is wrong, but class will be automatically
		imported as and when u use that class property*/
		A.y();

	}

}
