package threads;

class D extends Thread
{
	public void run()
	{
		System.out.println("Thread D started");
		for(int i=1;i<4;i++)
		{
			System.out.println("From Thread D:I ="+i);
		}
		System.out.println("Exit From D");
	}
}

class E extends Thread
{
	
	public void run()
	{
		System.out.println("Thread E started");
		for(int j=1;j<4;j++)
		{
			System.out.println("From Thread E: J="+j);
		}
		System.out.println("Exit From E");
	}
}

class F extends Thread
{
	public void run()
	{
		System.out.println("Thread F started");
		for(int k=1;k<4;k++)
		{
			System.out.println("From Thread F: K="+k);
		}
		System.out.println("Exit from F");
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		
		D threadD=new D();
		E threadE=new E();
		F threadF=new F();
		
		threadD.setPriority(Thread.MAX_PRIORITY);
		
		threadE.setPriority(Thread.currentThread().getPriority()+1);
		
	//	threadE.setPriority(Thread.MIN_PRIORITY);
		threadF.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println("start Thread D");
		threadD.start();
		
		System.out.println("start Thread E");
		threadE.start();
		
		System.out.println("start Thread F");
		threadF.start();
		
		System.out.println("exit from main Thread");

	}

}
