package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializing_class {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream aa=new FileInputStream("A:\\New folder (4)\\fileHandling\\serialized");
		ObjectInputStream a=new ObjectInputStream(aa);
		
		User_Serializable c=(User_Serializable) a.readObject();
		
		System.out.println(c.username);
		System.out.println(c.password);

	}

}
