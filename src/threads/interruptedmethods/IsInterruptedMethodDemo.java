package threads.interruptedmethods;

public class IsInterruptedMethodDemo extends Thread
{
public void run()
{
	System.out.println(Thread.currentThread().isInterrupted());
	try 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		//	System.out.println(Thread.interrupted());
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	public static void main(String[] args)
	{
		IsInterruptedMethodDemo  t=new IsInterruptedMethodDemo();
		t.start();
		t.interrupt();

	}

}
