package itwn.com.homework.task0622;

public class Test {

	public static void main(String[] args) {
		TicketThread th01=new TicketThread("一号窗口:");
		TicketThread th02=new TicketThread("二号窗口:");
		TicketThread th03=new TicketThread("三号窗口:");
		TicketThread th04=new TicketThread("四号窗口:");

		th02.start();//Thread-0
		th01.start();//Thread-1
		th03.start();//Thread-0
		th04.start();//Thread-1

	}
}

class TicketThread extends Thread{
	private static int ticketCount=100;
	public TicketThread(String name) {
		super(name);
	}
	public TicketThread() {

	}
	@Override
	public synchronized void run() {
		while(true) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正则售卖"+ticketCount--+"号票");
			if(ticketCount<=0) {
				break;
			}
		}
	}
}