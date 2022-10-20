package threads;

// we can create a thread in java 2 ways
// 1.extending thread class   2.implements Ruunable interface

// By using Extending thread class

class A extends Thread // 1.extends the thread class
{
	public void run()
	{
		System.out.println("Thread A is started:");
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception is occured");
			}
			System.out.println("value of thread i in A:"+i);
		}
		System.out.println("Thread A is exit");
		
	}
}
class B extends Thread 
{
	public void run() //2. override the  run()  method 
	{
		System.out.println("Thread b is started:");
		for(int j=1;j<=5;j++)
		{
			System.out.println("value of thread j in B:"+j);
		}
       System.out.println("Thread B is exit");
	}
}
class c extends Thread
{
	public void run()
	{
		System.out.println("Thread c is started:");
		for(int k=1;k<=5;k++)
		{
			System.out.println("value of thread j in c:"+k);
		}
       System.out.println("Thread c is exit");
	}
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
		
  A obj1=new A(); //3. object created of the class 
  B obj2=new B();
  c obj3=new c();
  
  obj1.start(); //4. to start the thread by using start() method
  // obj1.start();// runtime exception
 obj2.start(); 
 obj3.start();
	}

}
