package Class.forName_newInstance;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Mainclass 
{
	
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
   {
	
	   Class a=Class.forName("Class.forName_newInstance.Student");//throws ClassNotFoundException 
	   
	   Field[] b=a.getFields();
	   System.out.println(b.length);
	   System.out.println(b[0]);
	   System.out.println(b[1]);
	   
	   System.out.println(a.newInstance().getClass().getName());
	   
	   Method[] o=a.getDeclaredMethods();
	   
	   System.out.println(o.length);
	   System.out.println(o[0]);
	   System.out.println(o[1]);
	   
	   
	   
	  /* Class v=Student.class;
	   
	   Object k=v.newInstance();//throws InstantiationException, IllegalAccessException
	   
	   System.out.println(k.getClass().getName());*/
   }

}

 class Student
{
	 public int a=10;
	public char b='1';
public static void main(String[] args) 
{
	
}	

public void lala()
{
	
}
}
