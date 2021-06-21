package itwn.com.test.test07;

import java.util.concurrent.atomic.AtomicInteger;

public class Test06 {
	private static int count=10;
	private static int count1=10;
	public static void main(String[] args) {
		Thread thread=new Thread(()->{
				while (true){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("守护线程");
				}
		});
		thread.setDaemon(true);
		thread.start();


		new Thread(()->{
			while (count>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程一:"+ count--);
			}
		}).start();

		new Thread(()->{
			while (count1>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程二:"+ count1--);
			}
		}).start();

	}
}
