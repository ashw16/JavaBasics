package threads.interruptedmethods;

public class InterruptedMethodDemo extends Thread
{

	public void run()
	{
		System.out.println(Thread.interrupted());
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public static void main(String[] args)
		{
			InterruptedMethodDemo  t=new InterruptedMethodDemo();
			t.start();
			t.interrupt();

		}

	}
