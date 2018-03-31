package forname_method;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException {
	
		h a=new h();
		a.A=15;//java is case sensitive
		
		System.out.println("program starts");
		Class.forName("farname_method.h");
		System.out.println("program ends");
		
	
		
		
	}

}
