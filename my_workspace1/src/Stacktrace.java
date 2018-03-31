
public class Stacktrace {

	public static void main(String[] args) {
		
		RuntimeException a=new RuntimeException();
		
		System.out.println(a);
		System.out.println();
		System.out.println(a.getStackTrace());
		System.out.println();
		System.out.println(a.getMessage());
		
		

	}

}
