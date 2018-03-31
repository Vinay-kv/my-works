package string;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class M2 {
    public static void main(String args[] ) throws Exception {
        
        
       Scanner sc=new Scanner(System.in);
        String line=sc.next();
        String[] a=line.split("\\.");
        
        
       
        
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
