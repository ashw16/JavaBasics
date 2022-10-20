package threads.preventthreadexecutionmthds;

public class YieldMethod extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
	System.out.println(Thread.currentThread().getName()+" "+i);
}
}
public static void main(String[] args) 
{
	YieldMethod t=new YieldMethod();
	t.start();
	
	Thread.yield();// if you want main meth
	
	for(int i=1;i<=5;i++)
	{
		
		System.out.println("main thread"+i);
	}
	}

}
