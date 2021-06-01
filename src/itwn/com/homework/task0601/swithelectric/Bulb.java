package itwn.com.homework.task0601.swithelectric;

public class Bulb implements Electricity{
	@Override
	public void open() {
		System.out.println("开电灯");
	}

	@Override
	public void close() {
		System.out.println("关电灯");

	}
}
