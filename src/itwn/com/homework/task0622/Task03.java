package itwn.com.homework.task0622;

public class Task03 {
	public static void main(String[] args) {

		new Thread(()->{
			System.out.println(LazyTest.getInstance());
		}).start();

		new Thread(()->{
			System.out.println(LazyTest.getInstance());
		}).start();
	}

}
class LazyTest {
	private static LazyTest lz;
	private LazyTest(){}

	public synchronized static LazyTest getInstance(){
		if (lz==null) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lz=new LazyTest();
		}

		return lz;
	}




}