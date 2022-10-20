package threads;

public class DaemonThreadDemo extends Thread {

	public void run() {
		// System.out.println(Thread.currentThread().isDaemon());
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon Thread");
		} else {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		// Thread.currentThread().setDaemon(true); // we cannot create main thread as
		// daemon thread
		System.out.println("Main Thread");
		DaemonThreadDemo t = new DaemonThreadDemo();
		// t.setDaemon(true);
		t.start();

	}

}
