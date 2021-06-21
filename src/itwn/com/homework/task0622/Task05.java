package itwn.com.homework.task0622;

public class Task05 {

	public static void main(String[] args) {
		Ticket ticket=new Ticket();
//		new Thread(()->{
//			ticket.sellTicket();
//		},"一号窗口").start();
//	new Thread(()->{
//			ticket.sellTicket();
//		},"二号窗口").start();
//		new Thread(()->{
//			ticket.sellTicket();
//		},"三号窗口").start();
//		new Thread(()->{
//			ticket.sellTicket();
//		},"四号窗口").start();
		Thread th01=new Thread(()->{
			ticket.sellTicket();
		},"一号窗口");
		Thread th02=new Thread(()->{
			ticket.sellTicket();
		},"二号窗口");
		Thread th03=new Thread(()->{
			ticket.sellTicket();
		},"三号窗口");
		Thread th04=new Thread(()->{
			ticket.sellTicket();
		},"四号窗口");

		th01.start();
		th02.start();
		th03.start();
		th04.start();
	}

}
class Ticket{
	private static int count=100;
	public synchronized static void sellTicket(){
		while (count>0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"卖的第"+count--+"张票");

		}

	}

}