
public class m2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;
		int aa=10.0;//Type mismatch: cannot convert from double to int
		int aaa=(int) 10.0;
		char b='2';
		int[]c={1,2,333333333};
		int[]cc={1,2,3333333333};
		int[]ccc={1,2,1333333333};
		char[] d={'a','B','1','#'};
		String[] e={"i","am","vinay"};
		byte[] f={12,26,96,127};
		byte[] f={12,26,96,127,128};//adding 128 will give compilation error
		//as byte can store maximum of 1 byte data
		float g=1.2;

		StringBuffer v=new StringBuffer("vinay");
		String g=new String("kumar");
		
		String i=new String();
		
		String i=new String(f);
		
		
		
		System.out.println(v);
		System.out.println(g);
		System.out.println(i);
	}

}
