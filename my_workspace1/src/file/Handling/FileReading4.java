package file.Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading4 {
	static char[] w=new char[1000];
	static char[] u={'a','0','&'};

	public static void main(String[] args) throws IOException 
	{
		File  a=new File("A:/New folder (4)/fileHandling/vinay.txt");
		
		FileReader b=new FileReader(a);
		FileReader c=new FileReader("A:/New folder (4)/fileHandling/vinay.txt");
		/*remind-->learn ananymous inner class*/
		
		
		System.out.println(b.read());
		System.out.println(c.read());
		
		BufferedReader v=new BufferedReader(b);
		
		System.out.println(v.readLine());
		System.out.println(v.read());
		System.out.println(v.read());

	}

}
