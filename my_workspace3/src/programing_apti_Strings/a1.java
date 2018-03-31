package programing_apti_Strings;

public class a1 {

	public static void main(String[] args) 
	{
		String a="bbhyyjhhhhhhiiff";
		char[] ch=a.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{
		    int k=i;
			while((i+1)<ch.length&&ch[i]==ch[i+1])
			{
				i++;
				
			}
			int l=i;
		/*	System.out.print((l-k+1)+ch[k]+",");*/
			System.out.print((l-k+1));
			System.out.print(ch[k]);
			System.out.print(",");
		}

	}

}
