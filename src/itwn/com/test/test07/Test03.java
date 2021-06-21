package itwn.com.test.test07;

public class Test03 {
	public static void main(String[] args) {
		Thread th1=new Thread(){
			@Override
			public void run(){
				for (int i=0;i<100;i++){
					System.out.println("1"+i+"&&&&&&&&&&");
				}
			}
		};


		Thread th2=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0;i<100;i++){
					System.out.println("2"+i+"**********");
				}
			}
		});

		Thread th3=new Thread(()->{
			for (int i=0;i<100;i++){
				System.out.println("3"+i+"----------");
			}
		});

		th1.start();
		th2.start();
		th3.start();

	}
}
