package final_variable;

public class j3 {

	public static void main(String[] args) 
	{
		j1 n=new j1();
		
		
		n.a=45;//final nonstatic field can't be reinitialized
		n.b=85;
		j1.b=45;//final static field can't be reinitialized
		

	}

}
