package threads;

class TotalEarning extends Thread 
{
	int total=0;

	public void run()
	{
		synchronized (this) 
		{
			for (int i = 1; i <= 10; i++) {
				total = total + 100;
			}
			this.notify();
		}
	}
}

public class WaitMethod
{

	public static void main(String[] args) throws InterruptedException 
	{

		TotalEarning obj = new TotalEarning();
		obj.start();
		synchronized (obj)
		{
			obj.wait();
			System.out.println("Total Earning is: " + obj.total);
		}

	}

}
