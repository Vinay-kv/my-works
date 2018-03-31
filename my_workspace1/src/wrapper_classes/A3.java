package wrapper_classes;

public class A3 {

	public static void main(String[] args) {
		
		Integer a=20;//-auto_boxing
		//Integer b="30";//not possible
		
		Double c= 2.20;//-auto_boxing
		//Double d="3.20";
		
		System.out.println("integer class1 object :"+a);
		
		System.out.println("double class1 object :"+c);
		
		
		
		
		int x1=a;//auto_un_boxing
		double x2=c;//auto_un_boxing
		
		System.out.println(""+x1+","+x2);
		}

}
