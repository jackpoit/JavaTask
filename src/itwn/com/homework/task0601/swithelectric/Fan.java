package itwn.com.homework.task0601.swithelectric;

public class Fan implements Electricity{
	@Override
	public void open() {
		System.out.println("开电风扇");
	}

	@Override
	public void close() {
		System.out.println("关电风扇");

	}
}
