package itwn.com.homework.task0621;

public class Task04 {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println(Lazy.getInstance());
		}).start();
		new Thread(()->{
			System.out.println(Lazy.getInstance());
		}).start();

	}
}
class Lazy{
	private static Lazy lz;
	private Lazy(){}
	public synchronized static Lazy getInstance(){
		if (lz==null){
			lz= new Lazy();
		}
		return lz;

	}
}