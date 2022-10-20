package threads;

// Thread class methods getName(), setName(), currentThread(), isAlive()
public class ThreadNameDemo extends Thread
{
   
	public void run()
	{
		System.out.println(Thread.currentThread().getName());// Thread-0
//		Thread.currentThread().setName("raj");
//		System.out.println(Thread.currentThread().getName());// raj
		System.out.println("thread task"); // thread task
	}
	public static void main(String[] args) {

		System.out.println("hello"); // hello
		System.out.println(Thread.currentThread().getName());// main (Jvm will handle)

		Thread.currentThread().setName("ashu");// changing the main name to ashu

		System.out.println(Thread.currentThread().getName());// ashu
		//System.out.println(10 / 0);// exception in thread "ashu"
		
		ThreadNameDemo t1=new ThreadNameDemo();// Thread-0
		t1.start();

		ThreadNameDemo t2=new ThreadNameDemo();// Thread-1
		t2.setName("varru");
		t2.start();
		
		System.out.println(Thread.currentThread().isAlive());// true
		System.out.println(t2.isAlive());//true

	}

}
