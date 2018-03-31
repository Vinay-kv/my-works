package wrapper_classes;

public class A2 {

	public static void main(String[] args) {
		
		Integer a=new Integer(20);//-boxing, java.lang.Integer.Integer(int arg0)
		Integer b=new Integer("30");//-boxing
		
		Double c=new Double(2.20);
		Double d=new Double("3.20");
		
		System.out.println("integer class1 object :"+a);
		System.out.println("integer class2 object :"+b);
		System.out.println("double class1 object :"+c);
		System.out.println("double class2 object :"+d);
		
		String e=a.toString();
		
		int x1=a.intValue();//un_boxing
		int x2=b.intValue();//un_boxing
		
		double y1=c.doubleValue();
		double y2=d.doubleValue();
		
		System.out.println(""+a+","+b+","+c+","+d);
		System.out.println(""+x1+","+x2+","+y1+","+y2);
		}

}
