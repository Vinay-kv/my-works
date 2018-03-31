
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
		float g=.22;
		/*by default flaoting point numbers(real numbers) are double in java
		 *In order to store them into float varible ,you need to cast them explicitly
		 *,or suffix with 'f'or 'F'*/
		float gg=.22f;
		float ggg=.22F;
		float gggg=(float) .22;
		double h=23.255;
		/*float is of single precison, that it's capacity is 4 bytes
		 * while double is of double precison,that its capacity is bytes
*/		
		
		StringBuffer v=new StringBuffer("vinay");
		String l=new String("kumar");
		
		String m=new String();
		
		String n=new String(f);
		
		
		
		System.out.println(v);
		System.out.println(g);
		System.out.println(i);
	}

}
