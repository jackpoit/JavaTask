package itwn.com.test.test07;

public class Test02 {
	public static void main(String[] args) {
		ThreadDemo1 threadDemo=new ThreadDemo1();
		Thread th=new Thread(threadDemo);
		th.start();

		for (int i=0;i<400;i++){
			System.out.println("主"+i);
		}
	}

}
class ThreadDemo1 implements Runnable{
	@Override
	public void run(){
		for (int i=0;i<400;i++){
			System.out.println("次"+i+"---");
		}
	}
}
