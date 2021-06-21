package itwn.com.test.test07;

import java.util.Timer;

public class Test05 {
	public static void main(String[] args) {
		TicketRun ticketRun=new TicketRun();
		Thread th01=new Thread(ticketRun);
		Thread th02=new Thread(ticketRun);
		th01.setName("一号窗口");
		th02.setName("二号窗口");
		th01.start();
		th02.start();

	}

}
class TicketRun implements Runnable{
	private int count=10;
	@Override
	public void run() {
		while (count>0){
			System.out.println(Thread.currentThread().getName()+"卖的第"+count--+"张票");
		}
	}
}