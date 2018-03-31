package file.Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {
	static char[] w=new char[292];
	static char[] u={'a','0','&'};

	public static void main(String[] args) throws IOException 
	{
		File  a=new File("A:/New folder (4)/fileHandling/vinay.txt");
		
		FileReader b=new FileReader(a);
		FileReader c=new FileReader("A:/New folder (4)/fileHandling/vinay.txt");
		/*remind-->learn ananymous inner class*/
		
		
		System.out.println(b.read());
		System.out.println(c.read());
		
		for (int i = 0; i < w.length; i++) 
		{
		System.out.print((int)w[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < w.length; i++)
		{
			System.out.print(w[i]);//why the output will be square box when u execute without casting 
			//what is the default value stored for char[] array then
		}
		System.out.println();
		
		for (int i = 0; i < u.length; i++) 
		{
		System.out.print((int)u[i]+",");
		}
		
		System.out.println();
		
		for (int i = 0; i < u.length; i++)
		{
			System.out.print(u[i]+",");
		}
		
		System.out.println();
		System.out.println(b.read(w));
		for (int i = 0; i < w.length; i++) 
		{
		System.out.print(w[i]);	
		}
		System.out.println();
		System.out.println('a');
		System.out.println('5');
		System.out.println('0');
		

	}

}
