package file.Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {

	public static void main(String[] args) throws IOException 
	{
		File  a=new File("A:/New folder (4)/fileHandling/vinay.txt");
		FileWriter b=new FileWriter(a);
		
		
		b.write("http://www.voot.com/shows/bigg-boss-kannada-s04/4/450659/season-s-first-varada-kathe-with-sudeep/453122"+
"http://www.voot.com/shows/agnisakshi/1/367643/vasudev-orders-siddhartha-to-attend-the-meeting/372561"+
"http://www.voot.com/shows/agnisakshi/1/367643/vasudev-questions-sannidhi/372585");
		
		
		b.write("vinay");
		b.close();
		
		b.append("dfdfd");
		
		
		b.append('>');
		b.flush();
		
		
	

	}

}
