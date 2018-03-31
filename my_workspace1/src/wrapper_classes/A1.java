package wrapper_classes;

public class A1 {

	public static void main(String[] args) {
		
		Integer a=new Integer(20);//-boxing, java.lang.Integer.Integer(int arg0)
		Integer b=new Integer("raj");//java.lang.NumberFormatException: occurs here
		
		Double c=new Double(2.20);
		Double d=new Double("king");
		
		System.out.println("integer class1 object ;"+a);
		System.out.println("integer class2 object ;"+b);
		System.out.println("double class1 object ;"+c);
		System.out.println("double class2 object ;"+d);
		
		
		
	}

}
