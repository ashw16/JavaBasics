
package threads.preventthreadexecutionmthds;

public class SleepMethod extends Thread {

public void run()
{
	 for(int i=1;i<=5;i++)
     {
    	 try
    	 {
    		Thread.sleep(1000);
    		 
    		// Thread.sleep(-1);// throws IllegalArgumentException(timeout value is negative)
    		// Thread.sleep(1000,99999999);//nanosecond timeout value out of range
    		 System.out.println(i+": "+Thread.currentThread().getName());
    		 }
    	 catch(Exception e)
    	 {
    			 System.out.println(e);
    	 }
    	// System.out.println(i);
     }
}

	public static void main(String[] args) {
		SleepMethod t = new SleepMethod();
		t.start();
		//t.run();//main
		
		SleepMethod t1 = new SleepMethod();
		t1.start();
		//t1.run(); // output:main

	}

}
