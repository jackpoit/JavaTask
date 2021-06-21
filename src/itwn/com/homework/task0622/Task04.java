package itwn.com.homework.task0622;

public class Task04 {
	public static void main(String[] args) {
		Count count=new Count();
		new Thread(()->{
			count.getMoney(700);
		},"支付宝").start();


		new Thread(()->{
			count.getMoney(700);
		},"微信").start();


	}

}
class Count{
	private int money=1300;
	public synchronized void getMoney(int money){
		if (this.money>money){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.money-=money;
			System.out.println(Thread.currentThread().getName()+"取了"+money+"元，剩余"+this.money);
		}else {
			System.out.println(Thread.currentThread().getName()+"余额不足取不了钱"+this.money);
		}

	}

}
