package file.Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_file_read1 {

	public static void main(String[] args) throws IOException 
	{
		Properties a=new Properties();
		
		FileInputStream b=new FileInputStream("A:\\New folder (4)\\fileHandling\\dbvinayconfig.properties");//Exception here
		//complete path is not mentioned here that is extension .properties of properties is not mentioned here
		
		a.load(b);
		
		System.out.println("db_username  :"+a.getProperty("db_username"));
		System.out.println("db_port  :"+a.getProperty("db_port"));
		System.out.println("db_pwd  :"+a.getProperty("db_pwd"));

	}

}
