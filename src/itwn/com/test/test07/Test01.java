package itwn.com.test.test07;

public class Test01 {
	public static void main(String[] args) {
		ThreadDemo threadDemo=new ThreadDemo();
		threadDemo.start();

		for (int i=0;i<400;i++){
			System.out.println("主"+i);
		}
	}
}
class ThreadDemo extends Thread{
	@Override
	public void run(){
		for (int i=0;i<400;i++){
			System.out.println("次"+i+"---");
		}
	}
}
