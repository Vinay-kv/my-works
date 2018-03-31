package interview;

import java.util.Scanner;

public class Alacriti 
{
	
	public static void main(String args[]) throws Exception 
	 {
	       
	        Scanner s = new Scanner(System.in);
	       
	        System.out.println("enter the size");
	         int o = s.nextInt();
	   
	         System.out.println("enter the integers");
	        String  N = s.next();
	    
	        char[] b=N.toCharArray();
	        int[] c=new int[((b.length)/2)+1];
	        int u=0;
	         for (int i = 0; i < b.length; i++) 
	        {
	            while(i<b.length&&u<b.length&&b[i]!=' '&&b[i]>=48&&b[i]<=57)
	            { 
	                
	                c[u]=(int)b[i];
	                u++;
	                i++;
	            }
	        }
	         
	         
	         int count=0;
	         int m=0;
	         int n=0;
	          
	        for (int i = 0; i < c.length; i++) 
	        {
	            for (int j =(c.length)-1; j>=i; j--) 
	            {
	                if(c[i]>=c[j])
	                {
	                   int v=j-i;
	                   if(v>count)
	                   {
	                       count=v+1;
	                       m=i;
	                       n=j;
	                      
	                   }
	                    
	                }
	                
	            }
	        }
	        System.out.println(count);
	    }
	}

	

