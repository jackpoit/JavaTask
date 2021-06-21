package itwn.com.homework.task0622;

public class task02 {
	private static int count=50;
	private static int supCount=10;
	public static void main(String[] args) {
		Thread thread01=new Thread(()->{
			while (count>0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+count--);
				if (count==40){
					try {
						Thread.currentThread().join(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		},"普通：");
		Thread thread02=new Thread(()->{
			while (supCount>0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+supCount--);
			}
		},"特需：");
		thread01.setPriority(1);
		thread02.setPriority(10);
		thread01.start();
		thread02.start();
	}
}
