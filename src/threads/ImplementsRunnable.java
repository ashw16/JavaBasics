package threads;

// By implementing Runnable Interface

class B1 implements Runnable //1.implements the Runnable Interface
{
	public void run() //2. override the run() method
	{
		System.out.println("Thread B1 class");
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread class in B1 is:"+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception Occured");
			}
		}
	}
}
class c1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread c1 class");
		for(int j=0;j<=5;j++)
		{
			System.out.println("Thread class in c1 is:"+j);
			
		}
	}
}
class D1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread D1 class");
		for(int k=0;k<=5;k++)
		{
			System.out.println("Thread class in D1 is:"+k);
			
			
		}
	}
}
public class ImplementsRunnable {

	public static void main(String[] args) {
		
     B1 obj1=new B1(); // 3. creating the object of class
     c1 obj2=new c1();
     D1 obj3=new D1();
     
     Thread t1=new Thread(obj1); //4. creating the object for Thread 
     Thread t2=new Thread(obj2);
     Thread t3=new Thread(obj3);
     
     t1.start();//5. invoke the method for thread
     t2.start();
     t3.start();
	}

}
