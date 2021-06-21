package itwn.com.homework.task0622;

public class Task05 {

	public static void main(String[] args) {
		Ticket ticket=new Ticket();
		new Thread(()->{
			ticket.sel();
		},"一号窗口").start();
	new Thread(()->{
			ticket.sel();
		},"二号窗口").start();
		new Thread(()->{
			ticket.sel();
		},"三号窗口").start();
		new Thread(()->{
			ticket.sel();
		},"四号窗口").start();
	}

}
class Ticket{
	private volatile int count=100;
	public void sel(){
		while (true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (count <= 0) {
				break;
			}
			sellTicket();
		}
	}
	public synchronized void sellTicket(){
		System.out.println(Thread.currentThread().getName() + "卖的第" + count-- + "张票");
	}

}