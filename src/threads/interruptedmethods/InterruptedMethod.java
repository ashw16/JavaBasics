package threads.interruptedmethods;

public class InterruptedMethod extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InterruptedMethod t=new InterruptedMethod();
		t.start();
		t.interrupt();// when we use interrupt() method

	}

}
