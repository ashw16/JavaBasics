package threads;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.currentThread(); // returns an obj reference t o the thread in which it is invoked
     System.out.println("current thread is:"+t);
     t.setName("MyThread"); // sets the name of the thread
     System.out.println("After name change");
     try
     {
    	 for(int i=5;i>0;i--)
    	 {
    		 System.out.println(i);
    		 Thread.sleep(1000);
    	 }
     }catch(InterruptedException e)
     {
    	 System.out.println("Mail ThreadInterrupted");
     }
}
}
