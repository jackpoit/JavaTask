package itwn.com.test.test07;

public class Test07 {
	private static int count=50;
	private static int superCount=10;

	public static void main(String[] args) {
			Thread thread01=new Thread(()->{
				while (count>0){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("普通看病"+count--);
						try {
							if (count==40) {
								Thread.currentThread().join(6000);
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}
			});

		Thread thread02=new Thread(()->{
			while (superCount>0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("特需看病"+superCount--);
			}

		});

		thread02.setPriority(7);
		thread01.start();
		thread02.start();



	}
}
