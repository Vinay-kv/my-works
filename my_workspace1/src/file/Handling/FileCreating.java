package file.Handling;

import java.io.File;
import java.io.IOException;

public class FileCreating {
public static void main(String[] args) {
	
	File  a=new File("A:/New folder (4)/fileHandling/vinay.txt");
	
	System.out.println(a.exists());
	try 
	{
		System.out.println(a.createNewFile());
	} catch (IOException e)
	{
		
		e.printStackTrace();
	}
	
	System.out.println("file created "+a.getAbsolutePath());
}
}
