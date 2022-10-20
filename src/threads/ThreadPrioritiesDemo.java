package threads;

public class ThreadPrioritiesDemo extends Thread
{
    public void run()
    {
    	System.out.println("child thread");
    	System.out.println(Thread.currentThread().getPriority());//priority set as 10

    }
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());// by default 5
		ThreadPrioritiesDemo t=new ThreadPrioritiesDemo();
		t.setPriority(10);
		t.start();

	}

}
