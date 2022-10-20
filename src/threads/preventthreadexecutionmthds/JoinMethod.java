package threads.preventthreadexecutionmthds;

public class JoinMethod extends Thread
{
	static Thread mainthread;// instance variable
	public void run()
	{
		try
		{
			mainthread.join();// join() method with reference
			
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		mainthread=Thread.currentThread();// main thread reference for this we are creating instance var
		 JoinMethod t=new  JoinMethod();
		 t.start();
		 
		// t.join();  // executing main thread wait                                                                
		 try
		 {
			 for(int i=1;i<=5;i++)
			 {
				 System.out.println("main thread"+i);
				 Thread.sleep(1000);
			 }
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }

	}

}
