package thread;

public class thread2 extends Thread
{
	public void run()
	{
		A2.a2();
		A1.a1();
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		System.out.println("d");
		System.out.println("e");
		
	}

}
