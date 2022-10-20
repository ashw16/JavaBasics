package threads;

public class ThreadDemo1 extends Thread
{
       public void run()
       {
    	   System.out.println("Thread method");
       }
	public static void main(String[] args)
	{
 		// performing single task from multiple Threads
		ThreadDemo1 t=new ThreadDemo1();
		t.start();
		
		ThreadDemo1 t2=new ThreadDemo1();
		t2.start();
		
		ThreadDemo1 t3=new ThreadDemo1();
		t3.start();
		
	}

}
