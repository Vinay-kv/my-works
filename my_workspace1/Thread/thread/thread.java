package thread;

public class thread extends Thread
{
	public void run()
	{
		A1.a1();
		A2.a2();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}

}
