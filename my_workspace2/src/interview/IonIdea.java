package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IonIdea {

	static char[] c=new char[5000];
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:/Users/Guest/Desktop/job_REGISTER_resources.txt");
		
		FileReader fr=new FileReader(f);
		
		fr.read(c);
		
		String text=new String(c);
		//System.out.println(text);
		
		System.out.println("enter search word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		boolean t=text.contains(s);
		
		if(t)
		{
			System.out.println("word is present");
		}
		else
		{
			System.out.println("word is not present");	
		}
		
		

	}

}
