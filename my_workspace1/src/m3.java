
public class m3 {

	public static void main(String[] args) 
	{
		
		int a=10;
		char b='2';
		float gggg=(float) .22;
		double h=23.255;
		
		StringBuilder rrrrr=null;
		StringBuilder rr=new StringBuilder("h");
		int[]c={1,2,333333333};
		char[] d={'a','B','1','#'};
		String[] e={"i","am","vinay"};
		byte[] f={12,26,96,127};
		
		StringBuffer v=new StringBuffer("vinay,");//String as an arg
		StringBuffer x=new StringBuffer(a);//int as an arg 
		StringBuffer y=new StringBuffer();//no arg
		StringBuffer z=new StringBuffer(x);//CharSequenceas an arg
		StringBuffer zz=new StringBuffer(b);
		
		System.out.println(v);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(zz);
		
		String m=new String("vinay");
		String n=new String(d);//Character array
		String o=new String(f);//byte array
		String p=new String(m);
		String q=new String(v);//StringBuffer
		//String r=new String(rrrrr);//StringBuilder,here it will result in null pointer exception as we try to access members of reference variable pointing to null
		String r=new String(rr);
		System.out.println("###########################################################");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);

}}
/*Output

vinay,




###########################################################
vinay
aB1#
`
vinay
vinay,
h*/

