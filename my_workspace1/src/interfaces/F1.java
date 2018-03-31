package interfaces;

public interface F1
{
	int a=10;
	static b=20; //static fields can't be used inside interface
	// oh sorry variable type is not declared above
	static int b=20; 
	final static int gz=10;
	public F1()//Interfaces cannot have constructors
	{
		
	}
	
	
	void h()//i think implementation can be provided inside interface
	{
		System.out.println("vinay");	
	}
	private void hh();//Illegal modifier for the interface method hh; 
	//only public, abstract, default, static and strictfp are permitted
	abstract void hhh();
	
	int add();//non static method declaration
	
	static int sub();//This method requires a body instead of a semicolon
	
	/*solution is that we should add body to sub() method,
	or change it abstract by removing static keyword*/
	
	/*so the conclusion is that we can declare static method() inside interface,
	provided that we should implement that method inside interface only*/
	
	static int mul()
	{
		return 1;
	}
	

}
