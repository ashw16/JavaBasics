package threads;

class BookMyShow
{
	static int total_tickets=10;
	synchronized public void bookTickets(int ticket)
	{
		if(total_tickets>=ticket)
		{
			total_tickets=total_tickets-ticket;
			System.out.println(ticket + "tickets has been booked & remaining are: "+total_tickets);
		}
		else
		{
			System.out.println("Ticket is not booked only"+total_tickets+"are available");
		}
	}
}
public class SynchronizationDemo extends Thread
{
	static BookMyShow book;
	int t;
	public void run()
	{
		book.bookTickets(t);
	}
	public static void main(String[] args)
	{
		book=new BookMyShow();
		
		SynchronizationDemo ash=new SynchronizationDemo();
		ash.t=3;
		ash.start();
		
		SynchronizationDemo ashu=new SynchronizationDemo();
		ashu.t=5;
		ashu.start();

	}

}
