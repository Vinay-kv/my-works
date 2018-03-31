package private_methods_variable;

public class m2 {

	public static void main(String[] args) 
	{
	m1 j=new m1();
	
	
	j.a;//nonstatic private variable can't be accessed outside the class
	m1.b;//static  private variable can't be accessed outside the class
	j.b;//static  private variable can't be accessed outside the class
	j.mm();
	j.mn();//nonstatic private method() can't be accessed outside the class
	

	}

}
