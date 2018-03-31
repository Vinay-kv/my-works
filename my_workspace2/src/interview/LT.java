package interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] a=line.split(".");
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i].length()>3)
            {
                System.out.println("NO");
            }
            else
            {
                int b= Integer.parseInt(a[i]);
                if(b>=0&&b<=255)
                {
                   System.out.println("YES"); 
                }
                else
                {
                    System.out.println("NO"); 
                }
                
            }
            
            
        }
    }
        
}
