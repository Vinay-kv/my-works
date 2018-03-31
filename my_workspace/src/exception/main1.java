package exception;

public class main1 {

	public static void main(String[] args) 
	{
		System.out.println("hi");
		lala();//Cannot make a static reference to 
		//the non-static method lala() from the type main1

	}
	
	//here lala method wont be executed
	public void lala()
	{
		System.out.println("hi lala");
	}

}
