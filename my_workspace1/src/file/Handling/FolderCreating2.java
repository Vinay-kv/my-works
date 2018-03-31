package file.Handling;

import java.io.File;

public class FolderCreating2 {
public static void main(String[] args) {
	File  a=new File("A:/New folder (4)/fileHandling");
	System.out.println(a.mkdir());

	File  b=new File("A:/New folder (4)/Films");
	System.out.println(a.mkdir());
	System.out.println(b.mkdir());
	
	System.out.println(a.exists());
	System.out.println(b.exists());
	
	System.out.println(a.getAbsolutePath());
}
}
