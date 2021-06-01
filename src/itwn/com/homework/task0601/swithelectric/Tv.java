package itwn.com.homework.task0601.swithelectric;

public class Tv implements Electricity{
	@Override
	public void open() {
		System.out.println("开电视");
	}

	@Override
	public void close() {
		System.out.println("关电视");

	}
}
