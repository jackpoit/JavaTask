package itwn.com.test.test07;

public class Test04 {
	public static void main(String[] args) {
		TicketThread th01=new TicketThread("一号窗口");
		TicketThread th02=new TicketThread("二号窗口");
		th01.start();
		th02.start();


	}
}
class TicketThread extends Thread{
	private static int ticketCount=10;
	public TicketThread(){}
	public TicketThread(String name){
		super(name);
	}
	@Override
	public void run(){
		while (ticketCount>=0){
			System.out.println(Thread.currentThread().getName()+"卖的第"+ticketCount--+"张票");
		}

	}
}