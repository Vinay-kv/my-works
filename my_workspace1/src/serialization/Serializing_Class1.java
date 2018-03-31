package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializing_Class1 {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream b=new FileOutputStream("A:\\New folder (4)\\fileHandling\\serialized");//Throws exception here 
		ObjectOutputStream a=new ObjectOutputStream(b);//Throws exception here 
	    
		User_Serializable c=new User_Serializable("scott", "tiger");
		
		a.writeObject(c);
		System.out.println("object serilized");
		

	}

}
