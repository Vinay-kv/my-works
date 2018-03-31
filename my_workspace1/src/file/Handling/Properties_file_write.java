package file.Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_file_write {

	public static void main(String[] args) throws IOException 
	{
		Properties a=new Properties();
		File  aa=new File("A:/New folder (4)/fileHandling/dbvinayconfig.properties");
		
		Object b=a.setProperty("db_username", "scott");
		System.out.println(b);
		
		a.setProperty("db_pwd", "vinay");
		a.setProperty("db_port", "8080");
		
		FileOutputStream fos=new FileOutputStream(aa);
		
		a.store(fos, "my db details, hi,,,");//throws exception,return void

	}

}
