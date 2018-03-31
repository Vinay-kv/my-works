package interview;

 class MineRuntimeException extends RuntimeException
{
	 public void m()
	 {
		/* RuntimeException yy=new RuntimeException();
		 //yy.setStackTrace(null);//void java.lang.Throwable.setStackTrace(StackTraceElement[] arg0)
		 
		 StackTraceElement[] a=yy.getStackTrace();
		 System.out.println(a[0].getClassName());
		 System.out.println(a[1].getClassName());
		 //System.out.println(a[2].getClassName());
		 System.out.println();
		 System.out.println(a[0].getFileName());
		 System.out.println(a[1].getFileName());
		 System.out.println();
		 System.out.println(a[0].getLineNumber());
		 System.out.println(a[1].getLineNumber());
		 System.out.println();
		 System.out.println(a[0].getMethodName());
		 System.out.println(a[1].getMethodName());
*/		
		 
	 }
	 
	 

}
public class IonIdea2 
{
	public static void main(String[] args) 
	{
		MineRuntimeException a=new MineRuntimeException();
		
		a.m();
		
	}

}
